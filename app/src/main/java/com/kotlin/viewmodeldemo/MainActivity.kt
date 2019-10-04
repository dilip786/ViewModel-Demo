package com.kotlin.viewmodeldemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    var viewModel: MainActivityViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize ViewModel
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        // Increase click count
        fbAdd!!.setOnClickListener {

            viewModel!!.updateClickCount()
        }

        //Update click count on button click
        viewModel!!.getCount()!!.observe(this, Observer {

            tvClickCount!!.setText(it.toString())
        })

    }
}
