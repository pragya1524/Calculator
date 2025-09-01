package com.example.calculatorv2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
//accepts events from the user
//doen't loose progess while rotation
//maps user input to ui
class CalculatorV2ViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorV2State()) //we can change the state from the outside but we can still access and read it
        private set

    fun onAction(action: CalculatorV2Actions){
        when(action){
            is CalculatorV2Actions.Number -> enterNumber(action.number)    //taking number input in a function enterNumber
            is CalculatorV2Actions.Clear -> state = CalculatorV2State()     //going back to initial state
            is CalculatorV2Actions.Decimal -> enterDecimal()                  //taking decimal number input
            is CalculatorV2Actions.Calculate -> performCalculation()              //to perform calculation
            is CalculatorV2Actions.Delete -> performDeletion()                          //deleting last digit
            is CalculatorV2Actions.Operation -> enterOperation(action.operation)   //taking the operation input
            is CalculatorV2Actions.Negation -> toggleSign()
        }
    }


    private fun enterOperation(operation: CalculatorV2Operations) {
        if (state.number1.isNotBlank()) {                                              //checks if the state is blank or not
            state =
                state.copy(operation = operation)                                //copies the old state with a new operation and assigns it to the new variable
        }
    }

    private fun performCalculation() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if(number1 != null && number2 !=null) {
            val result = when (state.operation) {
                is CalculatorV2Operations.Add -> number1 + number2
                is CalculatorV2Operations.Subtract -> number1 - number2
                is CalculatorV2Operations.Multiply -> number1 * number2
                is CalculatorV2Operations.Percentage -> (number1 * number2) / 100
                is CalculatorV2Operations.Divide -> number1 / number2
                null -> return
            }
            state = state.copy(
                number1 = result.toString().take(15),   // Limit result to 15 characters
                number2 = "",                              // Reset number2
                operation = null                          // Reset operation
            )
        }
    }

    private fun enterDecimal() {
        if (state.operation == null && !state.number1.contains(".") && state.number1.isNotBlank()){
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        }
        if (state.operation != null && !state.number2.contains(".") && state.number2.isNotBlank()){
            state = state.copy(
                number2 = state.number2 + "."
            )
            return
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operation == null){
            if(state.number1.length >= MAX_NUM_LENGTH) {                                //checking if the number is not too long
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
        if(state.number2.length >= MAX_NUM_LENGTH){
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )
    }

    companion object{
        private const val MAX_NUM_LENGTH = 8
    }

    private fun performDeletion(){
        when{
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operation != null -> state = state.copy(
                operation = null
            )
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun toggleSign() {
        if (state.operation == null) {
            val current = state.number1
            if (current.isBlank()) return
            state = if (current.startsWith("-")) {
                state.copy(number1 = current.drop(1))
            } else {
                state.copy(number1 = "-$current")
            }
            return
        }
        val current2 = state.number2
        if (current2.isBlank()) return
        state = if (current2.startsWith("-")) {
            state.copy(number2 = current2.drop(1))
        } else {
            state.copy(number2 = "-$current2")
        }
    }
}