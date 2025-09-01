package com.example.calculatorv2

sealed class CalculatorV2Actions {     //A sealed class in Kotlin is a special kind of class that restricts the inheritance of subclasses. It defines a closed type hierarchy where all possible subclasses are known at compile-time. This is useful when you have a fixed set of types and want to ensure that no other classes outside this set can inherit from it.
    data class Number(val number: Int): CalculatorV2Actions() //data class Number inheriting from calculato actions
    object Clear: CalculatorV2Actions()
    object Delete: CalculatorV2Actions()
    object Decimal: CalculatorV2Actions()
    object Calculate: CalculatorV2Actions()
    object Negation: CalculatorV2Actions()
    data class Operation(val operation: CalculatorV2Operations) : CalculatorV2Actions()
}