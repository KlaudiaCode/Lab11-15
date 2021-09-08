package domanska.klaudia.lab_11_15.ui.refuellingDetails

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class RefuellingDetailsFragmentArgs(
  public val refuellingId: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("refuellingId", this.refuellingId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RefuellingDetailsFragmentArgs {
      bundle.setClassLoader(RefuellingDetailsFragmentArgs::class.java.classLoader)
      val __refuellingId : Int
      if (bundle.containsKey("refuellingId")) {
        __refuellingId = bundle.getInt("refuellingId")
      } else {
        throw IllegalArgumentException("Required argument \"refuellingId\" is missing and does not have an android:defaultValue")
      }
      return RefuellingDetailsFragmentArgs(__refuellingId)
    }
  }
}
