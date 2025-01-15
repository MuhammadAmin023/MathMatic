package com.math.matic

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.math.matic.databinding.ActivityLingkaranBinding

class LingkaranActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLingkaranBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLingkaranBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.apply {
            button.setOnClickListener {
                val jari = textField.editText?.text.toString().toDouble()
                val hasil = 3.14 * (jari * jari)
                textResult.text = hasil.toString()
            }
        }
    }
}