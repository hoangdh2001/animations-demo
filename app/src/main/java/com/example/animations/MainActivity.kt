package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageView: ImageView = binding.demoImage

        binding.buttonZoomIn.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_in))
        }

        binding.buttonZoomOut.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out))
        }

        binding.buttonFadeIn.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in))
        }

        binding.buttonFadeOut.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.fade_out))
        }

        binding.buttonSlideLeft.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.slide_left))
        }

        binding.buttonSlideRight.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.slide_right))
        }

        binding.buttonSlideUp.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.slide_up))
        }

        binding.buttonSlideDown.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.slide_down))
        }

        binding.buttonZoomFadeIn.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_in_fade_in))
        }

        binding.buttonZoomFadeOut.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out_fade_out))
        }

        binding.buttonRotate.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.rotate))
        }

        binding.buttonMove.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.move))
        }
    }
}