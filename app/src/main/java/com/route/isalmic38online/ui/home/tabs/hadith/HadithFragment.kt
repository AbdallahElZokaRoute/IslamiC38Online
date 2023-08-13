package com.route.isalmic38online.ui.home.tabs.hadith

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.FragmentHadithBinding

class HadithFragment : Fragment() {

   lateinit var binding : FragmentHadithBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHadithBinding.inflate(inflater,container,false)
        return binding.root
    }

}