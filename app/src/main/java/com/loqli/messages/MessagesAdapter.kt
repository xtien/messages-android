/*
 * Copyright (c) 2019, Zaphod Consulting BV, Christine Karman
 * This project is free software: you can redistribute it and/or modify it under the terms of
 * the Apache License, Version 2.0. You can find a copy of the license at
 * http://www. apache.org/licenses/LICENSE-2.0.
 */

package com.loqli.messages

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.loqli.messages.model.Message
import kotlinx.android.synthetic.main.message_list_item.view.*

/**
 * User: christine
 * Date: 1/25/19 2:39 PM
 */
class MessagesAdapter(val items: List<Message>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.message_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var status: Int = items.get(position).status
        holder.header.text = items.get(position).header
        holder.text.text = items.get(position).text
        holder.status.text = status.toString()
        holder.header.setTextColor(if (status < 5) Color.BLACK else Color.RED)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val header = view.header
    val text = view.text
    val status = view.status
}
