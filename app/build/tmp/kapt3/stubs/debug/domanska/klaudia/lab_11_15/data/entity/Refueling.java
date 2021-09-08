package domanska.klaudia.lab_11_15.data.entity;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u00100\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u00102\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003Jr\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\t\u0010;\u001a\u00020\nH\u00d6\u0001R\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\'\u0010\u0011\"\u0004\b(\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010*\u00a8\u0006<"}, d2 = {"Ldomanska/klaudia/lab_11_15/data/entity/Refueling;", "", "vehicleId", "", "date", "Ljava/time/LocalDate;", "price", "", "pricePerLiter", "place", "", "mileage", "consumption", "distanceSinceRefuelled", "uid", "(ILjava/time/LocalDate;DLjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;I)V", "getConsumption", "()Ljava/lang/Double;", "setConsumption", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getDate", "()Ljava/time/LocalDate;", "setDate", "(Ljava/time/LocalDate;)V", "getDistanceSinceRefuelled", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMileage", "setMileage", "(Ljava/lang/Integer;)V", "getPlace", "()Ljava/lang/String;", "setPlace", "(Ljava/lang/String;)V", "getPrice", "()D", "setPrice", "(D)V", "getPricePerLiter", "setPricePerLiter", "getUid", "()I", "getVehicleId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/time/LocalDate;DLjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;I)Ldomanska/klaudia/lab_11_15/data/entity/Refueling;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Refueling {
    @androidx.room.ColumnInfo(name = "vehicle_id")
    private final int vehicleId = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "date")
    private java.time.LocalDate date;
    @androidx.room.ColumnInfo(name = "price")
    private double price;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "price_per_liter")
    private java.lang.Double pricePerLiter;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "place")
    private java.lang.String place;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "mileage")
    private java.lang.Integer mileage;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "consumption")
    private java.lang.Double consumption;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "distance_since_refuelled")
    private final java.lang.Integer distanceSinceRefuelled = null;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int uid = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final domanska.klaudia.lab_11_15.data.entity.Refueling copy(int vehicleId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, double price, @org.jetbrains.annotations.Nullable()
    java.lang.Double pricePerLiter, @org.jetbrains.annotations.Nullable()
    java.lang.String place, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mileage, @org.jetbrains.annotations.Nullable()
    java.lang.Double consumption, @org.jetbrains.annotations.Nullable()
    java.lang.Integer distanceSinceRefuelled, int uid) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Refueling(int vehicleId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, double price, @org.jetbrains.annotations.Nullable()
    java.lang.Double pricePerLiter, @org.jetbrains.annotations.Nullable()
    java.lang.String place, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mileage, @org.jetbrains.annotations.Nullable()
    java.lang.Double consumption, @org.jetbrains.annotations.Nullable()
    java.lang.Integer distanceSinceRefuelled, int uid) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getVehicleId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate p0) {
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final void setPrice(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPricePerLiter() {
        return null;
    }
    
    public final void setPricePerLiter(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlace() {
        return null;
    }
    
    public final void setPlace(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMileage() {
        return null;
    }
    
    public final void setMileage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getConsumption() {
        return null;
    }
    
    public final void setConsumption(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDistanceSinceRefuelled() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getUid() {
        return 0;
    }
}