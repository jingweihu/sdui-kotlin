package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.Container

class ClipRRect(
    val borderRadius: Double? = null,
    val child: WidgetAware? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Container,
        attributes = mapOf(
            "borderRadius" to borderRadius
        ),
        children = child?.let { listOf(it.toWidget()) } ?: emptyList()
    )
}
