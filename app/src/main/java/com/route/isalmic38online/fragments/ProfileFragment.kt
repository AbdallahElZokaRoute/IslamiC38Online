package com.route.isalmic38online.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.isalmic38online.R


class ProfileFragment : Fragment() {
    // When Creating a new view
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Recycler View Adapter
        // LayoutInflater -> Create View on Runtime.
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
    // When Binding Data and onClickListeners -> ()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Developer 1 => Developer Feature1 (Profile Fragment)
    }

}