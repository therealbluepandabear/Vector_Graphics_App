package com.realtomjoney.vector_graphics_app

import android.animation.*
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Property
import android.view.View
import android.view.animation.AnimationSet
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.Toast
import com.realtomjoney.vector_graphics_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.view.setOnClickListener {
            val scale = ObjectAnimator.ofFloat(
                binding.view,
                View.SCALE_X,
                1.0f,
                0.5f
            )

            val fade = ObjectAnimator.ofFloat(
                binding.view,
                View.ALPHA,
                1.0f,
                0.25f
            )

            val myAnimationSet = AnimatorSet()
            myAnimationSet.duration = 2000
            myAnimationSet.playTogether(scale, fade)
            myAnimationSet.start()
        }
    }

    private fun setBindings() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}