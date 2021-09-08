package domanska.klaudia.lab_11_15.data.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\bH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\'J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Ldomanska/klaudia/lab_11_15/data/dao/RefuellingDAO;", "", "delete", "", "refueling", "Ldomanska/klaudia/lab_11_15/data/entity/Refueling;", "(Ldomanska/klaudia/lab_11_15/data/entity/Refueling;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Landroidx/lifecycle/LiveData;", "uid", "", "getAllPrices", "", "getAverageConsumption", "", "fromDate", "Ljava/time/LocalDate;", "getFavouritePlace", "", "getMaxConsumption", "getMinConsumption", "insert", "update", "app_debug"})
public abstract interface RefuellingDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT price, date, uid, vehicle_id FROM Refueling ORDER BY date DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<domanska.klaudia.lab_11_15.data.entity.Refueling>> getAllPrices();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT MIN(consumption) FROM Refueling")
    public abstract androidx.lifecycle.LiveData<java.lang.Double> getMinConsumption();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT AVG(consumption) FROM Refueling WHERE date>:fromDate")
    public abstract androidx.lifecycle.LiveData<java.lang.Double> getAverageConsumption(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate fromDate);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT MAX(consumption) FROM Refueling")
    public abstract androidx.lifecycle.LiveData<java.lang.Double> getMaxConsumption();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT place FROM refueling GROUP BY place ORDER BY COUNT(*) DESC LIMIT 1")
    public abstract androidx.lifecycle.LiveData<java.lang.String> getFavouritePlace();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Refueling WHERE uid=:uid LIMIT 1")
    public abstract androidx.lifecycle.LiveData<domanska.klaudia.lab_11_15.data.entity.Refueling> get(int uid);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    domanska.klaudia.lab_11_15.data.entity.Refueling refueling, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    domanska.klaudia.lab_11_15.data.entity.Refueling refueling, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    domanska.klaudia.lab_11_15.data.entity.Refueling refueling, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}