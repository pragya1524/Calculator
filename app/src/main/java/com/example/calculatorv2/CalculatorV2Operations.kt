package com.example.calculatorv2

sealed class CalculatorV2Operations(val symbol : String) {
    object Add: CalculatorV2Operations("+")
    object Subtract: CalculatorV2Operations("-")
    object Multiply: CalculatorV2Operations("x")
    object Divide: CalculatorV2Operations("÷")
    object Percentage: CalculatorV2Operations("%")
    //object Negation: calculatorOperations("+/-")

}