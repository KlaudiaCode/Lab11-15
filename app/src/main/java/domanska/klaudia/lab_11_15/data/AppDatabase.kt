package domanska.klaudia.lab_11_15.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import domanska.klaudia.lab_11_15.data.dao.RefuellingDAO
import domanska.klaudia.lab_11_15.data.dao.VehicleDAO
import domanska.klaudia.lab_11_15.data.entity.Refueling
import domanska.klaudia.lab_11_15.data.entity.Vehicle

@Database(entities = [Vehicle::class, Refueling::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun vehicleDao(): VehicleDAO
    abstract fun refuellingDao(): RefuellingDAO

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "petrol_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}