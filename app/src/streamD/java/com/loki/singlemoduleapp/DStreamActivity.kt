package com.loki.singlemoduleapp

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.loki.singlemoduleapp.stub.SampleClass6000


class DStreamActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("TAG", SampleClass6000().className)

    }
}
