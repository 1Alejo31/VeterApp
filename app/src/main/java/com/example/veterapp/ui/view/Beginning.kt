package com.example.veterapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterapp.R
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class Beginning : AppCompatActivity() {

    val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beginning)

        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem(R.drawable.reset))
        list.add(CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcqFuSHurR-dRyTgywDS1HYplrn7JZ3fNzNQ&usqp=CAU"))
        list.add(CarouselItem(R.drawable.background1))

        carousel.addData(list)
    }
}