package com.example.lkord.coderswag.datafactory

import com.example.lkord.coderswag.models.Category
import com.example.lkord.coderswag.models.Product

object ProductsFactory {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat2"),
            Product("Devslopes Hat Black", "$20", "hat1"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Black", "$25", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$26", "hoodie3"),
            Product("Devslopes Hoodie Red", "$26", "hoodie2")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Gray", "$21", "shirt4"),
            Product("Devslopes Shirt Black", "$22", "shirt1"),
            Product("Devslopes Shirt White", "$23", "shirt2"),
            Product("Devslopes Shirt Red", "$24", "shirt3")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGoods
        }
    }
}