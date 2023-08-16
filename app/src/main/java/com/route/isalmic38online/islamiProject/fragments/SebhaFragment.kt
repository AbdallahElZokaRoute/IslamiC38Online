package com.route.isalmic38online.islamiProject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.route.isalmic38online.R
import com.route.isalmic38online.islamiProject.Constants

class SebhaFragment : Fragment() {
    lateinit var imageView: ImageView
    lateinit var tv_numOfTasbeh: TextView
    lateinit var tv_counter: TextView
    lateinit var tv_wordsTasbeh: TextView
    var counter=0
    var words=0
    val words_Tasbeh= arrayOf(
        Constants.sobhan_allah,
        Constants.elhmd_llaah,
        Constants.la_Elah_Ela_Allah,
        Constants.Alaah_Akbar)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sebha, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView=view.findViewById(R.id.iv_body_sebha)
        tv_counter=view.findViewById(R.id.tv_counter)
        tv_numOfTasbeh=view.findViewById(R.id.tv_num_of_tasbeh)
        tv_wordsTasbeh=view.findViewById(R.id.tv_words_tasbeh)
        tv_wordsTasbeh.text= Constants.sobhan_allah
        tv_counter.text=counter.toString()
        imageView.setOnClickListener(View.OnClickListener {
            imageView.rotation=imageView.rotation+5
            counter ++
            if (counter==33) {
                counter=0
                words++
                if (words==words_Tasbeh.size) {
                    words=0
                }
                tv_counter.text="0"
                tv_wordsTasbeh.text=words_Tasbeh[words]
            }
            else
            {
                tv_counter.text=counter.toString()
            }
        })
    }

}
