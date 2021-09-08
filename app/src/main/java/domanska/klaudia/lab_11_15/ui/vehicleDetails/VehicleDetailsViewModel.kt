package domanska.klaudia.lab_11_15.ui.vehicleDetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import domanska.klaudia.lab_11_15.AppContainer
import domanska.klaudia.lab_11_15.data.entity.Vehicle

class VehicleDetailsViewModel(vehicleId: Int) : ViewModel() {
    val vehicle = AppContainer.repository.getVehicle(vehicleId)
    val vehicleWithRefuellings = AppContainer.repository.getVehicleWithRefuellings(vehicleId)

    fun deleteVehicle(vehicle: Vehicle) = viewModelScope.launch {
        AppContainer.repository.deleteVehicle(vehicle)
    }
}