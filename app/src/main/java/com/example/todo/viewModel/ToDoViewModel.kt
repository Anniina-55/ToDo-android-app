package com.example.todo.viewModel

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todo.model.ToDo
import com.example.todo.model.ToDosApi
import kotlinx.coroutines.launch

class ToDoViewModel: ViewModel() {
    var todos = mutableStateListOf<ToDo>()
        private set

    init {
        getTodosList()
    }

    private fun getTodosList() {
        viewModelScope.launch {
            var todosApi: ToDosApi = ToDosApi.getInstance()

            try {
                todosApi = ToDosApi.getInstance()
                todos.clear()
                todos.addAll(todosApi.getTodos())
            } catch (e: Exception) {
                Log.d("TODOVIEWMODEL", e.message.toString())
            }
        }
    }
}