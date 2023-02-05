package com.example.feastapp2.ui

import CardAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feastapp2.CardModel
import com.example.feastapp2.R
import com.example.feastapp2.databinding.FragmentRecipeBinding

class RecipeFragment : Fragment() {
    private var _binding: FragmentRecipeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var recipes: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecipeBinding.inflate(inflater, container, false)
        recipes = binding.root.findViewById(R.id.recipe_rv)

        val cardModelArrayList: ArrayList<CardModel> = ArrayList<CardModel>()
        cardModelArrayList.add(CardModel("Recipe One", "Week 9 of 16", R.drawable.ic_recipe))
        cardModelArrayList.add(CardModel("Recipe Two", "Week 2 of 8", R.drawable.ic_recipe))
        cardModelArrayList.add(CardModel("Recipe Three", "Week 2 of 8", R.drawable.ic_recipe))
        cardModelArrayList.add(CardModel("Recipe Four", "Week 2 of 8", R.drawable.ic_recipe))
        cardModelArrayList.add(CardModel("Recipe Five", "Week 2 of 8", R.drawable.ic_recipe))


        val cardAdapter = CardAdapter(cardModelArrayList)
        val linearLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)

        recipes.layoutManager = linearLayoutManager
        recipes.adapter = cardAdapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}