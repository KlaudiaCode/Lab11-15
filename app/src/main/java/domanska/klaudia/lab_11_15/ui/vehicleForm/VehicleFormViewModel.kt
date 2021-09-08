package domanska.klaudia.lab_11_15.ui.vehicleForm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import domanska.klaudia.lab_11_15.AppContainer
import domanska.klaudia.lab_11_15.data.entity.Vehicle
import java.time.LocalDate

class VehicleFormViewModel(vehicleId: Int) : ViewModel() {
    val vehicle = AppContainer.repository.getVehicle(vehicleId)
    var localDate: LocalDate = LocalDate.now()

    fun insertVehicle(vehicle: Vehicle) = viewModelScope.launch {
        AppContainer.repository.insertVehicle(vehicle)
    }

    fun updateVehicle(vehicle: Vehicle) = viewModelScope.launch {
        AppContainer.repository.updateVehicle(vehicle)
    }
}