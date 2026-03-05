package com.example.todo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todo.ui.components.ToDoList
import com.example.todo.viewModel.ToDoUIState
import com.example.todo.viewModel.ToDoViewModel

@Composable
fun ToDoScreen(
    modifier: Modifier = Modifier,
    toDoViewModel: ToDoViewModel = viewModel()
) {
    Column(
        modifier = modifier.padding(20.dp)
    ) {

        Text (
            text = "To-Do list",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(bottom = 14.dp)
            )
        when (val uiState = toDoViewModel.todoUIState) {
            is ToDoUIState.Loading -> LoadingScreen()
            is ToDoUIState.Success -> ToDoList(todos = uiState.todos, modifier)
            is ToDoUIState.Error -> ErrorScreen(modifier)
        }
        // ToDoList(todos = toDoViewModel.todos, modifier)

    }

}