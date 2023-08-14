package com.route.isalmic38online.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.FragmentSebhaBinding

class SebhaFragment : Fragment() {
    lateinit var sebhaBinding: FragmentSebhaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       sebhaBinding = FragmentSebhaBinding.inflate(inflater,container,false)
        return sebhaBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}