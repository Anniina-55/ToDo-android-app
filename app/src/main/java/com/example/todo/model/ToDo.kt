package com.example.todo.model

data class ToDo(
    //In case field names needed to be changed, @SerializedName annotation could be used -> e.g @SerializedName("userId") var uID: Int
    var userId: Int,
    var id: Int,
    var title: String,
    var completed: Boolean
)
