package com.aravindh.androidcore.user

class TodoResponse : ArrayList<TodoResponseItem>()

data class TodoResponseItem(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)