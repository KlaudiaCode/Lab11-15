package domanska.klaudia.lab_11_15.data.dao;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import domanska.klaudia.lab_11_15.data.Converters;
import domanska.klaudia.lab_11_15.data.entity.Refueling;
import domanska.klaudia.lab_11_15.data.entity.Vehicle;
import domanska.klaudia.lab_11_15.data.entity.VehicleWithRefuellings;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class VehicleDAO_Impl implements VehicleDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Vehicle> __insertionAdapterOfVehicle;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Vehicle> __deletionAdapterOfVehicle;

  private final EntityDeletionOrUpdateAdapter<Vehicle> __updateAdapterOfVehicle;

  public VehicleDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVehicle = new EntityInsertionAdapter<Vehicle>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Vehicle` (`brand`,`model`,`licensePlate`,`check_date`,`uid`) VALUES (?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Vehicle value) {
        if (value.getBrand() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getBrand());
        }
        if (value.getModel() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getModel());
        }
        if (value.getLicensePlate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLicensePlate());
        }
        final Long _tmp;
        _tmp = __converters.localDateToTimestamp(value.getCheckDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        stmt.bindLong(5, value.getUid());
      }
    };
    this.__deletionAdapterOfVehicle = new EntityDeletionOrUpdateAdapter<Vehicle>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Vehicle` WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Vehicle value) {
        stmt.bindLong(1, value.getUid());
      }
    };
    this.__updateAdapterOfVehicle = new EntityDeletionOrUpdateAdapter<Vehicle>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Vehicle` SET `brand` = ?,`model` = ?,`licensePlate` = ?,`check_date` = ?,`uid` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Vehicle value) {
        if (value.getBrand() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getBrand());
        }
        if (value.getModel() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getModel());
        }
        if (value.getLicensePlate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLicensePlate());
        }
        final Long _tmp;
        _tmp = __converters.localDateToTimestamp(value.getCheckDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        stmt.bindLong(5, value.getUid());
        stmt.bindLong(6, value.getUid());
      }
    };
  }

  @Override
  public Object insert(final Vehicle vehicle, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfVehicle.insert(vehicle);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Vehicle vehicle, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfVehicle.handle(vehicle);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Vehicle vehicle, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfVehicle.handle(vehicle);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Vehicle>> getAll() {
    final String _sql = "SELECT * FROM Vehicle";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Vehicle"}, false, new Callable<List<Vehicle>>() {
      @Override
      public List<Vehicle> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfModel = CursorUtil.getColumnIndexOrThrow(_cursor, "model");
          final int _cursorIndexOfLicensePlate = CursorUtil.getColumnIndexOrThrow(_cursor, "licensePlate");
          final int _cursorIndexOfCheckDate = CursorUtil.getColumnIndexOrThrow(_cursor, "check_date");
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final List<Vehicle> _result = new ArrayList<Vehicle>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Vehicle _item;
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final String _tmpModel;
            if (_cursor.isNull(_cursorIndexOfModel)) {
              _tmpModel = null;
            } else {
              _tmpModel = _cursor.getString(_cursorIndexOfModel);
            }
            final String _tmpLicensePlate;
            if (_cursor.isNull(_cursorIndexOfLicensePlate)) {
              _tmpLicensePlate = null;
            } else {
              _tmpLicensePlate = _cursor.getString(_cursorIndexOfLicensePlate);
            }
            final LocalDate _tmpCheckDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfCheckDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfCheckDate);
            }
            _tmpCheckDate = __converters.fromTimestampToLocalDate(_tmp);
            final int _tmpUid;
            _tmpUid = _cursor.getInt(_cursorIndexOfUid);
            _item = new Vehicle(_tmpBrand,_tmpModel,_tmpLicensePlate,_tmpCheckDate,_tmpUid);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<VehicleWithRefuellings> getVehicleWithRefuellings(final int id) {
    final String _sql = "SELECT * FROM Vehicle WHERE uid = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Refueling","Vehicle"}, true, new Callable<VehicleWithRefuellings>() {
      @Override
      public VehicleWithRefuellings call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
            final int _cursorIndexOfModel = CursorUtil.getColumnIndexOrThrow(_cursor, "model");
            final int _cursorIndexOfLicensePlate = CursorUtil.getColumnIndexOrThrow(_cursor, "licensePlate");
            final int _cursorIndexOfCheckDate = CursorUtil.getColumnIndexOrThrow(_cursor, "check_date");
            final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
            final LongSparseArray<ArrayList<Refueling>> _collectionRefuellings = new LongSparseArray<ArrayList<Refueling>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfUid);
              ArrayList<Refueling> _tmpRefuellingsCollection = _collectionRefuellings.get(_tmpKey);
              if (_tmpRefuellingsCollection == null) {
                _tmpRefuellingsCollection = new ArrayList<Refueling>();
                _collectionRefuellings.put(_tmpKey, _tmpRefuellingsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipRefuelingAsdomanskaKlaudiaLab1115DataEntityRefueling(_collectionRefuellings);
            final VehicleWithRefuellings _result;
            if(_cursor.moveToFirst()) {
              final Vehicle _tmpVehicle;
              if (! (_cursor.isNull(_cursorIndexOfBrand) && _cursor.isNull(_cursorIndexOfModel) && _cursor.isNull(_cursorIndexOfLicensePlate) && _cursor.isNull(_cursorIndexOfCheckDate) && _cursor.isNull(_cursorIndexOfUid))) {
                final String _tmpBrand;
                if (_cursor.isNull(_cursorIndexOfBrand)) {
                  _tmpBrand = null;
                } else {
                  _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
                }
                final String _tmpModel;
                if (_cursor.isNull(_cursorIndexOfModel)) {
                  _tmpModel = null;
                } else {
                  _tmpModel = _cursor.getString(_cursorIndexOfModel);
                }
                final String _tmpLicensePlate;
                if (_cursor.isNull(_cursorIndexOfLicensePlate)) {
                  _tmpLicensePlate = null;
                } else {
                  _tmpLicensePlate = _cursor.getString(_cursorIndexOfLicensePlate);
                }
                final LocalDate _tmpCheckDate;
                final Long _tmp;
                if (_cursor.isNull(_cursorIndexOfCheckDate)) {
                  _tmp = null;
                } else {
                  _tmp = _cursor.getLong(_cursorIndexOfCheckDate);
                }
                _tmpCheckDate = __converters.fromTimestampToLocalDate(_tmp);
                final int _tmpUid;
                _tmpUid = _cursor.getInt(_cursorIndexOfUid);
                _tmpVehicle = new Vehicle(_tmpBrand,_tmpModel,_tmpLicensePlate,_tmpCheckDate,_tmpUid);
              }  else  {
                _tmpVehicle = null;
              }
              ArrayList<Refueling> _tmpRefuellingsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfUid);
              _tmpRefuellingsCollection_1 = _collectionRefuellings.get(_tmpKey_1);
              if (_tmpRefuellingsCollection_1 == null) {
                _tmpRefuellingsCollection_1 = new ArrayList<Refueling>();
              }
              _result = new VehicleWithRefuellings(_tmpVehicle,_tmpRefuellingsCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Vehicle> get(final int id) {
    final String _sql = "SELECT * FROM vehicle WHERE uid = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"vehicle"}, false, new Callable<Vehicle>() {
      @Override
      public Vehicle call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfModel = CursorUtil.getColumnIndexOrThrow(_cursor, "model");
          final int _cursorIndexOfLicensePlate = CursorUtil.getColumnIndexOrThrow(_cursor, "licensePlate");
          final int _cursorIndexOfCheckDate = CursorUtil.getColumnIndexOrThrow(_cursor, "check_date");
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final Vehicle _result;
          if(_cursor.moveToFirst()) {
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final String _tmpModel;
            if (_cursor.isNull(_cursorIndexOfModel)) {
              _tmpModel = null;
            } else {
              _tmpModel = _cursor.getString(_cursorIndexOfModel);
            }
            final String _tmpLicensePlate;
            if (_cursor.isNull(_cursorIndexOfLicensePlate)) {
              _tmpLicensePlate = null;
            } else {
              _tmpLicensePlate = _cursor.getString(_cursorIndexOfLicensePlate);
            }
            final LocalDate _tmpCheckDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfCheckDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfCheckDate);
            }
            _tmpCheckDate = __converters.fromTimestampToLocalDate(_tmp);
            final int _tmpUid;
            _tmpUid = _cursor.getInt(_cursorIndexOfUid);
            _result = new Vehicle(_tmpBrand,_tmpModel,_tmpLicensePlate,_tmpCheckDate,_tmpUid);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipRefuelingAsdomanskaKlaudiaLab1115DataEntityRefueling(
      final LongSparseArray<ArrayList<Refueling>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<Refueling>> _tmpInnerMap = new LongSparseArray<ArrayList<Refueling>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipRefuelingAsdomanskaKlaudiaLab1115DataEntityRefueling(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<Refueling>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipRefuelingAsdomanskaKlaudiaLab1115DataEntityRefueling(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `vehicle_id`,`date`,`price`,`price_per_liter`,`place`,`mileage`,`consumption`,`distance_since_refuelled`,`uid` FROM `Refueling` WHERE `vehicle_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "vehicle_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfVehicleId = CursorUtil.getColumnIndexOrThrow(_cursor, "vehicle_id");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfPricePerLiter = CursorUtil.getColumnIndexOrThrow(_cursor, "price_per_liter");
      final int _cursorIndexOfPlace = CursorUtil.getColumnIndexOrThrow(_cursor, "place");
      final int _cursorIndexOfMileage = CursorUtil.getColumnIndexOrThrow(_cursor, "mileage");
      final int _cursorIndexOfConsumption = CursorUtil.getColumnIndexOrThrow(_cursor, "consumption");
      final int _cursorIndexOfDistanceSinceRefuelled = CursorUtil.getColumnIndexOrThrow(_cursor, "distance_since_refuelled");
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<Refueling> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final Refueling _item_1;
          final int _tmpVehicleId;
          _tmpVehicleId = _cursor.getInt(_cursorIndexOfVehicleId);
          final LocalDate _tmpDate;
          final Long _tmp;
          if (_cursor.isNull(_cursorIndexOfDate)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getLong(_cursorIndexOfDate);
          }
          _tmpDate = __converters.fromTimestampToLocalDate(_tmp);
          final double _tmpPrice;
          _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
          final Double _tmpPricePerLiter;
          if (_cursor.isNull(_cursorIndexOfPricePerLiter)) {
            _tmpPricePerLiter = null;
          } else {
            _tmpPricePerLiter = _cursor.getDouble(_cursorIndexOfPricePerLiter);
          }
          final String _tmpPlace;
          if (_cursor.isNull(_cursorIndexOfPlace)) {
            _tmpPlace = null;
          } else {
            _tmpPlace = _cursor.getString(_cursorIndexOfPlace);
          }
          final Integer _tmpMileage;
          if (_cursor.isNull(_cursorIndexOfMileage)) {
            _tmpMileage = null;
          } else {
            _tmpMileage = _cursor.getInt(_cursorIndexOfMileage);
          }
          final Double _tmpConsumption;
          if (_cursor.isNull(_cursorIndexOfConsumption)) {
            _tmpConsumption = null;
          } else {
            _tmpConsumption = _cursor.getDouble(_cursorIndexOfConsumption);
          }
          final Integer _tmpDistanceSinceRefuelled;
          if (_cursor.isNull(_cursorIndexOfDistanceSinceRefuelled)) {
            _tmpDistanceSinceRefuelled = null;
          } else {
            _tmpDistanceSinceRefuelled = _cursor.getInt(_cursorIndexOfDistanceSinceRefuelled);
          }
          final int _tmpUid;
          _tmpUid = _cursor.getInt(_cursorIndexOfUid);
          _item_1 = new Refueling(_tmpVehicleId,_tmpDate,_tmpPrice,_tmpPricePerLiter,_tmpPlace,_tmpMileage,_tmpConsumption,_tmpDistanceSinceRefuelled,_tmpUid);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
