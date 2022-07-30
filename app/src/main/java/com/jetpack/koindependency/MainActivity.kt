package com.jetpack.koindependency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // Inject MyPresenter
    private val myPresenter: MyPresenter by inject()
    // Inject MyViewModel
    val myViewModel : MyViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "MySimpleActivity"
        val textMessage : TextView = findViewById(R.id.text)
        textMessage.text = "${myPresenter.sayHello()} \n ${myViewModel.sayHello()}"
    }
}