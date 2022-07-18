package com.github.liplum.mgppi

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage

@State(name = "MGPPISettings", storages = [Storage("mgpp_intellij.xml")])
class Settings : PersistentStateComponent<Settings.State> {
    data class State(
        var isShowArcColor: Boolean = true,
        var isShowBundle: Boolean = true,
    )

    var isShowArcColor: Boolean
        get() = state.isShowArcColor
        set(value) {
            state.isShowArcColor = value
        }
    var isShowBundle: Boolean
        get() = state.isShowBundle
        set(value) {
            state.isShowBundle = value
        }
    private var state = State()
    override fun getState() = state
    override fun loadState(state: State) {
        this.state = state
    }

    companion object {
        val X: Settings
            get() = ApplicationManager.getApplication().getService(Settings::class.java)
    }
}