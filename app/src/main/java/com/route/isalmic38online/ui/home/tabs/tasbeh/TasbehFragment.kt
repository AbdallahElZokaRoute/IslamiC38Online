package com.route.isalmic38online.ui.home.tabs.tasbeh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.isalmic38online.databinding.FragmentTasbehBinding


class TasbehFragment : Fragment() {

    private lateinit var binding : FragmentTasbehBinding

    private val tasbehList = listOf(
        "سبحان الله",
        "الحمد لله",
        "الله أكبر",
        "لا حول ولا قوة إلا بالله",
        "لا إله إلا الله"
    )
    private var numOfTasbeh = 0
    private var indexOfTasbeh = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTasbehBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tasbehSubhanText.text = tasbehList[indexOfTasbeh]
        binding.tasbehCounterText.text = numOfTasbeh.toString()
        binding.tasbehSubhanCardView.setOnClickListener {

            numOfTasbeh++
            if (numOfTasbeh > 33) {
                numOfTasbeh = 0
                indexOfTasbeh++
                if (indexOfTasbeh > tasbehList.size - 1) {
                    indexOfTasbeh = 0
                }
            }
            binding.tasbehSubhanText.text = tasbehList[indexOfTasbeh]
            binding.tasbehCounterText.text = numOfTasbeh.toString()
        }
    }

}