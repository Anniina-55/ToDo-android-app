package com.example.todo.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ToDoList(todos: List<String>, modifier: Modifier) {

    LazyColumn (
        modifier = Modifier.padding(16.dp)
    ) {
        items(todos) { todo ->
            ToDoItem(todo)
        }
    }
}