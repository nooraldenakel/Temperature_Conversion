package com.example.temp_convertor.viewModel

import android.text.Editable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.temp_convertor.util.MyColors
import com.example.temp_convertor.util.Operations.changeColorDependOnTemp
import com.example.temp_convertor.util.Operations.temperatureConvertor


class MainViewModel : ViewModel() {
    private val _color = MutableLiveData<MyColors>()
    val color: MutableLiveData<MyColors>
        get() = _color

    private val _celsiusTemp = MutableLiveData<Int>()
    val celsiusTemp: MutableLiveData<Int>
        get() = _celsiusTemp

    fun onTextChange(text: Editable) {
            celsiusTemp.postValue(temperatureConvertor(text.toString()))
            changeColorDependOnTemp(temperatureConvertor(text.toString()), color)
    }
}
