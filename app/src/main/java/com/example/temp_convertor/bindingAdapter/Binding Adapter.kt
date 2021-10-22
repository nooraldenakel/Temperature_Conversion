package com.example.temp_convertor.bindingAdapter

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.temp_convertor.R
import com.example.temp_convertor.util.MyColors

@BindingAdapter(value = ["myColors"])
fun setMyColor(view: View, myColors: MyColors?) {
    val color = when (myColors) {
        MyColors.Blue -> view.context.getColor(R.color.Blue)
        MyColors.Green -> view.context.getColor(R.color.Green)
        MyColors.Yellow -> view.context.getColor(R.color.Yellow)
        MyColors.Orange -> view.context.getColor(R.color.Orange)
        MyColors.Red -> view.context.getColor(R.color.Red)
        else -> null
    }
    color?.let { view.setBackgroundColor(it) }
}
