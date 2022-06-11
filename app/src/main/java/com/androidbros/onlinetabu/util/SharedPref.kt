package com.androidbros.onlinetabu.util

import android.content.Context
import android.content.SharedPreferences
import com.androidbros.onlinetabu.util.Constant.ON_BOARDING_STATE

class SharedPref(context: Context) {

    internal var mySharedPref: SharedPreferences =
        context.getSharedPreferences("sharedPref", Context.MODE_PRIVATE)

    fun setOnBoardingState(state: Boolean?) {
        val editor = mySharedPref.edit()
        editor.putBoolean(ON_BOARDING_STATE, state!!)
        editor.apply()
    }

    fun loadOnBoardingState(): Boolean {
        return mySharedPref.getBoolean(ON_BOARDING_STATE, false)
    }

}