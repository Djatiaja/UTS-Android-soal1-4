package com.example.project_uts_1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project_uts_1.databinding.ActivityMainBinding
import kotlin.jvm.Throws

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            buttonSubmit.setOnClickListener(){
                val name =inputName.text.toString()
                if (name == ""){
                    Toast.makeText(this@MainActivity, "Enter your name first", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                val intentToSecondPage = Intent(this@MainActivity, soal1::class.java)
                intentToSecondPage.putExtra("name", name)
                startActivity(intentToSecondPage)

            }
        }
    }
}