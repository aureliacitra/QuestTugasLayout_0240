package com.example.tugas3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    val daftarMahasiswa = listOf(
        Mahasiswa(
            nama = R.string.name_1,
            telepon = null,
            alamat = R.string.address_1,
            warnaCard = R.color.card_gray,
            warnaTelepon = R.color.text_yellow,
            warnaAlamat = R.color.text_yellow,
            namaCursive = true
        ),
        Mahasiswa(
            nama = R.string.name_2,
            telepon = R.string.phone_2,
            alamat = R.string.address_2,
            warnaCard = R.color.card_purple,
            warnaTelepon = R.color.text_cyan,
            warnaAlamat = R.color.text_yellow
        ),
        Mahasiswa(
            nama = R.string.name_3,
            telepon = R.string.phone_3,
            alamat = R.string.address_3,
            warnaCard = R.color.card_blue,
            warnaTelepon = R.color.text_cyan,
            warnaAlamat = R.color.text_white
        ),
        Mahasiswa(
            nama = R.string.name_4,
            telepon = R.string.phone_4,
            alamat = R.string.address_4,
            warnaCard = R.color.card_green,
            warnaTelepon = R.color.text_aqua,
            warnaAlamat = R.color.text_white
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.background_screen))
            .padding(dimensionResource(R.dimen.screen_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(dimensionResource(R.dimen.space_large)))
        Text(
            text = stringResource(R.string.title),
            fontSize = dimensionResource(R.dimen.title_size).value.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.text_title)
        )
        Text(
            text = stringResource(R.string.university),
            fontSize = dimensionResource(R.dimen.subtitle_size).value.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.text_title)
        )
        Spacer(Modifier.height(dimensionResource(R.dimen.space_medium)))
