package com.example.todo.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp



@Composable

fun ToDoItem(todo: String) {
    Text(
        text = todo,
        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
    )
    Divider(color = Color.Green, thickness = 1.dp)
}
