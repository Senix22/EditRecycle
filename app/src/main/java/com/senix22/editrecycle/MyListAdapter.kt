package com.senix22.editrecycle

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.text.Editable
import android.text.SpannableString
import android.text.TextWatcher
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list_item.view.*

class MyListAdapter(private var context: Context, private var myList: ArrayList<String>) :
    RecyclerView.Adapter<TextViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val myList = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return TextViewHolder(myList)
    }

    override fun getItemCount(): Int {
        return myList.count()
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.bind(holder.itemView.tv_title.setTextColor(Color.BLUE).toString())
        holder.itemView.tv_title.setText(myList[position])
        when (position) {
            0 -> {
                val string = holder.itemView.tv_title.text
                val spannableString = SpannableString(string)
                val foregroundColorSpan = ForegroundColorSpan(Color.RED)
                spannableString.setSpan(foregroundColorSpan, 0, string.length / 2, 0)
                spannableString.setSpan(UnderlineSpan(), 0, string.length / 2, 0)
                holder.itemView.tv_title.text = (spannableString)
            }
            1 -> {
                val string = holder.itemView.tv_title.text
                val spannableString = SpannableString(string)
                val foregroundColorSpan = ForegroundColorSpan(Color.GREEN)
                spannableString.setSpan(foregroundColorSpan, 0, string.length / 2, 0)
                spannableString.setSpan(UnderlineSpan(), 0, string.length / 2, 0)
                holder.itemView.tv_title.text = (spannableString)
            }
            2 -> {
                val string = holder.itemView.tv_title.text
                val spannableString = SpannableString(string)
                val foregroundColorSpan = ForegroundColorSpan(Color.DKGRAY)
                spannableString.setSpan(foregroundColorSpan, 0, string.length / 2, 0)
                spannableString.setSpan(UnderlineSpan(), 0, string.length / 2, 0)
                holder.itemView.tv_title.text = (spannableString)
            }
            else -> {
                val string = holder.itemView.tv_title.text
                val spannableString = SpannableString(string)
                val foregroundColorSpan = ForegroundColorSpan(Color.CYAN)
                spannableString.setSpan(foregroundColorSpan, 0, string.length / 2, 0)

                spannableString.setSpan(UnderlineSpan(), 0, string.length / 2, 0)
                holder.itemView.tv_title.text = (spannableString)
            }

        }

    }


}
