package domanska.klaudia.lab_11_15.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import domanska.klaudia.lab_11_15.data.dao.RefuellingDAO;
import domanska.klaudia.lab_11_15.data.dao.RefuellingDAO_Impl;
import domanska.klaudia.lab_11_15.data.dao.VehicleDAO;
import domanska.klaudia.lab_11_15.data.dao.VehicleDAO_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile VehicleDAO _vehicleDAO;

  private volatile RefuellingDAO _refuellingDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Vehicle` (`brand` TEXT NOT NULL, `model` TEXT NOT NULL, `licensePlate` TEXT NOT NULL, `check_date` INTEGER NOT NULL, `uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Refueling` (`vehicle_id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `price` REAL NOT NULL, `price_per_liter` REAL, `place` TEXT, `mileage` INTEGER, `consumption` REAL, `distance_since_refuelled` INTEGER, `uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fa47932af070c6f67505dee7660ecd7b')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Vehicle`");
        _db.execSQL("DROP TABLE IF EXISTS `Refueling`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsVehicle = new HashMap<String, TableInfo.Column>(5);
        _columnsVehicle.put("brand", new TableInfo.Column("brand", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVehicle.put("model", new TableInfo.Column("model", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVehicle.put("licensePlate", new TableInfo.Column("licensePlate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVehicle.put("check_date", new TableInfo.Column("check_date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVehicle.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVehicle = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVehicle = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVehicle = new TableInfo("Vehicle", _columnsVehicle, _foreignKeysVehicle, _indicesVehicle);
        final TableInfo _existingVehicle = TableInfo.read(_db, "Vehicle");
        if (! _infoVehicle.equals(_existingVehicle)) {
          return new RoomOpenHelper.ValidationResult(false, "Vehicle(domanska.klaudia.lab_11_15.data.entity.Vehicle).\n"
                  + " Expected:\n" + _infoVehicle + "\n"
                  + " Found:\n" + _existingVehicle);
        }
        final HashMap<String, TableInfo.Column> _columnsRefueling = new HashMap<String, TableInfo.Column>(9);
        _columnsRefueling.put("vehicle_id", new TableInfo.Column("vehicle_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefueling.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefueling.put("price", new TableInfo.Column("price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefueling.put("price_per_liter", new TableInfo.Column("price_per_liter", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefueling.put("place", new TableInfo.Column("place", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefueling.put("mileage", new TableInfo.Column("mileage", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefueling.put("consumption", new TableInfo.Column("consumption", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefueling.put("distance_since_refuelled", new TableInfo.Column("distance_since_refuelled", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefueling.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRefueling = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRefueling = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRefueling = new TableInfo("Refueling", _columnsRefueling, _foreignKeysRefueling, _indicesRefueling);
        final TableInfo _existingRefueling = TableInfo.read(_db, "Refueling");
        if (! _infoRefueling.equals(_existingRefueling)) {
          return new RoomOpenHelper.ValidationResult(false, "Refueling(domanska.klaudia.lab_11_15.data.entity.Refueling).\n"
                  + " Expected:\n" + _infoRefueling + "\n"
                  + " Found:\n" + _existingRefueling);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "fa47932af070c6f67505dee7660ecd7b", "6b8fdecb267317fa33d53924bcf92db1");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Vehicle","Refueling");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Vehicle`");
      _db.execSQL("DELETE FROM `Refueling`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(VehicleDAO.class, VehicleDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(RefuellingDAO.class, RefuellingDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public VehicleDAO vehicleDao() {
    if (_vehicleDAO != null) {
      return _vehicleDAO;
    } else {
      synchronized(this) {
        if(_vehicleDAO == null) {
          _vehicleDAO = new VehicleDAO_Impl(this);
        }
        return _vehicleDAO;
      }
    }
  }

  @Override
  public RefuellingDAO refuellingDao() {
    if (_refuellingDAO != null) {
      return _refuellingDAO;
    } else {
      synchronized(this) {
        if(_refuellingDAO == null) {
          _refuellingDAO = new RefuellingDAO_Impl(this);
        }
        return _refuellingDAO;
      }
    }
  }
}
