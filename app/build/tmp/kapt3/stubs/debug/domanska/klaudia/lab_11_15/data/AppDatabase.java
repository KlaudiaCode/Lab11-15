package domanska.klaudia.lab_11_15.data;

import java.lang.System;

@androidx.room.TypeConverters(value = {domanska.klaudia.lab_11_15.data.Converters.class})
@androidx.room.Database(entities = {domanska.klaudia.lab_11_15.data.entity.Vehicle.class, domanska.klaudia.lab_11_15.data.entity.Refueling.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Ldomanska/klaudia/lab_11_15/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "refuellingDao", "Ldomanska/klaudia/lab_11_15/data/dao/RefuellingDAO;", "vehicleDao", "Ldomanska/klaudia/lab_11_15/data/dao/VehicleDAO;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final domanska.klaudia.lab_11_15.data.AppDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile domanska.klaudia.lab_11_15.data.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract domanska.klaudia.lab_11_15.data.dao.VehicleDAO vehicleDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract domanska.klaudia.lab_11_15.data.dao.RefuellingDAO refuellingDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Ldomanska/klaudia/lab_11_15/data/AppDatabase$Companion;", "", "()V", "INSTANCE", "Ldomanska/klaudia/lab_11_15/data/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final domanska.klaudia.lab_11_15.data.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}