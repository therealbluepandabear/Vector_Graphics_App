package com.realtomjoney.vector_graphics_app

import android.animation.ValueAnimator
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.realtomjoney.vector_graphics_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.view.setOnClickListener {
            val tX = ValueAnimator.ofFloat(0f, 200f)
            val duration = 5000 // Milliseconds
            tX.addUpdateListener { animation ->
                animation.duration = duration.toLong()
                binding.view.translationX = animation.animatedValue as Float
            }
            tX.start()
        }
    }

    private fun setBindings() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}