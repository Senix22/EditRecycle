package com.senix22.editrecycle

import android.graphics.Color
import android.text.Editable
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list_item.view.*

class TextViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    fun bind(myItem: String){
        itemView.tv_title.text = myItem
    }
}