package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.CircleAvatar

class CircleAvatar(
    val radius: Double? = null,
    val backgroundColor: String? = null,
    val child: WidgetAware,
    val action: Action? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = CircleAvatar,
        attributes = mapOf(
            "radius" to radius,
            "backgroundColor" to backgroundColor
        ),
        children = listOf(child.toWidget()),
        action = action
    )
}
