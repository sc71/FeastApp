package com.example.feastapp2.ui.home

import NewsAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feastapp2.CardModel
import com.example.feastapp2.NewsModel
import com.example.feastapp2.R
import com.example.feastapp2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var postRV: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        postRV = binding.root.findViewById(R.id.news_feed)

        val newsModelArrayList: ArrayList<NewsModel> = ArrayList<NewsModel>()
        newsModelArrayList.add(NewsModel("Course One", 23, R.drawable.ic_baseline_person_24))
        newsModelArrayList.add(NewsModel("Course Two", 14, R.drawable.ic_baseline_person_24))
        newsModelArrayList.add(NewsModel("Course Three", 32, R.drawable.ic_baseline_person_24))

        val newsAdapter = NewsAdapter(newsModelArrayList)
        val linearLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)

        postRV.layoutManager = linearLayoutManager
        postRV.adapter = newsAdapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}