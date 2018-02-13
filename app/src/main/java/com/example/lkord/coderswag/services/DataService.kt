package com.example.lkord.coderswag.services

import com.example.lkord.coderswag.models.Category
import com.example.lkord.coderswag.models.Product

/**
 * Created by lkord on 13.2.2018..
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Black", "$25", "hoodie02"),
            Product("Devslopes Hoodie White", "$26", "hoodie03"),
            Product("Devslopes Hoodie Red", "$26", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Gray", "$21", "shirt01"),
            Product("Devslopes Shirt Black", "$22", "shirt02"),
            Product("Devslopes Shirt White", "$23", "shirt03"),
            Product("Devslopes Shirt Red", "$24", "shirt04")
    )
}