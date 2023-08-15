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
        sebhaBinding.tasbeehBtn.setOnClickListener {
            onSebhaClick()
        }

    }
    fun onSebhaClick(){
        var counter = sebhaBinding.counter.text.toString().toInt()
        // from subhan allah to elhamdullah
        if (sebhaBinding.tasbeehBtn.text == getString(R.string.subhanallah)) {

            if (counter.toString().toInt() < 33) {
                counter++
                sebhaBinding.counter.text = counter.toString()
                sebhaBinding.sebhaIcon.rotation += 5
            } else {
                sebhaBinding.tasbeehBtn.text = getString(R.string.elhamdullah)
                sebhaBinding.counter.text = "0"
                sebhaBinding.sebhaIcon.rotation += 5
            }
        }
        // from elhamdullah to allahuakbar
        else if (sebhaBinding.tasbeehBtn.text == getString(R.string.elhamdullah)) {

            if (counter.toString().toInt() < 33) {
                counter++
                sebhaBinding.counter.text = counter.toString()
                sebhaBinding.sebhaIcon.rotation += 5
            } else {
                sebhaBinding.tasbeehBtn.text = getString(R.string.allahuakbar)
                sebhaBinding.counter.text = "0"
                sebhaBinding.sebhaIcon.rotation += 5
            }
        }
        // from allhuakbar to subhan allah
        else if (sebhaBinding.tasbeehBtn.text == getString(R.string.allahuakbar)) {

            if (counter.toString().toInt() < 33) {
                counter++
                sebhaBinding.counter.text = counter.toString()
                sebhaBinding.sebhaIcon.rotation += 5
            } else {
                sebhaBinding.tasbeehBtn.text = getString(R.string.subhanallah)
                sebhaBinding.counter.text = "0"
                sebhaBinding.sebhaIcon.rotation += 5
            }
        }
    }

}