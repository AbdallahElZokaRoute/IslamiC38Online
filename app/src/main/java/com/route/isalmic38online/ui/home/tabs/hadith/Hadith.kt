package com.route.isalmic38online.ui.home.tabs.hadith

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable


@Parcelize
data class Hadith(
    val title: String,
    var hadithContent: String
):Parcelable
