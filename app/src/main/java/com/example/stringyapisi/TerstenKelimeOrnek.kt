package com.example.stringyapisi

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    print("Kelime giriniz: ")
    val kelime = girdi.next()

    for (i in kelime.length-1 downTo 0 ) {
        print(kelime[i])
    }
}