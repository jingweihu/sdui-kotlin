package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.Image

class Image(
    val url: String,
    val width: Double? = null,
    val height: Double? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Image,
        attributes = mapOf(
            "url" to url,
            "width" to width,
            "height" to height
        )
    )
}
