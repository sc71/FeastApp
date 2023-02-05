package com.example.feastapp2.ui.dashboard

import CardAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feastapp2.CardModel
import com.example.feastapp2.R
import com.example.feastapp2.databinding.FragmentClassesBinding

class ClassesFragment : Fragment() {

    private var _binding: FragmentClassesBinding? = null
    private lateinit var courseRV: RecyclerView
    private lateinit var suggestedRV: RecyclerView
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentClassesBinding.inflate(inflater, container, false)
        courseRV = binding.root.findViewById(R.id.enrolled_classes)
        suggestedRV = binding.root.findViewById(R.id.suggested_classes)

        val cardModelArrayList: ArrayList<CardModel> = ArrayList<CardModel>()
        cardModelArrayList.add(CardModel("Course One", "Week 9 of 16", R.drawable.ic_home))
        cardModelArrayList.add(CardModel("Course Two", "Week 2 of 8", R.drawable.ic_goal))
        cardModelArrayList.add(CardModel("Course Three", "Week 2 of 8", R.drawable.ic_learn))
        val cardModelArrayList2: ArrayList<CardModel> = ArrayList<CardModel>()
        cardModelArrayList2.add(CardModel("Course One", "Week 9 of 16", R.drawable.ic_home))
        cardModelArrayList2.add(CardModel("Course Two", "Week 2 of 8", R.drawable.ic_goal))
        cardModelArrayList2.add(CardModel("Course Three", "Week 2 of 8", R.drawable.ic_learn))

        val cardAdapter = CardAdapter(cardModelArrayList)
        val linearLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        val cardAdapter2 = CardAdapter(cardModelArrayList2)
        val linearLayoutManager2 = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)

        courseRV.layoutManager = linearLayoutManager
        courseRV.adapter = cardAdapter
        suggestedRV.layoutManager = linearLayoutManager2
        suggestedRV.adapter = cardAdapter2
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}