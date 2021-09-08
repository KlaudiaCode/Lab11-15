package domanska.klaudia.lab_11_15.ui.refuellingDetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import domanska.klaudia.lab_11_15.AppContainer
import domanska.klaudia.lab_11_15.data.entity.Refueling

class RefuellingDetailsViewModel(refuellingId: Int) : ViewModel() {
    val refuelling = AppContainer.repository.getRefuelling(refuellingId)

    fun deleteRefuelling(refuelling: Refueling) = viewModelScope.launch {
        AppContainer.repository.removeRefuelling(refuelling)
    }
}