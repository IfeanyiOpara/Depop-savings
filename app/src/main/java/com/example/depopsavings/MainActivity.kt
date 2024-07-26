package com.example.depopsavings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.depopsavings.ui.theme.DepopSavingsTheme
import com.example.depopsavings.util.Route

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DepopSavingsTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { paddingValues ->
                    NavHost(
                        modifier = Modifier.padding(paddingValues = paddingValues),
                        navController = navController,
                        startDestination =  Route.HOME.value
                    ) {
                        composable(route = Route.HOME.value) {

                        }
                        composable(route = Route.LOGIN.value) {

                        }
                        composable(route = Route.REGISTER.value) {

                        }
                    }
                }
            }
        }
    }
}