package com.example.finalurisapplication

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(private val xContext: Context, private val dataSource: List<User>) : BaseAdapter(){
    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater =  LayoutInflater.from(xContext);
        val layout = layoutInflater.inflate(R.layout.main_listview_layout, parent, false);

        val nameTextView =  layout.findViewById<TextView>(R.id.listViewNameView);
        val positionView =  layout.findViewById<TextView>(R.id.listViewPositionView);

        nameTextView.text = "${dataSource[position].name} ${dataSource[position].lastName}"
        positionView.text = "Age: ${dataSource[position].age}"

        return layout
//        val txtView = TextView(xContext);
//        txtView.text = dataSource[position];
//
//        txtView.setTextColor(Color.WHITE);
//        txtView.setPadding(25, 25, 25, 25);
//
//        return txtView
    }

}