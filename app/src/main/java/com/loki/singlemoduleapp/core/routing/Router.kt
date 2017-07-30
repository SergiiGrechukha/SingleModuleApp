package com.loki.singlemoduleapp.core.routing

import android.content.Context

interface Router {
    fun launchStreamA(context: Context)
    fun launchStreamB(context: Context)
}
