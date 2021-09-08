package domanska.klaudia.lab_11_15.ui.refuellingForm

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class RefuellingFormFragmentArgs(
  public val vehicleId: Int = -1,
  public val refuellingId: Int = -1
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("vehicleId", this.vehicleId)
    result.putInt("refuellingId", this.refuellingId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RefuellingFormFragmentArgs {
      bundle.setClassLoader(RefuellingFormFragmentArgs::class.java.classLoader)
      val __vehicleId : Int
      if (bundle.containsKey("vehicleId")) {
        __vehicleId = bundle.getInt("vehicleId")
      } else {
        __vehicleId = -1
      }
      val __refuellingId : Int
      if (bundle.containsKey("refuellingId")) {
        __refuellingId = bundle.getInt("refuellingId")
      } else {
        __refuellingId = -1
      }
      return RefuellingFormFragmentArgs(__vehicleId, __refuellingId)
    }
  }
}
