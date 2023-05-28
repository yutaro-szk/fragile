package com.myapplication

import FirstScreenView
import SecondScreenView
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "first") {
                composable("first") {
                    FirstScreenView {
                        navController.navigate("second")
                    }
                }
                composable("second") {
                    SecondScreenView()
                }
            }
        }
    }
}
