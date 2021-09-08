package domanska.klaudia.lab_11_15.ui.vehicleList

import androidx.lifecycle.ViewModel
import domanska.klaudia.lab_11_15.AppContainer

class VehicleListViewModel : ViewModel() {
    val vehicleList = AppContainer.repository.getVehicles()
}