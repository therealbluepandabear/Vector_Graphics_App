package com.realtomjoney.vector_graphics_app

import android.animation.ObjectAnimator
import android.animation.TimeInterpolator
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Property
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import com.realtomjoney.vector_graphics_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.view.setOnClickListener {
            animate(
                binding.view,
                View.TRANSLATION_Y,
                binding.view.translationY,
                binding.view.translationY + 100,
                1000,
                DecelerateInterpolator())
        }
    }

    fun animate(
        target: View,
        property: Property<View, Float>,
        from: Float,
        to: Float,
        duration: Long,
        interpolator: TimeInterpolator) {
        val tY = ObjectAnimator.ofFloat(
            target,
            property,
            from,
            to)
        tY.duration = duration
        tY.interpolator = interpolator
        tY.start();
    }

    private fun setBindings() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}