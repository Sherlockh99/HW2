package com.sherlock.gb.kotlin.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: MaterialButton = findViewById(R.id.key1)
        button.setOnClickListener {
            showToast("Пора спать!")
        }

        val button2: MaterialButton = findViewById(R.id.key2)
        button2.setOnClickListener {
            val cat = FirstDataClass("Murzik", 7)
            showToast(cat.toString());
            showToast(cat.age.toString());
            showToast(cat.name);
        }
    }

    fun showToast(toast:String){
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext, toast, duration)
        toast.show()
    }

}