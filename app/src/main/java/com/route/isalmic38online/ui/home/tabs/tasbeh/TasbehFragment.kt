package com.route.isalmic38online.ui.home.tabs.tasbeh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.FragmentTasbehBinding


class TasbehFragment : Fragment() {

    lateinit var binding : FragmentTasbehBinding
    var counter = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTasbehBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tasbehSubhanCardView.setOnClickListener {
            ++counter
            binding.tasbehCounterText.text =  counter.toString()
        }
    }

}