package com.example.todo.viewModel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todo.model.ToDo
import com.example.todo.model.ToDosApi
import kotlinx.coroutines.launch


sealed interface ToDoUIState {
    data class Success(val todos: List<ToDo>) : ToDoUIState
    object Error : ToDoUIState
    object Loading : ToDoUIState
}
class ToDoViewModel: ViewModel() {
    // var todos = mutableStateListOf<ToDo>()
    var todoUIState: ToDoUIState by mutableStateOf(ToDoUIState.Loading)
        private set

    init {
        getTodosList()
    }

    private fun getTodosList() {
        viewModelScope.launch {
            var todosApi: ToDosApi = ToDosApi.getInstance()

            try {
                todosApi = ToDosApi.getInstance()
                todoUIState = ToDoUIState.Success(todosApi.getTodos())
                // todos.clear()
                // todos.addAll(todosApi.getTodos())
            } catch (e: Exception) {
                Log.d("TODOVIEWMODEL", e.message.toString())
                todoUIState = ToDoUIState.Error
            }
        }
    }
}