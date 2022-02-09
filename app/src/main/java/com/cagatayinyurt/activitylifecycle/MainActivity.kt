package com.cagatayinyurt.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.cagatayinyurt.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.d("LifeCycleLog", "onCreate Called")

        binding.btnSecond.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycleLog", "onStart Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycleLog", "onRestart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycleLog", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycleLog", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycleLog", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycleLog", "onDestroy Called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("LifeCycleLog", "onSaveInstanceState Called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("LifeCycleLog", "onRestoreInstanceState Called")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("LifeCycleLog", "onBackPressed Called")
    }
}