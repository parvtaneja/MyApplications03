package com.example.myapplication3

import android.app.Application
import com.moengage.core.DataCenter
import com.moengage.core.LogLevel.VERBOSE
import com.moengage.core.MoEngage
import com.moengage.core.config.LogConfig
import com.moengage.core.config.NotificationConfig

class MoEngage : Application() {

    override fun onCreate() {
        super.onCreate()

        val moEngage = MoEngage.Builder(this, "2877NHMD0TOHATHC6NNHDERW", DataCenter.DATA_CENTER_1)
            .configureNotificationMetaData(NotificationConfig(R.drawable.small_icon, R.drawable.large_icon))
            .configureLogs(LogConfig(level = VERBOSE))
            .build()
        MoEngage.initialiseDefaultInstance(moEngage)

    }

}