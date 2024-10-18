package com.example.activity2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity2.ui.theme.Activity2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Activity2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicCompose(modifier: Modifier = Modifier){
     Column(
         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally,
         modifier = Modifier.fillMaxSize()) {
         Text(text = "LOGIN",
             modifier= modifier,
             color = Color.Gray,
             fontSize = (80.sp),
             fontWeight = FontWeight.Bold
         )
         Text(text = "Ini Adalah Halaman Login",
             modifier= modifier,
             color = Color.Black,
             fontSize = (10.sp),
             fontStyle = FontStyle.Italic,
         )
         Image(painter = painterResource(id = R.drawable.logo),
             contentDescription = null,
             modifier = Modifier.size(330.dp)
         )

     }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Activity2Theme {
        Greeting("Android")
    }
}
