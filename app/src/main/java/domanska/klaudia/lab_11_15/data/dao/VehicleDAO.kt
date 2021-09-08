package domanska.klaudia.lab_11_15.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import domanska.klaudia.lab_11_15.data.entity.Vehicle
import domanska.klaudia.lab_11_15.data.entity.VehicleWithRefuellings

@Dao
interface VehicleDAO {
    @Query("SELECT * FROM Vehicle")
    fun getAll(): LiveData<List<Vehicle>>

    @Transaction
    @Query("SELECT * FROM Vehicle WHERE uid = :id LIMIT 1")
    fun getVehicleWithRefuellings(id: Int): LiveData<VehicleWithRefuellings>

    @Query("SELECT * FROM vehicle WHERE uid = :id LIMIT 1")
    fun get(id: Int): LiveData<Vehicle>

    @Update
    suspend fun update(vehicle: Vehicle)

    @Insert
    suspend fun insert(vehicle: Vehicle)

    @Delete
    suspend fun delete(vehicle: Vehicle)
}