package com.example.todo.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.todo.model.ToDo
import com.example.todo.ui.theme.Beetroot

@Composable
fun ToDoList(todos: List<ToDo>, modifier: Modifier) {

    LazyColumn (
        modifier = Modifier.padding(top = 16.dp)
    ) {

        items(todos) { todo ->
            ToDoItem(todo)
            Divider(color = Beetroot, thickness = 1.dp)
        }
    }
}