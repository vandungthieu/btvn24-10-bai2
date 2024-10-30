package com.example.email

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderName: TextView = itemView.findViewById(R.id.senderName)
        val emailSubject: TextView = itemView.findViewById(R.id.emailSubject)
        val emailSnippet: TextView = itemView.findViewById(R.id.emailSnippet)
        val emailTime: TextView = itemView.findViewById(R.id.emailTime)
        val avatarText: TextView = itemView.findViewById(R.id.avatarText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.senderName.text = email.senderName
        holder.emailSubject.text = email.subject
        holder.emailSnippet.text = email.snippet
        holder.emailTime.text = email.time
        holder.avatarText.text = email.avatar.toString()
    }

    override fun getItemCount() = emails.size
}
