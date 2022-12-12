package com.sherlock.gb.kotlin.hw2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    val cat = FirstDataClass("Murzik", 7)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: MaterialButton = findViewById(R.id.key1)
        button.setOnClickListener {
            showToast("Пора спать!")
        }

        val button2: MaterialButton = findViewById(R.id.key2)
        button2.setOnClickListener {
            showToast(cat.toString());
            showToast(cat.name);
            showToast(cat.age.toString());
        }

        val buttonCopy: MaterialButton = findViewById(R.id.key_copy)
        buttonCopy.setOnClickListener {
            val copy = cat.copy(age = 10, name = "Elephant")
            showToast(copy.name);
            showToast(copy.age.toString());
        }

        val buttonWeatherList: MaterialButton = findViewById(R.id.key_weather_list)
        buttonWeatherList.setOnClickListener {

        }
    }

    fun showToast(toast:String){
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext, toast, duration)
        toast.show()
    }

}