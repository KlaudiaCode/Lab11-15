package domanska.klaudia.lab_11_15

import android.app.Application

class RefuellingApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppContainer.init(this)
    }
}