package com.realtomjoney.vector_graphics_app

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import com.realtomjoney.vector_graphics_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.view.setOnClickListener {
            val tY = ObjectAnimator.ofFloat(
                binding.view,
                View.TRANSLATION_Y,
                binding.view.translationY,
                binding.view.translationY + 100f)
            tY.duration = 500
            tY.interpolator = LinearInterpolator()
            tY.start();
        }
    }

    private fun setBindings() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}