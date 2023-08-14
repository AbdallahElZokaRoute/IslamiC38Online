package com.route.isalmic38online.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.isalmic38online.databinding.FragmentQuranBinding


class QuranFragment : Fragment() {
    lateinit var quranBinding: FragmentQuranBinding
    lateinit var adapter: QuranRecyclerAdapter
    var titles = arrayOf(
        arrayOf("الفاتحة", "7"),
        arrayOf("البقرة", "286"),
        arrayOf("آل عمران", "200"),
        arrayOf("النساء", "176"),
        arrayOf("المائدة", "120"),
        arrayOf("الأنعام", "165"),
        arrayOf("الأعراف", "206"),
        arrayOf("الأنفال", "75"),
        arrayOf("التوبة", "129"),
        arrayOf("يونس", "109"),
        arrayOf("هود", "123"),
        arrayOf("يوسف", "111"),
        arrayOf("الرعد", "43"),
        arrayOf("إبراهيم", "52"),
        arrayOf("الحجر", "99"),
        arrayOf("النحل", "128"),
        arrayOf("الإسراء", "111"),
        arrayOf("الكهف", "110"),
        arrayOf("مريم", "98"),
        arrayOf("طه", "135"),
        arrayOf("الأنبياء", "112"),
        arrayOf("الحج", "78"),
        arrayOf("المؤمنون", "118"),
        arrayOf("النّور", "64"),
        arrayOf("الفرقان", "77"),
        arrayOf("الشعراء", "227"),
        arrayOf("النّمل", "93"),
        arrayOf("القصص", "88"),
        arrayOf("العنكبوت", "69"),
        arrayOf("الرّوم", "60"),
        arrayOf("لقمان", "34"),
        arrayOf("السجدة", "30"),
        arrayOf("الأحزاب", "73"),
        arrayOf("سبأ", "54"),
        arrayOf("فاطر", "45"),
        arrayOf("يس", "83"),
        arrayOf("الصافات", "182"),
        arrayOf("ص", "88"),
        arrayOf("الزمر", "75"),
        arrayOf("غافر", "85"),
        arrayOf("فصّلت", "54"),
        arrayOf("الشورى", "53"),
        arrayOf("الزخرف", "89"),
        arrayOf("الدّخان", "59"),
        arrayOf("الجاثية", "37"),
        arrayOf("الأحقاف", "35"),
        arrayOf("محمد", "38"),
        arrayOf("الفتح", "29"),
        arrayOf("الحجرات", "18"),
        arrayOf("ق", "45"),
        arrayOf("الذاريات", "60"),
        arrayOf("الطور", "49"),
        arrayOf("النجم", "62"),
        arrayOf("القمر", "55"),
        arrayOf("الرحمن", "78"),
        arrayOf("الواقعة", "96"),
        arrayOf("الحديد", "29"),
        arrayOf("المجادلة", "22"),
        arrayOf("الحشر", "24"),
        arrayOf("الممتحنة", "13"),
        arrayOf("الصف", "14"),
        arrayOf("الجمعة", "11"),
        arrayOf("المنافقون", "11"),
        arrayOf("التغابن", "18"),
        arrayOf("الطلاق", "12"),
        arrayOf("التحريم", "12"),
        arrayOf("الملك", "30"),
        arrayOf("القلم", "52"),
        arrayOf("الحاقة", "52"),
        arrayOf("المعارج", "44"),
        arrayOf("نوح", "28"),
        arrayOf("الجن", "28"),
        arrayOf("المزّمّل", "20"),
        arrayOf("المدّثر", "56"),
        arrayOf("القيامة", "40"),
        arrayOf("الإنسان", "31"),
        arrayOf("المرسلات", "50"),
        arrayOf("النبأ", "40"),
        arrayOf("النازعات", "46"),
        arrayOf("عبس", "42"),
        arrayOf("التكوير", "29"),
        arrayOf("الإنفطار", "19"),
        arrayOf("المطفّفين", "36"),
        arrayOf("الإنشقاق", "25"),
        arrayOf("البروج", "22"),
        arrayOf("الطارق", "17"),
        arrayOf("الأعلى", "19"),
        arrayOf("الغاشية", "26"),
        arrayOf("الفجر", "30"),
        arrayOf("البلد", "20"),
        arrayOf("الشمس", "15"),
        arrayOf("الليل", "21"),
        arrayOf("الضحى", "11"),
        arrayOf("الشرح", "8"),
        arrayOf("التين", "8"),
        arrayOf("العلق", "19"),
        arrayOf("القدر", "5"),
        arrayOf("البينة", "8"),
        arrayOf("الزلزلة", "8"),
        arrayOf("العاديات", "11"),
        arrayOf("القارعة", "11"),
        arrayOf("التكاثر", "8"),
        arrayOf("العصر", "3"),
        arrayOf("الهمزة", "9"),
        arrayOf("الفيل", "5"),
        arrayOf("قريش", "4"),
        arrayOf("الماعون", "7"),
        arrayOf("الكوثر", "3"),
        arrayOf("الكافرون", "6"),
        arrayOf("النصر", "3"),
        arrayOf("المسد", "5"),
        arrayOf("الإخلاص", "4"),
        arrayOf("الفلق", "5"),
        arrayOf("الناس", "6")
    )

    // When Creating a new view
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        quranBinding = FragmentQuranBinding.inflate(inflater,container,false)
        return quranBinding.root
    }
    // When Binding Data and onClickListeners -> ()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()

    }
    private fun initRecyclerView(){
        adapter = QuranRecyclerAdapter(titles)
        quranBinding.rvQuran.adapter = adapter

    }

}