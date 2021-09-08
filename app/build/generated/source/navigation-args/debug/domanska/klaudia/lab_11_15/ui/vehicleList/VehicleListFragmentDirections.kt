package domanska.klaudia.lab_11_15.ui.vehicleList

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import domanska.klaudia.lab_11_15.R
import kotlin.Int

public class VehicleListFragmentDirections private constructor() {
  private data class ActionVehicleListFragmentToVehicleDetailsFragment(
    public val vehicleId: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_vehicleListFragment_to_vehicleDetailsFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("vehicleId", this.vehicleId)
      return result
    }
  }

  private data class ActionVehicleListFragmentToVehicleFormFragment(
    public val vehicleId: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_vehicleListFragment_to_vehicleFormFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("vehicleId", this.vehicleId)
      return result
    }
  }

  public companion object {
    public fun actionVehicleListFragmentToVehicleDetailsFragment(vehicleId: Int = -1): NavDirections
        = ActionVehicleListFragmentToVehicleDetailsFragment(vehicleId)

    public fun actionVehicleListFragmentToVehicleFormFragment(vehicleId: Int = -1): NavDirections =
        ActionVehicleListFragmentToVehicleFormFragment(vehicleId)

    public fun actionVehicleListFragmentToStatisticsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_vehicleListFragment_to_statisticsFragment)
  }
}
