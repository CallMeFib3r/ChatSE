package com.tristanwiley.chatse.chat.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Adapter for DialogPlus to show options for modifying a message (edit, delete, star)
 */
class ModifyMessageAdapter(private val dialogMessages: MutableList<String>, context: Context) : BaseAdapter() {

    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return dialogMessages.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val viewHolder: ModifyMessageAdapter.ViewHolder
        var view = convertView

        if (view == null) {
            view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false)

            viewHolder = ModifyMessageAdapter.ViewHolder()
            viewHolder.textView = view.findViewById(android.R.id.text1)
            view.tag = viewHolder
        } else {
            viewHolder = view.tag as ModifyMessageAdapter.ViewHolder
        }
        viewHolder.textView?.text = dialogMessages[position]

        return view
    }

    internal class ViewHolder {
        var textView: TextView? = null
    }
}
