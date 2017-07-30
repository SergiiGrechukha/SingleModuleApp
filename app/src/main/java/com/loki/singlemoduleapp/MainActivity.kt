package com.loki.singlemoduleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.instance
import com.loki.singlemoduleapp.core.addModule
import com.loki.singlemoduleapp.core.iNeedSomeKodein
import com.loki.singlemoduleapp.core.routing.Router
import com.loki.singlemoduleapp.di.mainActivityModule
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val injector = KodeinInjector()
    private val routerKodein: Router by injector.instance<Router>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDeps()
        setUpUI()
    }

    private fun injectDeps() {
        application addModule mainActivityModule
        injector.inject(this.iNeedSomeKodein())
    }

    private fun setUpUI() {

        btnStreamA.setOnClickListener({
            routerKodein.launchStreamA(this)
        })

        btnStreamB.setOnClickListener({
            routerKodein.launchStreamB(this)
        })

        currentFlavor.text = getCurrentFlavor()
    }

    fun getCurrentFlavor() = "Current flavor: ${BuildConfig.FLAVOR}"
}
