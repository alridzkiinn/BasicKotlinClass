package com.example.nim234311031.basickotlinclass

data class Event(
    val title: String,
    val description: String? = null,  // Memberikan nilai default null
    val daypart: Daypart,
    val durationInMinutes: Int
)