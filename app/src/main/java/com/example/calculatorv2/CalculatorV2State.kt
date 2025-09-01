package com.example.calculatorv2

//this class will summarise the numbers
data class CalculatorV2State(
    val number1: String = "",   //using strings as strings are easier to deal with
    val number2: String = "",
    val operation: CalculatorV2Operations? = null
)
