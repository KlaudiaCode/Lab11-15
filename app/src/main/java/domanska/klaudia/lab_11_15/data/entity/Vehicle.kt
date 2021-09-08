package domanska.klaudia.lab_11_15.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity
data class Vehicle(
    @ColumnInfo(name = "brand") var brand: String,
    @ColumnInfo(name = "model") var model: String,
    @ColumnInfo(name = "licensePlate") var licensePlate: String,
    @ColumnInfo(name = "check_date") var checkDate: LocalDate,
    @PrimaryKey(autoGenerate = true) val uid: Int = 0
)
