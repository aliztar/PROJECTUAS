package com.example.projectuas

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class karaktercoc(
    val imgkaraktercoc: Int,
    val namekaraktercoc: String,
    val desckaraktercoc: String,
    val desc2karaktercoc: String,
):Parcelable
