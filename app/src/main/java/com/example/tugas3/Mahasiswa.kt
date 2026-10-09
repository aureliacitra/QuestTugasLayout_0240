package com.example.tugas3

import androidx.annotation.ColorRes
import androidx.annotation.StringRes

data class Mahasiswa (
    @param:StringRes val nama: Int,
    @param:StringRes val telepon: Int? = null,
    @param:StringRes val alamat: Int,
    @param:ColorRes val warnaCard: Int,
    @param:ColorRes val warnaTelepon: Int,
    @param:ColorRes val warnaAlamat: Int,
    val namaCursive: Boolean = false
)