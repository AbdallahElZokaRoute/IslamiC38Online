package com.route.isalmic38online.ui.home.tabs.tasbeh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.FragmentTasbehBinding
import com.route.isalmic38online.ui.Constants


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
         binding.tasbehSubhanText.text = Constants.SUBHAN_ALLAH
        binding.tasbehSubhanCardView.setOnClickListener {
            //val animation = AnimationUtils.loadAnimation(requireActivity(),R.anim.sebha_rotate)
            binding.tasbehBody.rotation = binding.tasbehBody.rotation+5
            ++counter
            binding.tasbehCounterText.text =  counter.toString()

            changeRemembrance()
        }

    }

    private fun changeRemembrance() {
        if(counter == 33 && binding.tasbehSubhanText.text == Constants.SUBHAN_ALLAH){
            binding.tasbehSubhanText.text = Constants.EL_HAMDULLAH
            restCounter()
        }else if(counter == 33 && binding.tasbehSubhanText.text == Constants.EL_HAMDULLAH){
            binding.tasbehSubhanText.text = Constants.ALLAHAKBUR
            restCounter()
        }else if(counter == 33 && binding.tasbehSubhanText.text == Constants.ALLAHAKBUR){
            binding.tasbehSubhanText.textSize = 18F
            binding.tasbehSubhanText.text = Constants.ELKETMA
            restCounter()
        }else if(counter == 33 && binding.tasbehSubhanText.text == Constants.ELKETMA){
            binding.tasbehSubhanText.textSize = 36F
            binding.tasbehSubhanText.text = Constants.SUBHAN_ALLAH
            restCounter()
        }
    }

    fun restCounter(){
        counter=0
        binding.tasbehCounterText.text =  counter.toString()
    }

}