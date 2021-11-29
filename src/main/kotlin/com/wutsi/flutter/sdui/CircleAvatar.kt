package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.CircleAvatar

class CircleAvatar(
    val radius: Double? = null,
    val child: WidgetAware,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = CircleAvatar,
        attributes = mapOf(
            "radius" to radius
        ),
        children = listOf(child.toWidget())
    )
}