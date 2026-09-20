package com.pemmob.aljatsiya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pemmob.aljatsiya.ui.screen.DaftarProdukScreen
import com.pemmob.aljatsiya.ui.theme.JualanTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JualanTheme {
                DaftarProdukScreen()
            }
        }
    }
}
