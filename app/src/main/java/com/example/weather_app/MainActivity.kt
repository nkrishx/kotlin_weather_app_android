package com.example.weather_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var getForecastButton = findViewById<Button>(R.id.getForecastButton)
        getForecastButton.setOnClickListener {
            var showForecast = Intent(this, forecastListViewActivity::class.java)
            startActivity(showForecast)
        }
    }
}