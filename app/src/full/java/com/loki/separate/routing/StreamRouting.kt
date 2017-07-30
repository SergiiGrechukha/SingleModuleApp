package com.loki.separate.routing

import android.content.Context
import android.content.Intent
import com.loki.singlemoduleapp.AStreamActivity
import com.loki.singlemoduleapp.BStreamActivity
import com.loki.singlemoduleapp.core.routing.Router

class StreamRouting : Router {

    override fun launchStreamA(context: Context) {
        context.startActivity(Intent(context, AStreamActivity::class.java))
    }

    override fun launchStreamB(context: Context) {
        context.startActivity(Intent(context, BStreamActivity::class.java))
    }
}