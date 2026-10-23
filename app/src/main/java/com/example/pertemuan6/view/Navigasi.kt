package com.example.pertemuan6.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

enum class PengelolaHalaman {
    Form,
    Tampil
}

@Composable
fun Navigasi(
    modifier: Modifier = Modifier
) {
    var halamanAktif by remember { mutableStateOf(PengelolaHalaman.Form) }
    var namaState by remember { mutableStateOf("") }
    var jkState by remember { mutableStateOf("") }
    var alamatState by remember { mutableStateOf("") }

    when (halamanAktif) {
        PengelolaHalaman.Form -> {
            FormIsian(
                OnSubmitBtnClick = { listData ->
                    namaState = listData.getOrElse(0) { "" }
                    jkState = listData.getOrElse(1) { "" }
                    alamatState = listData.getOrElse(2) { "" }
                    halamanAktif = PengelolaHalaman.Tampil
                },
                modifier = modifier
            )
        }
        PengelolaHalaman.Tampil -> {
            TampilData(
                nama = namaState,
                jenisK = jkState,
                alamat = alamatState,
                onBackBtnClick = {
                    halamanAktif = PengelolaHalaman.Form
                },
                modifier = modifier
            )
        }
    }
}
