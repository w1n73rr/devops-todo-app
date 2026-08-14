package ru.romanow.todolist.model

import java.util.UUID

data class ListItem(
    val uid: UUID,
    val text: String,
)
