package com.route.isalmic38online.islamiProject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.route.isalmic38online.R

class SebhaFragment : Fragment() {
    var tasbehImage: ImageView? = null
    var tasbehCounter: TextView? = null
    var zektext: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sebha, container, false)
    }
    private fun onTasbehClick() {
        val azkar = arrayOf(
            "سُبْحَانَ اللَّهِ",
            "الْحَمْدُ للّهِ",
            "الْلَّهُ أَكْبَرَُّ",
            " لا إله إلا الله وحده لا شريك له، له الملك، وله الحمد، وهو على كل شيء قدير"
        )
        var tasbehClicks = 0
        var cycleCounter = 0
        zektext?.text = azkar[0].trim()
        tasbehImage?.setOnClickListener {
            tasbehClicks++
            cycleCounter++
            if (cycleCounter == 34) cycleCounter = 1
            tasbehCounter?.text = cycleCounter.toString()
            tasbehImage!!.rotation = (tasbehClicks.toString() + "f").toFloat()
            when (tasbehClicks) {
                34 -> zektext?.text = azkar[1].trim()
                67 -> zektext?.text = azkar[2].trim()
                100 -> {
                    zektext?.text = azkar[0].trim()
                    tasbehClicks = 1
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tasbehImage = view.findViewById(R.id.sebha_body)
        tasbehCounter = view.findViewById(R.id.tasbeh_counter)
        zektext = view.findViewById(R.id.zekr_name)
        onTasbehClick()

    }
}
