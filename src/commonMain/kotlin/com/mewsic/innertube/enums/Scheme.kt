package com.mewsic.innertube.enums

import com.mewsic.innertube.ext.toLowerCase

enum class Scheme {
    HTTP,
    HTTPS;

    override fun toString(): String {
        return toLowerCase()
    }
}
