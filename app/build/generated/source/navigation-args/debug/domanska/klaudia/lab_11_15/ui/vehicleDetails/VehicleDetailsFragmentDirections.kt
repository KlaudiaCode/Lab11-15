package domanska.klaudia.lab_11_15.ui.vehicleDetails

import android.os.Bundle
import androidx.navigation.NavDirections
import domanska.klaudia.lab_11_15.R
import kotlin.Int

public class VehicleDetailsFragmentDirections private constructor() {
  private data class ActionVehicleDetailsFragmentToVehicleFormFragment(
    public val vehicleId: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_vehicleDetailsFragment_to_vehicleFormFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("vehicleId", this.vehicleId)
      return result
    }
  }

  private data class ActionVehicleDetailsFragmentToRefuellingForm(
    public val vehicleId: Int = -1,
    public val refuellingId: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_vehicleDetailsFragment_to_refuellingForm

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("vehicleId", this.vehicleId)
      result.putInt("refuellingId", this.refuellingId)
      return result
    }
  }

  private data class ActionVehicleDetailsFragmentToRefuellingDetailsFragment(
    public val refuellingId: Int
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_vehicleDetailsFragment_to_refuellingDetailsFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("refuellingId", this.refuellingId)
      return result
    }
  }

  public companion object {
    public fun actionVehicleDetailsFragmentToVehicleFormFragment(vehicleId: Int = -1): NavDirections
        = ActionVehicleDetailsFragmentToVehicleFormFragment(vehicleId)

    public fun actionVehicleDetailsFragmentToRefuellingForm(vehicleId: Int = -1, refuellingId: Int
        = -1): NavDirections = ActionVehicleDetailsFragmentToRefuellingForm(vehicleId, refuellingId)

    public fun actionVehicleDetailsFragmentToRefuellingDetailsFragment(refuellingId: Int):
        NavDirections = ActionVehicleDetailsFragmentToRefuellingDetailsFragment(refuellingId)
  }
}
