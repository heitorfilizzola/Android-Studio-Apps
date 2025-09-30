package com.filizzola.gridapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CardCont(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    val numberResourceId: Int
)
