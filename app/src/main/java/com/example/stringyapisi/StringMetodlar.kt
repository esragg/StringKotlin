package com.example.stringyapisi

import androidx.compose.ui.text.toUpperCase

fun main() {

    val str1 = "Merhaba"

    println(str1.subSequence(0,3))
    println(str1.contains("er"))
    println(str1.uppercase())
    println(str1.lowercase())

    val str2 = "esra garcia gorman"

    val dizi = str2.split(" ")
    for (d in dizi) {
        println(d)
    }

    val str3 = " Merhaba "
    println(str3.trim())


}