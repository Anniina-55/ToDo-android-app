package com.example.todo.viewModel

import androidx.lifecycle.ViewModel

class ToDoViewModel: ViewModel() {
    val todos = mutableListOf<String>()

    init {
        todos.add("Test task 1")
        todos.add("Test task 2")
        todos.add("Test task 3")

    }
}