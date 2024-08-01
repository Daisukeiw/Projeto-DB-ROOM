package com.example.appdatabaseinsert

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdatabaseinsert.ui.theme.AppDataBaseInsertTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppDataBaseInsertTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    appPreview()
                }
            }
        }
    }
}

@Composable
fun app() {
    var nome by remember {
        mutableStateOf("")
    }

    var telefone by remember {
        mutableStateOf("")
    }

    Column(
        Modifier
            .verticalScroll(rememberScrollState())
            .background(Color.White)
            .fillMaxWidth()
    ) {
        Row(
            Modifier
            .padding(20.dp)
        ){

        }

        Row(
            Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "\nApp Database",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }

        Row(
            Modifier
                .padding(20.dp)
                .fillMaxWidth(),

        ) {
            Text(
                text = "Nome: ",
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        TextField(
            value = nome,
            onValueChange = { nome = it },
            label = { Text("Digite seu nome completo") },
            maxLines = 2,
            modifier = Modifier.padding(20.dp)
        )

        Row(
            Modifier
                .padding(20.dp)
                .fillMaxWidth(),
        ) {
            Text(
                text = "Telefone: ",
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        TextField(
            value = telefone,
            onValueChange = { telefone = it },
            label = { Text("Digite o telefone...") },
            modifier = Modifier.padding(20.dp)
        )

        Row(
            Modifier
                .padding(20.dp, 20.dp, 10.dp, 0.dp)
                .fillMaxWidth(),
        ) {
            Button(
                onClick = { /* TODO */ }
            ) {
                Text(text = "Cadastrar")
            }
        }
    }
}

@Preview
@Composable
fun appPreview(){
    AppDataBaseInsertTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            app()
        }
    }
}