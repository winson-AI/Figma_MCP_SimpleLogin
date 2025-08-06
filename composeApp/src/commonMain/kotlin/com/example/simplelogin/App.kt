package com.example.simplelogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import simplelogin.composeapp.generated.resources.Res
import simplelogin.composeapp.generated.resources.battery_icon
import simplelogin.composeapp.generated.resources.cellular_icon
import simplelogin.composeapp.generated.resources.wifi_icon
import simplelogin.composeapp.generated.resources.apple_icon
import simplelogin.composeapp.generated.resources.google_icon
import simplelogin.composeapp.generated.resources.facebook_icon

// Design colors from Figma
val DarkBlack = Color(0xFF332218)
val MediumDark = Color(0xFF2d201c)
val LightGray = Color(0xFFd6d6d6)

@Composable
@Preview
fun App() {
    MaterialTheme {
        SignUpScreen()
    }
}

@Composable
fun SignUpScreen() {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Status Bar
        StatusBar()
        
        Spacer(modifier = Modifier.height(76.dp))
        
        // Title
        Text(
            text = "Create\nyour account",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            lineHeight = 48.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier.fillMaxWidth()
        )
        
        Spacer(modifier = Modifier.height(115.dp))
        
        // Form Fields
        CustomTextField(
            value = name,
            onValueChange = { name = it },
            placeholder = "Enter your name"
        )
        
        Spacer(modifier = Modifier.height(20.dp))
        
        CustomTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = "Email address"
        )
        
        Spacer(modifier = Modifier.height(20.dp))
        
        CustomTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = "Password",
            isPassword = true
        )
        
        Spacer(modifier = Modifier.height(20.dp))
        
        CustomTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            placeholder = "Confirm password",
            isPassword = true
        )
        
        Spacer(modifier = Modifier.height(44.dp))
        
        // Sign Up Button
        Button(
            onClick = { /* Handle sign up */ },
            modifier = Modifier
                .width(147.dp)
                .height(51.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MediumDark),
            shape = RoundedCornerShape(26.5.dp)
        ) {
            Text(
                text = "SIGN UP",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        
        Spacer(modifier = Modifier.height(28.dp))
        
        // Or sign up with text
        Text(
            text = "or sign up with",
            fontSize = 12.sp,
            color = Color.Black.copy(alpha = 0.6f),
            letterSpacing = 0.24.sp
        )
        
        Spacer(modifier = Modifier.height(28.dp))
        
        // Social Media Icons
        SocialMediaButtons()
        
        Spacer(modifier = Modifier.height(30.dp))
        
        // Already have account
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Already have account?",
                fontSize = 14.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.width(7.dp))
            Text(
                text = "Log In",
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.clickable { /* Handle login */ }
            )
        }
    }
}

@Composable
fun StatusBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 17.dp, start = 13.dp, end = 13.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "9:41",
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black
        )
        
        Row(
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Cellular signal icon
            Image(
                painter = painterResource(Res.drawable.cellular_icon),
                contentDescription = "Cellular signal",
                modifier = Modifier.size(17.dp, 11.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            // WiFi icon
            Image(
                painter = painterResource(Res.drawable.wifi_icon),
                contentDescription = "WiFi signal",
                modifier = Modifier.size(15.dp, 11.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            // Battery icon
            Image(
                painter = painterResource(Res.drawable.battery_icon),
                contentDescription = "Battery",
                modifier = Modifier.size(24.dp, 11.dp)
            )
        }
    }
}

@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    isPassword: Boolean = false
) {
    Column {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            textStyle = androidx.compose.ui.text.TextStyle(
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Light
            ),
            visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(vertical = 13.dp)
                ) {
                    if (value.isEmpty()) {
                        Text(
                            text = placeholder,
                            fontSize = 14.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Light
                        )
                    }
                    innerTextField()
                }
            }
        )
        
        // Underline
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(LightGray)
        )
    }
}

@Composable
fun SocialMediaButtons() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        SocialButton(
            icon = Res.drawable.apple_icon,
            onClick = { /* Handle Apple login */ }
        )
        SocialButton(
            icon = Res.drawable.google_icon,
            onClick = { /* Handle Google login */ }
        )
        SocialButton(
            icon = Res.drawable.facebook_icon,
            onClick = { /* Handle Facebook login */ }
        )
    }
}

@Composable
fun SocialButton(
    icon: org.jetbrains.compose.resources.DrawableResource,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(42.dp)
            .border(1.dp, DarkBlack, CircleShape)
            .clip(CircleShape)
            .clickable { onClick() }
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(22.dp)
        )
    }
}