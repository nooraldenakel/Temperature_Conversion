package com.example.temp_convertor.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.temp_convertor.viewModel.MainViewModel
import com.example.temp_convertor.R
import com.example.temp_convertor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            .also {
                it.viewModel = viewModel
                it.lifecycleOwner = this
            }
    }
}
