package domanska.klaudia.lab_11_15.ui.vehicleForm

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class VehicleFormFragmentArgs(
  public val vehicleId: Int = -1
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("vehicleId", this.vehicleId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): VehicleFormFragmentArgs {
      bundle.setClassLoader(VehicleFormFragmentArgs::class.java.classLoader)
      val __vehicleId : Int
      if (bundle.containsKey("vehicleId")) {
        __vehicleId = bundle.getInt("vehicleId")
      } else {
        __vehicleId = -1
      }
      return VehicleFormFragmentArgs(__vehicleId)
    }
  }
}
