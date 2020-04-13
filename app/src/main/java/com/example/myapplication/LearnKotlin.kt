package com.example.myapplication

import kotlin.math.max

fun main() {
    val a = 37
    val b = 40
    val value = largerNumber(a, b)
    println("Larger Number is $value")
}
fun largerNumber(param1:Int, param2:Int)= max(param1,param2)
