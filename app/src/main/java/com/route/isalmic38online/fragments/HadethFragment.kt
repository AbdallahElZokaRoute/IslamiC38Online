package com.route.isalmic38online.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.isalmic38online.databinding.FragmentHadethBinding

// Deprecated -> Will be removed in future Releases .


class HadethFragment : Fragment() {
    lateinit var hadethFragment: FragmentHadethBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        hadethFragment = FragmentHadethBinding.inflate(inflater,container,false)
        val view = hadethFragment.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}

