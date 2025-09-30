package com.filizzola.gridapp.data

import com.filizzola.gridapp.R
import com.filizzola.gridapp.model.CardCont

class Datasource {
    fun loadCards(): List<CardCont> {
        return listOf<CardCont>(

            CardCont(R.string.architecture, R.drawable.architecture, 58),
            CardCont(R.string.crafts, R.drawable.crafts, 121),
            CardCont(R.string.business, R.drawable.business, 78),
            CardCont(R.string.culinary, R.drawable.culinary, 118),
            CardCont(R.string.design, R.drawable.design, 423),
            CardCont(R.string.fashion, R.drawable.fashion, 92),
            CardCont(R.string.film, R.drawable.film, 165),
            CardCont(R.string.gaming, R.drawable.gaming, 164),
            CardCont(R.string.drawing, R.drawable.drawing, 326),
            CardCont(R.string.lifestyle, R.drawable.lifestyle, 305),
            CardCont(R.string.music, R.drawable.music, 212),
            CardCont(R.string.painting, R.drawable.painting, 172),
            CardCont(R.string.photography, R.drawable.photography, 321),
            CardCont(R.string.tech, R.drawable.tech, 118),
            CardCont(R.string.gaming, R.drawable.gaming, 164),
            CardCont(R.string.drawing, R.drawable.drawing, 326),
            CardCont(R.string.lifestyle, R.drawable.lifestyle, 305),
            CardCont(R.string.music, R.drawable.music, 212),
            CardCont(R.string.painting, R.drawable.painting, 172),
            CardCont(R.string.photography, R.drawable.photography, 321),
            CardCont(R.string.tech, R.drawable.tech, 118),
            CardCont(R.string.gaming, R.drawable.gaming, 164),
            CardCont(R.string.drawing, R.drawable.drawing, 326),
            CardCont(R.string.lifestyle, R.drawable.lifestyle, 305),
            CardCont(R.string.music, R.drawable.music, 212),
            CardCont(R.string.painting, R.drawable.painting, 172),
            CardCont(R.string.photography, R.drawable.photography, 321),
            CardCont(R.string.tech, R.drawable.tech, 118),

        )
    }
}