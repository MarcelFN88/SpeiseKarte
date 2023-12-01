package com.example.speisekarte.data

import com.example.speisekarte.R

class pizza_datasource {

    val pizzaList = listOf(
        pizza(
            name = "BBQ Chicken",
            bildResId = R.drawable.pizza_bbqchicken,
            zutaten = listOf(
                "BBQ-Sauce",
                "Hähnchenbrust",
                "Rote Zwiebeln",
                "Mozzarella",
                "Koriander"
            ),
            preis = "13.50€",
            allergien = listOf("Milch"),
            zusatzstoffe = listOf("E621", "E627", "E631")
        ),

        pizza(
            name = "Cheese Lover",
            bildResId = R.drawable.pizza_cheese,
            zutaten = listOf(
                "Mozzarella",
                "Cheddar",
                "Gorgonzola",
                "Parmesan"


            ),
            preis = "12.90€",
            allergien = listOf("Milch"),
            zusatzstoffe = listOf()
        ),

        pizza(
            name = "Hawaii",
            bildResId = R.drawable.pizza_hawaii,
            zutaten = listOf(
                "Tomatensauce",
                "Mozzarella",
                "Schinken",
                "Ananas"
                ,

            ),
            preis = "12.90€",
            allergien = listOf("Milch", "Weizen"),
            zusatzstoffe = listOf("E202")
        ),

        pizza(
            name = "Margherita",
            bildResId = R.drawable.pizza_margherita,
            zutaten = listOf(
                "Tomatensauce",
                "Mozzarella",
                "Basilikum"
                ,

            ),
            preis = "10.90€",
            allergien = listOf("Milch", "Weizen"),
            zusatzstoffe = listOf()
        ),

        pizza(
            name = "Meat Lover",
            bildResId = R.drawable.pizza_meat,
            zutaten = listOf(
                "Tomatensauce",
                "Mozzarella",
                "Pepperoni",
                "Salami",
                "Schinken",
                "Hackfleisch"
                ,

            ),preis = "14.90€",
            allergien = listOf("Milch", "Weizen"),
            zusatzstoffe = listOf("E250", "E252")
        ),

        pizza(
            name = "Meeresfrüchte",
            bildResId = R.drawable.pizza_meeresfruechte,
            zutaten = listOf(
                "Tomatensauce",
                "Mozzarella",
                "Verschiedene Meeresfrüchte"
                ,

            ),preis = "13.50€",
            allergien = listOf("Schalentiere", "Milch", "Weizen"),
            zusatzstoffe = listOf("E621")
        ),

        pizza(
            name = "Plain",
            bildResId = R.drawable.pizza_plain,
            zutaten = listOf(
                "Pizzateig",
                "Tomatensauce"
                ,

            ), preis = "8.90€",
            allergien = listOf("Weizen"),
            zusatzstoffe = listOf()
        ),

        pizza(
            name = "Salami",
            bildResId = R.drawable.pizza_salami,
            zutaten = listOf(
                "Tomatensauce",
                "Mozzarella",
                "Salami"
                ,

            ), preis = "12.90€",
            allergien = listOf("Milch", "Weizen"),
            zusatzstoffe = listOf("E250")
        ),

        pizza(
            name = "Speciale",
            bildResId = R.drawable.pizza_speziale,
            zutaten = listOf(
                "Tomatensauce",
                "Mozzarella",
                "Salami",
                "Pilze",
                "Paprika",
                "Zwiebeln",
                "Schwarze Oliven"
                ,

            ),preis = "13.90€",
            allergien = listOf("Milch", "Weizen"),
            zusatzstoffe = listOf("E621")
        ),

        pizza(
            name = "Spinaci",
            bildResId = R.drawable.pizza_spinaci,
            zutaten = listOf("Tomatensauce", "Mozzarella", "Frischer Spinat", "Feta",

            ), preis = "11.90€",
            allergien = listOf("Milch", "Weizen"),
            zusatzstoffe = listOf()
        ),

        pizza(
            name = "Teriyaki " +
                    "Chicken",
            bildResId = R.drawable.pizza_teriyaki,
            zutaten = listOf(
                "Teriyaki-Sauce",
                "Hähnchenbrust",
                "Rote Zwiebeln",
                "Mozzarella",
                "Koriander"


            ),preis = "13.50€",
            allergien = listOf("Milch", "Weizen", "Soja"),
            zusatzstoffe = listOf("E621", "E627", "E631")
        ),

        pizza(
            name = "Margherita con Tomo",
            bildResId = R.drawable.pizza_tomo,
            zutaten = listOf("Tomatensauce", "Mozzarella", "Frische Tomaten", "Basilikum",

            ), preis = "10.90€",
            allergien = listOf("Milch", "Weizen"),
            zusatzstoffe = listOf()
        ),

        pizza(
            name = "Veggie",
            bildResId = R.drawable.pizza_veggie,
            zutaten = listOf(
                "Tomatensauce",
                "Mozzarella",
                "Pilze",
                "Paprika",
                "Zwiebeln",
                "Schwarze Oliven",
                "Cherrytomaten"
                ,

            ), preis = "11.90€",
            allergien = listOf("Milch", "Weizen"),
            zusatzstoffe = listOf()
        )
    )


}