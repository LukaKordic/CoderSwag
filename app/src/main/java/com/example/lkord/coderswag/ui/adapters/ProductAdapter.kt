package com.example.lkord.coderswag.ui.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lkord.coderswag.R
import com.example.lkord.coderswag.models.Product
import com.example.lkord.coderswag.ui.holders.ProductHolder

class ProductAdapter(private val context: Context, private val products: List<Product>) : RecyclerView.Adapter<ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val itemView: View? = LayoutInflater.from(parent?.context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(itemView)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
        holder?.bindData(products[position], context)
    }
}