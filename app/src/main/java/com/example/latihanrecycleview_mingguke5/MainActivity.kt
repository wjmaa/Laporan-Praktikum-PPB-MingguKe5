package com.example.latihanrecycleview_mingguke5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanrecycleview_mingguke5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var adapter: MyContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("12098764","Ibnu Jamil", "089656776543"),
            MyContact("48755600","Malik Ibrahim", "089644332109"),
            MyContact("90875422","Ilma Masih", "089456779908"),
            MyContact("87453389","Ruri Fitria", "089245789955"),
            MyContact("20108743","Dimas Ilham", "089456756644"),
            MyContact("23785466","Heri Firman", "089756332465"),
            MyContact("12098764","Ibnu Jamil", "089656776543"),
            MyContact("48755600","Malik Ibrahim", "089644332109"),
            MyContact("90875422","Ilma Masih", "089456779908"),
            MyContact("87453389","Ruri Fitria", "089245789955"),
            MyContact("20108743","Dimas Ilham", "089456756644"),
            MyContact("23785466","Heri Firman", "089756332465"),
            MyContact("12098764","Ibnu Jamil", "089656776543"),
            MyContact("48755600","Malik Ibrahim", "089644332109"),
            MyContact("90875422","Ilma Masih", "089456779908"),
            MyContact("87453389","Ruri Fitria", "089245789955"),
            MyContact("20108743","Dimas Ilham", "089456756644"),
            MyContact("23785466","Heri Firman", "089756332465"),
            MyContact("12098764","Ibnu Jamil", "089656776543"),
            MyContact("48755600","Malik Ibrahim", "089644332109"),
            MyContact("90875422","Ilma Masih", "089456779908"),
            MyContact("87453389","Ruri Fitria", "089245789955"),
            MyContact("20108743","Dimas Ilham", "089456756644"),
            MyContact("23785466","Heri Firman", "089756332465"),
        )

        adapter = MyContactAdapter(listStudent)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContacts.layoutManager = layoutManager
        binding.rvContacts.adapter = adapter
    }
}