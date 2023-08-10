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

    lateinit var sebha: ImageView
    lateinit var editCounter: TextView
    lateinit var txtThker: TextView
    lateinit var theker: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sebha, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        txtThker=view.findViewById(R.id.txt_theker)
        editCounter=view.findViewById(R.id.edit_counter)
        sebha=view.findViewById(R.id.sebha)
        theker = ArrayList()
        theker.add("سبحان الله")
        theker.add("الحمد لله")
        theker.add("الله أكبر")
        var counter=0
        var timer=1
        sebha.setOnClickListener{

            if (Integer.parseInt(editCounter.text.toString()) < 33){
                counter++
                editCounter.text=counter.toString()
                sebha.rotation += 11.1f
            }else{
                counter=0
                editCounter.text=counter.toString()
                timer++
                if (timer==1){
                    txtThker.text=theker.get(0)
                }else if (timer==2){
                    txtThker.text=theker.get(1)
                }else{
                    txtThker.text=theker.get(2)
                    timer=0
                }


            }
        }

    }

}
