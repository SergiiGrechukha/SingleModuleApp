package com.loki.singlemoduleapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.conf.ConfigurableKodein
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.with
import com.loki.singlemoduleapp.BuildConfig
import com.loki.singlemoduleapp.R.layout
import di.bStreamModule
import com.loki.singlemoduleapp.core.SomethingUseful
import com.loki.singlemoduleapp.core.addModule
import com.loki.singlemoduleapp.core.iNeedSomeKodein
import kotlinx.android.synthetic.main.activity_b_stream.*
import stub.SampleClass2000

class BStreamActivity : AppCompatActivity(), KodeinAware {

    override val kodein = ConfigurableKodein()

    private val injector = KodeinInjector()
    private val somethingUseful: SomethingUseful by injector.with(this).instance<SomethingUseful>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_b_stream)

        injectDeps()
        setUpUI()

        Log.d("TAG", SampleClass2000().className)

    }

    private fun setUpUI() {
        streamText.text = "ModuleName: ${BuildConfig.APPLICATION_ID}\ncore: ${somethingUseful.getSomethingUseful()}"
    }

    @SuppressLint("WrongConstant")
    private fun injectDeps() {
        application addModule bStreamModule
        injector.inject(this.iNeedSomeKodein())
    }
}
