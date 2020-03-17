package com.nu.copy


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import res.anim.*
import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.annotation.SuppressLint
import res.animator.*
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val set: AnimatorSet = AnimatorInflater.loadAnimator(this, R.anim.fade_in)
            .apply {
                setTarget(R.id.img_android)
                start()
            } as AnimatorSet

    }


}
