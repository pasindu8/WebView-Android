package com.example.email

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var progressBar: ProgressBar
    private lateinit var adapter: WebAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewWebsites)
        progressBar = findViewById(R.id.mainProgressBar)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val dummyWebsites = listOf(
            Website("Google", "https://www.dulshan.epizy.com/contactmobileappemail.php", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Google_Database.svg/1200px-Google_Database.svg.png"),
            Website("YouTube", "https://www.youtube.com", "https://upload.wikimedia.org/wikipedia/commons/e/ef/Youtube_logo.png"),
            Website("Wikipedia", "https://www.wikipedia.org", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Wikipedia-logo-v2.svg/1200px-Wikipedia-logo-v2.svg.png")
        )


        progressBar.visibility = View.GONE
        recyclerView.visibility = View.VISIBLE

        adapter = WebAdapter(dummyWebsites)
        recyclerView.adapter = adapter
    }
}