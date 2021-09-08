package domanska.klaudia.lab_11_15.ui.refuellingDetails

import android.os.Bundle
import androidx.navigation.NavDirections
import domanska.klaudia.lab_11_15.R
import kotlin.Int

public class RefuellingDetailsFragmentDirections private constructor() {
  private data class ActionRefuellingDetailsFragmentToRefuellingForm(
    public val vehicleId: Int = -1,
    public val refuellingId: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_refuellingDetailsFragment_to_refuellingForm

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("vehicleId", this.vehicleId)
      result.putInt("refuellingId", this.refuellingId)
      return result
    }
  }

  public companion object {
    public fun actionRefuellingDetailsFragmentToRefuellingForm(vehicleId: Int = -1,
        refuellingId: Int = -1): NavDirections =
        ActionRefuellingDetailsFragmentToRefuellingForm(vehicleId, refuellingId)
  }
}
