package com.example.homework_2kt.extensions


import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.load(uri: String){
    Glide.with(this).load(uri).into(this)

}