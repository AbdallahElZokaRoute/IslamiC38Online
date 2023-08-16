package com.route.isalmic38online

import android.app.Application
import com.route.isalmic38online.core.local_data_source.AppSharedReferences

class MyCustomApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppSharedReferences.init(this)
    }
}