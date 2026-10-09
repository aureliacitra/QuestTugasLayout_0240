package com.example.tugas3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun MahasiswaCard(mahasiswa: Mahasiswa) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
            .background(colorResource(mahasiswa.warnaCard))
            .padding(dimensionResource(R.dimen.card_padding)),
        verticalAlignment = Alignment.CenterVertically
    ) { LogoCard()
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = dimensionResource(R.dimen.space_medium))
        ) {
            Text(
                text = stringResource(mahasiswa.nama),
                fontSize = dimensionResource(R.dimen.name_size).value.sp,
                fontWeight = if (mahasiswa.namaCursive) FontWeight.Normal else FontWeight.Bold,
                fontFamily = if (mahasiswa.namaCursive) FontFamily.Cursive else FontFamily.Default,
                fontStyle = if (mahasiswa.namaCursive) FontStyle.Italic else FontStyle.Normal,
                color = colorResource(R.color.text_white)
            )
            mahasiswa.telepon?.let {
                Text(
                    text = stringResource(it),
                    fontSize = dimensionResource(R.dimen.detail_size).value.sp,
                    color = colorResource(mahasiswa.warnaTelepon)
                )
            }
            Text(
                text = stringResource(mahasiswa.alamat),
                fontSize = dimensionResource(R.dimen.detail_size).value.sp,
                color = colorResource(mahasiswa.warnaAlamat)
            )
