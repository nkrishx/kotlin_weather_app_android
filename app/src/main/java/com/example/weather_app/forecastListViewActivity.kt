package com.example.weather_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class forecastListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast_list_view)

        var listView = findViewById<ListView>(R.id.forecastListView)
        var randomThings = arrayOf("hi","hello","how","are","you","hi","hello","how","are","you","hi","hello","how","are","you","hi","hello","how","are","you","hi","hello","how","are","you","hi","hello","how","are","you","hi","hello","how","are","you","hi","hello","how","are","you","hi","hello","how","are","you","hi","hello","how","are","you")
        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,randomThings)

        listView.adapter = adapter

    }
}