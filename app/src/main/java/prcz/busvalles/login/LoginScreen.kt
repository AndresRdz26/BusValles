package prcz.busvalles.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(navigateToHome: () -> Unit, navigateToRegister: () -> Unit) {
    Row (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xfff5a62a)),
    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text (
                    text = "BusValles",
                    color = Color.White,
                    fontSize = 64.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,

                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Black.copy(alpha = 0.5f))
                )
            }

            Row(
                modifier = Modifier
                    .weight(1f) // Proporción 1/3
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    Button(
                        onClick = { navigateToHome() },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(227, 126, 30),
                            contentColor = Color.White,
                        ),
                        border = BorderStroke(1.dp, Color.Black),
                        contentPadding = PaddingValues(top= 25.dp, bottom = 25.dp, start = 30.dp, end = 30.dp)
                    ) {
                        Text(
                            text = "Acceder",
                            fontSize = 32.sp,
                        )
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "¿No estás registrado? ", color= Color.White)
                        Text(
                            text = "Crear una cuenta",
                            modifier = Modifier.clickable {
                                navigateToRegister()
                            }
                        )
                    }

                }
            }
        }
    }
}