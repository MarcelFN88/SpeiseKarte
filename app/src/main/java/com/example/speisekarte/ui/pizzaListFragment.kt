package com.example.speisekarte.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.speisekarte.R
import com.example.speisekarte.data.pizza
import com.example.speisekarte.data.pizza_datasource
import com.example.speisekarte.ui.adapter.pizzaAdapter

class pizzaListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var pizzaAdapter: pizzaAdapter // Stellen Sie sicher, dass Sie einen passenden Adapter erstellt haben

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pizza_list, container, false)


        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val dataSource = pizza_datasource()
        val pizzaAdapter = pizzaAdapter(dataSource.pizzaList)
        recyclerView.adapter = pizzaAdapter

        return view
    }
    class pizzaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val pizzaImageView: ImageView = view.findViewById(R.id.imageViewPizza)
        val pizzaNameTextView: TextView = view.findViewById(R.id.textViewPizzaName)
        val pizzaZutatenTextView: TextView = view.findViewById(R.id.textViewZutaten)
        val pizzaPreisTextView: TextView = view.findViewById(R.id.textViewPreis)
        val pizzaAddButton: Button = view.findViewById(R.id.addBu)
    }
}
