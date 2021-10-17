package com.realtomjoney.vector_graphics_app

import android.animation.Animator
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
import android.widget.Toast
import com.realtomjoney.vector_graphics_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.view.setOnClickListener {
            val scaleX = ObjectAnimator.ofFloat(binding.view, View.SCALE_X, 1.0f, 0.0f)
            scaleX.duration = 2000
            scaleX.start()

            scaleX.addListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationEnd(animation: Animator?) {
                    Toast.makeText(
                        this@MainActivity,
                        "Animation Ended",
                        Toast.LENGTH_LONG).show()
                }

                override fun onAnimationCancel(animation: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationRepeat(animation: Animator?) {
                    TODO("Not yet implemented")
                }

            })
        }
    }

    private fun setBindings() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}