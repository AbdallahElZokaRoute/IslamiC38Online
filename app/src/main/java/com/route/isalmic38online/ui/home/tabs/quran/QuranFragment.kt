package com.route.isalmic38online.ui.home.tabs.quran

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import com.route.isalmic38online.core.local_data_source.AppSharedReferences
import com.route.isalmic38online.data.quran.SurahNameData
import com.route.isalmic38online.data.quran.ltNumOfSurahs
import com.route.isalmic38online.data.quran.ltSuras
import com.route.isalmic38online.ui.Constants
import com.route.isalmic38online.ui.surah_details_screen.SurahDetailsScreen
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.FragmentQuranBinding


class QuranFragment : Fragment(){

   lateinit var binding : FragmentQuranBinding
   lateinit var surahsAdapter: ChapterNamesAdapter
   var nightMode : Boolean = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         binding = FragmentQuranBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        surahsAdapter  = ChapterNamesAdapter(ltSuras.mapIndexed{index , it->
       SurahNameData(name = it,position = ltNumOfSurahs[index])
        })
        surahsAdapter.onSurahClickListener = object :OnSurahClickListener{
            override fun onClick(surahNameData: SurahNameData) {
                val intent = Intent(requireActivity(),SurahDetailsScreen::class.java)
                intent.putExtra(Constants.SURAH_NAME_KEY , surahNameData.name)
                intent.putExtra(Constants.SURAH_NUMBER_KEY , surahNameData.position)
                startActivity(intent)
            }

        }

        binding.recyclerViewSurahs.adapter = surahsAdapter

       nightMode = AppSharedReferences.read(Constants.NIGHT_MODE,false)

        if(nightMode){
            binding.switchButton.text = "Light Mode"
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

        }else{
            binding.switchButton.text = "Night mode"
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        }

        binding.switchButton.setOnClickListener {

            if(nightMode){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                AppSharedReferences.write(Constants.NIGHT_MODE,false)
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                AppSharedReferences.write(Constants.NIGHT_MODE,true)
            }

        }
    }




}