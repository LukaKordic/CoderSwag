package com.example.lkord.coderswag.ui.holders

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.lkord.coderswag.R
import com.example.lkord.coderswag.models.Product

class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    private val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
    private val productTitle = itemView?.findViewById<TextView>(R.id.productName)
    private val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

    fun bindData(product: Product, context: Context) {

        val imageId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
        productImage?.setImageResource(imageId)
        productTitle?.text = product.title
        productPrice?.text = product.price
    }
}