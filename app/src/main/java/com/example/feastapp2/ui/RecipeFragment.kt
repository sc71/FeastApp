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
        cardModelArrayList.add(CardModel("Recipe One", "chicken, vegetables", R.drawable.chicken_dinner))
        cardModelArrayList.add(CardModel("Recipe Two", "vegetables", R.drawable.veggie))
        cardModelArrayList.add(CardModel("Recipe Three", "noodles, vegetables", R.drawable.chow_mein))
        cardModelArrayList.add(CardModel("Recipe Four", "chicken, vegetables", R.drawable.chicken_dinner))
        cardModelArrayList.add(CardModel("Recipe Five", "vegetables", R.drawable.veggie))


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