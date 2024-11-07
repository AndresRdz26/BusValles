package prcz.busvalles.singup

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview()
@Composable
fun SingupScreen( navigateToMap: () -> Unit = {}, goBack: () -> Unit = {}) {

    var code by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var nip by remember { mutableStateOf("") }
    var nip2 by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xfff5a62a)),
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .minimumInteractiveComponentSize()
        ) {
            IconButton(
                onClick = {
                    goBack()
                },
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Rounded.ArrowBack, // Icono de flecha hacia atrás
                    contentDescription = "Regresar",
                    tint = Color.Black
                )
            }
        }


        Text(
            text = "Registro",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black.copy(alpha = 0.15f))
                .padding(30.dp)
        ) {
            Text(
                text = "Codigo:",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier =  Modifier.padding(0.dp, 10.dp)
            )
            TextField(
                value = code,
                onValueChange = { code = it},
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Correo:",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier =  Modifier.padding(0.dp, 10.dp)
            )
            TextField(
                value = email,
                onValueChange = { email = it},
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Nip:",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier =  Modifier.padding(0.dp, 10.dp)
            )
            TextField(
                value = nip,
                onValueChange = { nip = it},
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.NumberPassword),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Confirmar Nip:",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier =  Modifier.padding(0.dp, 10.dp)
            )
            TextField(
                value = nip2,
                onValueChange = { nip2 = it},
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.NumberPassword),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
        }


        Button(
            onClick = { navigateToMap() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(227, 126, 30),
                contentColor = Color.White,
            ),
            border = BorderStroke(1.dp, Color.Black),
            contentPadding = PaddingValues(top= 25.dp, bottom = 25.dp, start = 30.dp, end = 30.dp)
        ) {
            Text(
                text = "Registrarme",
                fontSize = 32.sp,
            )
        }
    }
}
