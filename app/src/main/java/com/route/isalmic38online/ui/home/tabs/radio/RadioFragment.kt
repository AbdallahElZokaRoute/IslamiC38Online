package com.route.isalmic38online.ui.home.tabs.radio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.isalmic38online.databinding.FragmentRadioBinding

class RadioFragment : Fragment() {


    lateinit var binding : FragmentRadioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRadioBinding.inflate(inflater,container,false)
        return binding.root
    }

}