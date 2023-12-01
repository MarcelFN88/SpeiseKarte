package com.example.speisekarte.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.speisekarte.MainActivity
import com.example.speisekarte.R
import com.example.speisekarte.data.pizza
import com.example.speisekarte.ui.pizzaListFragment

class pizzaAdapter(private val pizzaList: List<pizza>) :
    RecyclerView.Adapter<pizzaListFragment.pizzaViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): pizzaListFragment.pizzaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pizza, parent, false)
        return pizzaListFragment.pizzaViewHolder(view)
    }

    override fun onBindViewHolder(holder: pizzaListFragment.pizzaViewHolder, position: Int) {
        val pizza = pizzaList[position]
        holder.pizzaNameTextView.text = pizza.name
        holder.pizzaImageView.setImageResource(pizza.bildResId)
        holder.pizzaZutatenTextView.text = pizza.zutaten.toString()
        holder.pizzaPreisTextView.text = pizza.preis.toString()
        holder.pizzaAddButton.setOnClickListener {
        }
    }

    override fun getItemCount(): Int {
        return pizzaList.size
    }
}
