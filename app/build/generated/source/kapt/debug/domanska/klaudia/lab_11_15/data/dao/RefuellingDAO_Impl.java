package domanska.klaudia.lab_11_15.data.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import domanska.klaudia.lab_11_15.data.Converters;
import domanska.klaudia.lab_11_15.data.entity.Refueling;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RefuellingDAO_Impl implements RefuellingDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Refueling> __insertionAdapterOfRefueling;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Refueling> __deletionAdapterOfRefueling;

  private final EntityDeletionOrUpdateAdapter<Refueling> __updateAdapterOfRefueling;

  public RefuellingDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRefueling = new EntityInsertionAdapter<Refueling>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Refueling` (`vehicle_id`,`date`,`price`,`price_per_liter`,`place`,`mileage`,`consumption`,`distance_since_refuelled`,`uid`) VALUES (?,?,?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Refueling value) {
        stmt.bindLong(1, value.getVehicleId());
        final Long _tmp;
        _tmp = __converters.localDateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        stmt.bindDouble(3, value.getPrice());
        if (value.getPricePerLiter() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getPricePerLiter());
        }
        if (value.getPlace() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPlace());
        }
        if (value.getMileage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getMileage());
        }
        if (value.getConsumption() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getConsumption());
        }
        if (value.getDistanceSinceRefuelled() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getDistanceSinceRefuelled());
        }
        stmt.bindLong(9, value.getUid());
      }
    };
    this.__deletionAdapterOfRefueling = new EntityDeletionOrUpdateAdapter<Refueling>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Refueling` WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Refueling value) {
        stmt.bindLong(1, value.getUid());
      }
    };
    this.__updateAdapterOfRefueling = new EntityDeletionOrUpdateAdapter<Refueling>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Refueling` SET `vehicle_id` = ?,`date` = ?,`price` = ?,`price_per_liter` = ?,`place` = ?,`mileage` = ?,`consumption` = ?,`distance_since_refuelled` = ?,`uid` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Refueling value) {
        stmt.bindLong(1, value.getVehicleId());
        final Long _tmp;
        _tmp = __converters.localDateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        stmt.bindDouble(3, value.getPrice());
        if (value.getPricePerLiter() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getPricePerLiter());
        }
        if (value.getPlace() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPlace());
        }
        if (value.getMileage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getMileage());
        }
        if (value.getConsumption() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getConsumption());
        }
        if (value.getDistanceSinceRefuelled() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getDistanceSinceRefuelled());
        }
        stmt.bindLong(9, value.getUid());
        stmt.bindLong(10, value.getUid());
      }
    };
  }

  @Override
  public Object insert(final Refueling refueling, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRefueling.insert(refueling);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Refueling refueling, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRefueling.handle(refueling);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Refueling refueling, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfRefueling.handle(refueling);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Refueling>> getAllPrices() {
    final String _sql = "SELECT price, date, uid, vehicle_id FROM Refueling ORDER BY date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Refueling"}, false, new Callable<List<Refueling>>() {
      @Override
      public List<Refueling> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfVehicleId = CursorUtil.getColumnIndexOrThrow(_cursor, "vehicle_id");
          final List<Refueling> _result = new ArrayList<Refueling>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Refueling _item;
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final LocalDate _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.fromTimestampToLocalDate(_tmp);
            final int _tmpUid;
            _tmpUid = _cursor.getInt(_cursorIndexOfUid);
            final int _tmpVehicleId;
            _tmpVehicleId = _cursor.getInt(_cursorIndexOfVehicleId);
            _item = new Refueling(_tmpVehicleId,_tmpDate,_tmpPrice,null,null,null,null,null,_tmpUid);
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
  public LiveData<Double> getMinConsumption() {
    final String _sql = "SELECT MIN(consumption) FROM Refueling";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Refueling"}, false, new Callable<Double>() {
      @Override
      public Double call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Double _result;
          if(_cursor.moveToFirst()) {
            final Double _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(0);
            }
            _result = _tmp;
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

  @Override
  public LiveData<Double> getAverageConsumption(final LocalDate fromDate) {
    final String _sql = "SELECT AVG(consumption) FROM Refueling WHERE date>?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final Long _tmp;
    _tmp = __converters.localDateToTimestamp(fromDate);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"Refueling"}, false, new Callable<Double>() {
      @Override
      public Double call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Double _result;
          if(_cursor.moveToFirst()) {
            final Double _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getDouble(0);
            }
            _result = _tmp_1;
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

  @Override
  public LiveData<Double> getMaxConsumption() {
    final String _sql = "SELECT MAX(consumption) FROM Refueling";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Refueling"}, false, new Callable<Double>() {
      @Override
      public Double call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Double _result;
          if(_cursor.moveToFirst()) {
            final Double _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(0);
            }
            _result = _tmp;
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

  @Override
  public LiveData<String> getFavouritePlace() {
    final String _sql = "SELECT place FROM refueling GROUP BY place ORDER BY COUNT(*) DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"refueling"}, false, new Callable<String>() {
      @Override
      public String call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final String _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getString(0);
            }
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

  @Override
  public LiveData<Refueling> get(final int uid) {
    final String _sql = "SELECT * FROM Refueling WHERE uid=? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, uid);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Refueling"}, false, new Callable<Refueling>() {
      @Override
      public Refueling call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfVehicleId = CursorUtil.getColumnIndexOrThrow(_cursor, "vehicle_id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfPricePerLiter = CursorUtil.getColumnIndexOrThrow(_cursor, "price_per_liter");
          final int _cursorIndexOfPlace = CursorUtil.getColumnIndexOrThrow(_cursor, "place");
          final int _cursorIndexOfMileage = CursorUtil.getColumnIndexOrThrow(_cursor, "mileage");
          final int _cursorIndexOfConsumption = CursorUtil.getColumnIndexOrThrow(_cursor, "consumption");
          final int _cursorIndexOfDistanceSinceRefuelled = CursorUtil.getColumnIndexOrThrow(_cursor, "distance_since_refuelled");
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final Refueling _result;
          if(_cursor.moveToFirst()) {
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
            _result = new Refueling(_tmpVehicleId,_tmpDate,_tmpPrice,_tmpPricePerLiter,_tmpPlace,_tmpMileage,_tmpConsumption,_tmpDistanceSinceRefuelled,_tmpUid);
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
}
