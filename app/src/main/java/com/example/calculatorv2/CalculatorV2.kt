package com.example.calculatorv2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
//ui design for the calculator
fun CalculatorV2(
    state: CalculatorV2State,
    buttonSpacing: Dp = 8.dp,
    verticalSpacing: Dp = 2.dp,
    modifier: Modifier = Modifier,
    onAction: (CalculatorV2Actions) -> Unit
){
    Box(modifier = modifier){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(verticalSpacing),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 32.dp)
                    .padding(bottom = 16.dp)
            ) {
                val displayText = state.number1 + (state.operation?.symbol ?: "") + state.number2
                val fontSize = when {
                    displayText.length > 15 -> 50.sp
                    displayText.length > 12 -> 60.sp
                    else -> 80.sp
                }
                val lineHeight = when {
                    displayText.length > 15 -> 60.sp
                    displayText.length > 12 -> 70.sp
                    else -> 90.sp
                }
                
                Text(
                    text = displayText,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterEnd),
                    fontWeight = FontWeight.Light,
                    fontSize = fontSize,
                    color = MaterialTheme.colorScheme.onBackground,
                    maxLines = 2,
                    lineHeight = lineHeight,
                    softWrap = true,
                    overflow = TextOverflow.Visible
                )
            }

            //ROW 1
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorV2Button(
                    symbol = stringResource(R.string.AC),
                    backgroundColor = MaterialTheme.colorScheme.secondary,
                    color = MaterialTheme.colorScheme.onSecondary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Clear)
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Deletion),
                    backgroundColor = MaterialTheme.colorScheme.secondary,
                    color = MaterialTheme.colorScheme.onSecondary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Negation)
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Percentage),
                    backgroundColor = MaterialTheme.colorScheme.secondary,
                    color = MaterialTheme.colorScheme.onSecondary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Operation(CalculatorV2Operations.Percentage))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Division),
                    backgroundColor = MaterialTheme.colorScheme.primary,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Operation(CalculatorV2Operations.Divide))
                    }
                )
            }

            //ROW 2
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorV2Button(
                    symbol = stringResource(R.string.Seven),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(7))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Eight),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(8))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Nine),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(9))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Multiply),
                    backgroundColor = MaterialTheme.colorScheme.primary,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Operation(CalculatorV2Operations.Multiply))
                    }
                )
            }

            //ROW 3
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorV2Button(
                    symbol = stringResource(R.string.Four),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(4))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Five),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(5))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Six),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(6))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Subtract),
                    backgroundColor = MaterialTheme.colorScheme.primary,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Operation(CalculatorV2Operations.Subtract))
                    }
                )
            }

            //ROW 4
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorV2Button(
                    symbol = stringResource(R.string.One),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(1))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Two),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(2))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Three),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(3))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Add),
                    backgroundColor = MaterialTheme.colorScheme.primary,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Operation(CalculatorV2Operations.Add))
                    }
                )
            }

            //ROW 5
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorV2Button(
                    symbol = stringResource(R.string.Zero),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Number(0))
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Decimal),
                    backgroundColor = MaterialTheme.colorScheme.tertiary,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Decimal)
                    }
                )
                CalculatorV2Button(
                    symbol = stringResource(R.string.Equals),
                    backgroundColor = MaterialTheme.colorScheme.primary,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    //textStyle =    ,
                    onClick = {
                        onAction(CalculatorV2Actions.Calculate)
                    }
                )
            }
        }
    }
}