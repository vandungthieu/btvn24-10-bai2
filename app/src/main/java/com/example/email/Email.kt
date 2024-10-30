package com.example.email

data class Email(
    val senderName: String,
    val subject: String,
    val snippet: String,
    val time: String,
    val avatar: Char
)
