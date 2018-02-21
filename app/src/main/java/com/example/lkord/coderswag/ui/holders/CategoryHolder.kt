package com.example.lkord.coderswag.ui.holders

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.lkord.coderswag.R
import com.example.lkord.coderswag.models.Category

class CategoryHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    private val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
    private val categoryTitle = itemView?.findViewById<TextView>(R.id.categoryItemText)

    fun bindData(context: Context, category: Category) {

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage?.setImageResource(resourceId)
        categoryTitle?.text = category.title

        itemView?.onClick {
            Toast.makeText(context, "You clicked ${category.title} category", Toast.LENGTH_SHORT).show()
        }
    }
}

fun View.onClick(onClick: () -> Unit) {
    setOnClickListener { onClick() }
}