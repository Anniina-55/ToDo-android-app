package com.example.todo.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todo.ui.components.ToDoList
import com.example.todo.viewModel.ToDoViewModel

@Composable
fun ToDoScreen(modifier: Modifier = Modifier, toDoViewModel: ToDoViewModel = viewModel()) {
    ToDoList(todos = toDoViewModel.todos, modifier)

}