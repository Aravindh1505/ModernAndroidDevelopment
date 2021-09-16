package com.aravindh.androidcore.navigator

enum class Screens {
    BUTTONS,
    LOGS
}

interface AppNavigator {
    fun navigateTo(screen: Screens)
}
