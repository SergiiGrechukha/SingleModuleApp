package com.loki.singlemoduleapp.core

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.conf.ConfigurableKodein

interface ApplicationInterface {

    fun addModule(module: Kodein.Module)
}