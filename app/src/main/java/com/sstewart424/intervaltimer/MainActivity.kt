package com.sstewart424.intervaltimer

import android.os.Bundle
import android.widget.NumberPicker
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.material.color.MaterialColors
import kotlin.reflect.KProperty

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppBar()
        }
    }

    @Composable
    fun AppBar() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Interval Timer")
                    },
                    navigationIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Default.Menu, contentDescription = null)
                        }
                    },
                    elevation = 12.dp,
                )
            }
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                QuickStart()
            }
        }
    }

    @Composable
    fun QuickStart() {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colors.secondary, shape = RoundedCornerShape(4.dp))
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Quickstart")
            Timer(title = "Work")
            Timer(title = "Rest")
            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .align(CenterHorizontally)) {
                Text(text = "Start")
            }
        }
    }

    @Composable
    fun Timer(title: String) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = title, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.KeyboardArrowLeft, contentDescription = null)
                }
                BasicTextField(
                    value = "00",
                    onValueChange = {},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier.width(20.dp)
                )
                Text(text = ":", modifier = Modifier.padding(4.dp))
                BasicTextField(
                    value = "00",
                    onValueChange = {},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier.width(20.dp)
                )
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.KeyboardArrowRight, contentDescription = null)
                }
            }
        }
    }

    @Preview
    @Composable
    fun PreviewHomeScreen() {
        AppBar()
    }
}
