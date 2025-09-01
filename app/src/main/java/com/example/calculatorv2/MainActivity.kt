package com.example.calculatorv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel // Corrected import
import com.example.calculatorv2.ui.theme.CalculatorV2Theme
//import com.example.calculatorv2.viewModel.CalculatorV2ViewModel // Assuming ViewModel is here

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorV2Theme {
                val viewModel = viewModel<CalculatorV2ViewModel>() // Correct usage of viewModel
                val state = viewModel.state
                val buttonSpacing = 6.dp
                val verticalSpacing = 2.dp
                CalculatorV2(
                    state = state,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    verticalSpacing = verticalSpacing,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                        .systemBarsPadding()
                        .padding(12.dp)
                )
            }
        }
    }
}

//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewmodel.Compose.viewModel
//import com.example.calculatorv2.ui.theme.CalculatorV2Theme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            CalculatorV2Theme {
//                val viewModel = viewModel<CalculatorV2ViewModel>()
//                val state = viewModel.state
//                val buttonSpacing = 8.dp
//                CalculatorV2(
//                    state = state,
//                    onAction = viewModel::onAction,
//                    buttonSpacing = buttonSpacing,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(MaterialTheme.colorScheme.background)
//                        .padding(16.dp)
//                )
//            }
//        }
//    }
//}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CalculatorV2Theme {
//        Greeting("Android")
//    }
//}