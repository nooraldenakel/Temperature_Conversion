package com.example.temp_convertor.bindingAdapter

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.temp_convertor.R
import com.example.temp_convertor.util.MyColors

@BindingAdapter(value = ["myColors"])
fun setMyColor(view: View, myColors: MyColors?) {
    when (myColors) {
        MyColors.Blue -> view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.Blue))
        MyColors.Green -> view.setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                R.color.Green
            )
        )
        MyColors.Yellow -> view.setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                R.color.Yellow
            )
        )
        MyColors.Orange -> view.setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                R.color.Orange
            )
        )
        MyColors.Red -> view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.Red))
    }
}
