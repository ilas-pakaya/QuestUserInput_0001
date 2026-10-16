package com.example.minggu5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import java.lang.reflect.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    // variabel-variabel
    var textNama by remember {mutableStateOf(value = "")}
    var textAlamat by remember {mutableStateOf(value = "")}
    var textJK by remember {mutableStateOf(value = "")}

    //variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember {mutableStateOf( value = "")}
    var alamat by remember {mutableStateOf( value = "")}
    var jenis by remember {mutableStateOf( value = "")}
    val gender:List<String> = listOf("Laki-laki", "Perempuan")

}