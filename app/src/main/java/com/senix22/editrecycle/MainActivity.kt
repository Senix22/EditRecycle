package com.senix22.editrecycle

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
    var myList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myAdapter = MyListAdapter(this, myList)
        bnt_enter.setOnClickListener {
            when {
                ed_lastName.text.trim().isEmpty() -> {
                    Toast.makeText(baseContext, "Enter your Last Name", Toast.LENGTH_SHORT).show()
                }
                et_name.text.trim().isEmpty() -> {
                    Toast.makeText(baseContext, "Enter your First Name", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    val name = et_name.text.toString()
                    val lastName = ed_lastName.text.toString()
                    val person = Person(name, lastName)
                    myList.add("${person.lastName}    ${person.name} ")
                    myAdapter.notifyDataSetChanged()
                }
            }
        }

        recyclerView.adapter = myAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }


}