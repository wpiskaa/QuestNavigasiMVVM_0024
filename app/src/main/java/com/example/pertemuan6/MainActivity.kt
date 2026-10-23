package com.example.pertemuan6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pertemuan6.ui.theme.Pertemuan6Theme
import com.example.pertemuan6.view.FormIsian
import com.example.pertemuan6.view.Navigasi
import com.example.pertemuan6.view.TampilData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan6Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Navigasi(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormIsianPreview() {
    Pertemuan6Theme {
        FormIsian(
            OnSubmitBtnClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TampilDataPreview() {
    Pertemuan6Theme {
        TampilData(
            nama = "Contoh Nama",
            jenisK = "Lainnya",
            alamat = "Yogyakarta"
        )
    }
}