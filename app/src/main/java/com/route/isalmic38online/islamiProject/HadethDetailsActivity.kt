package com.route.isalmic38online.islamiProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.route.isalmic38online.R
import com.route.isalmic38online.islamiProject.adapters.HadethAdapter
import com.route.isalmic38online.islamiProject.adapters.VersesAdapter

class HadethDetailsActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: VersesAdapter
    lateinit var backIcon: ImageView
    var hadethTitle: String = ""
    var hadethContentArray = listOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hadeth_details)
        hadethContentArray =
            intent?.getStringArrayExtra(Constants.HADETH_CONTENT_KEY)?.toList() ?: listOf()
        hadethTitle = intent?.getStringExtra(Constants.HADETH_NAME_KEY) ?: ""
        recyclerView = findViewById(R.id.hadeth_recycler_view)
        adapter = VersesAdapter(hadethContentArray)
        recyclerView.adapter = adapter
        backIcon = findViewById(R.id.back_icon)
        backIcon.setOnClickListener { finish() }

    }
}