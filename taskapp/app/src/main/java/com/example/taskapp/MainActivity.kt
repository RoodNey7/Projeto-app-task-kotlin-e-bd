package com.example.taskapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.taskapp.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding
public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root);


        val abrir: TextView=findViewById(R.id.textView8)


        abrir.setOnClickListener{
            val github= Intent(Intent.ACTION_VIEW)
            github.data= Uri.parse("https://github.com/Rogerms22")

            startActivity(github)

                val gui: TextView=findViewById(R.id.textView15)

                gui.setOnClickListener{
                    val opengit= Intent(Intent.ACTION_VIEW)
                    opengit.data= Uri.parse("https://github.com/RoodNey7")

                    startActivity(opengit)
        }
    } } }
