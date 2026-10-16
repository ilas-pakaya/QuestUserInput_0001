package com.example.minggu5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    // variabel-variabel
    var textNama by remember {mutableStateOf(value = "")}
    var textAlamat by remember {mutableStateOf(value = "")}
    var textJk by remember {mutableStateOf(value = "")}
}