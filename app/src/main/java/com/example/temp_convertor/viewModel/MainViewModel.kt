package com.example.temp_convertor.viewModel

import androidx.lifecycle.*
import com.example.temp_convertor.util.MyColors
import com.example.temp_convertor.util.Operations.changeColorDependOnTemp
import com.example.temp_convertor.util.Operations.temperatureConvertor


class MainViewModel : ViewModel() {
    val color = MutableLiveData<MyColors>()

    val fahrenheitTemp = MutableLiveData<String>()

    val celsiusTemp = MutableLiveData<String>()

    private val mediator = MediatorLiveData<String>().apply {
        addSource(fahrenheitTemp) {
            value = it
        }
    }.also {
        it.observeForever { data ->
            if (!data.isNullOrBlank()) {
                celsiusTemp.postValue(temperatureConvertor(data).toString())
                changeColorDependOnTemp(temperatureConvertor(data), color)
            } else {
                celsiusTemp.postValue(fahrenheitTemp.value)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        mediator.removeObserver {}
    }


}
