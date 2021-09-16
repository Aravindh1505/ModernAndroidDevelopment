package com.aravindh.androidcore.navigator

import androidx.fragment.app.FragmentActivity
import com.aravindh.androidcore.utils.CustomLogger
import javax.inject.Inject

/**
 * Navigator implementation.
 */
class AppNavigatorImpl @Inject constructor(private val activity: FragmentActivity) : AppNavigator {

    override fun navigateTo(screen: Screens) {
        CustomLogger.d("screenName = $screen")

        val fragment = when (screen) {
            Screens.BUTTONS -> ""
            Screens.LOGS -> ""
        }
    }
}
