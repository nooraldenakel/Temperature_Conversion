package com.example.temp_convertor.util

import androidx.lifecycle.MutableLiveData
import kotlin.math.roundToInt

object Operations {

    fun temperatureConvertor(value: String): Int {
        return if (value.isNullOrBlank()) {
            0
        } else {
            value.toDouble().minus(32).div(1.8).roundToInt()
        }
    }

    fun changeColorDependOnTemp(value: Int, color: MutableLiveData<MyColors>) =
        when {
            value < 0 -> color.postValue(MyColors.Blue)
            value in 0..20 -> color.postValue(MyColors.Green)
            value in 21..30 -> color.postValue(MyColors.Yellow)
            value in 31..40 -> color.postValue(MyColors.Orange)
            value in 31..40 -> color.postValue(MyColors.Orange)
            else -> color.postValue(MyColors.Red)
        }
}
