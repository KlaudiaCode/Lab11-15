package domanska.klaudia.lab_11_15.data.entity

import androidx.room.Embedded
import androidx.room.Relation

data class VehicleWithRefuellings(
    @Embedded val vehicle: Vehicle,
    @Relation(
        parentColumn = "uid",
        entityColumn = "vehicle_id"
    )
    val refuellings: List<Refueling>
)
