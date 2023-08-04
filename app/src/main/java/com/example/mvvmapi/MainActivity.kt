package com.example.mvvmapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  lateinit var binding: ActivityMainBinding

   var score:Int= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=  ActivityMainBinding.inflate(layoutInflater)

          setContentView(binding.root)

          binding.incriment.setOnClickListener {
             score++
              setValueToView(score)

          }

            //evrey thing in the Viewmodel Dependency

    }

    private fun setValueToView(i: Int) {

        binding.countTv.text= "score: $i"

    }


}