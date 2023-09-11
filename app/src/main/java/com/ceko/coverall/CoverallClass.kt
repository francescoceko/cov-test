package com.ceko.coverall

class CoverallClass {


    fun mockMethod(input: Int) = when(input){
        1 -> "A"
        2 -> "B"
        else -> "C"
    }

}