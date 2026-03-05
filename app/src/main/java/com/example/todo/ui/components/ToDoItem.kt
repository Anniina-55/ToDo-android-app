package com.example.todo.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.todo.model.ToDo
import com.example.todo.ui.theme.LightBeetroot

@Composable

fun ToDoItem(todo: ToDo) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .background(
                color = LightBeetroot,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(16.dp)
    ) {

        Text(
            text = todo.title,
            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
        )

    }
}
