package com.example.stringyapisi

fun main() {

    val str1 = "Merhaba"
    println(str1)

    var str2 = String()
    str2 = "Kotlin"
    println(str2)

    val str3 = """
        NASILSIN
        MERHABA
        HEY
    """.trimIndent()
    println(str3)

    val str4 = "s"
    var str5 = String()
    str5 = "x"

    if(str4.isEmpty()){
        println("str4 bos")
    } else {
        println("str4 dolu")
    }
    if(str5.isEmpty()){
        println("str5 bos")
    } else {
        println("str5 dolu")
    }

    val varA = 10
    val varB = 20

    println("$varA x $varB = ${varA*varB}")

    val str6 = "Merhaba"
    val str7 = " Dunya"
    println(str6+str7)

    val str8 = "Merhaba, Kotlin !"
    println("$str8 boyutu: ${str8.length}")

    val str9 = "Merhaba"
    val str10 = "Merhaba Dunya"

    if(str9 == str10) {
        println("$str9 ve $str10 esittir")
    } else {
        println("$str9 ve $str10 esit degildir")
    }

    val str11 = "Merhaba"

    for(s in str11){
        println(s)
    }
}