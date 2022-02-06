package com.harsh.notes.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType) {
    class Title(order: OrderType) : NoteOrder(order)
    class Date(order: OrderType) : NoteOrder(order)
    class Color(order: OrderType) : NoteOrder(order)
}