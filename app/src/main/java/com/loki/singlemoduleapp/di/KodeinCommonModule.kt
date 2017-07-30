package com.loki.singlemoduleapp.di

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.loki.singlemoduleapp.core.routing.Router
import com.loki.separate.routing.StreamRouting

val mainActivityModule = Kodein.Module(allowSilentOverride = true) {
    bind<Router>() with instance(StreamRouting())
}