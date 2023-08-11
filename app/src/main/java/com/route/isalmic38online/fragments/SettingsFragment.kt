package com.route.isalmic38online.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.FragmentSettingsBinding

// Deprecated -> Will be removed in future Releases .


class SettingsFragment : Fragment() {
    lateinit var settingsBinding: FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        settingsBinding = FragmentSettingsBinding.inflate(layoutInflater)
        val view = settingsBinding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}

