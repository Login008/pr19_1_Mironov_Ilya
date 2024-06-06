package com.example.criminalintent.ui.theme

import java.util.Date
import java.util.UUID

data class Crime(val id : UUID = UUID.randomUUID(), val date : Date = Date()) {
    lateinit var title : String
    var isSolved : Boolean = false

    fun constructor(title : String, isSolved : Boolean) {
        this.title = title
        this.isSolved = isSolved
    }
}