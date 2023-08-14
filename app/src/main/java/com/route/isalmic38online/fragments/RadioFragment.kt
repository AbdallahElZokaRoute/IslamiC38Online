package com.route.isalmic38online.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.FragmentRadioBinding
import com.route.isalmic38online.databinding.FragmentSebhaBinding

class RadioFragment : Fragment() {
    lateinit var radrioFragment: FragmentRadioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        radrioFragment = FragmentRadioBinding.inflate(inflater,container,false)
        return radrioFragment.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}