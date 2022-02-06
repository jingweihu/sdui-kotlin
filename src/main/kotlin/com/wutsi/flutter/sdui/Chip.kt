package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

class Chip(
    val color: String? = null,
    val shadowColor: String? = null,
    val padding: Double? = null,
    val elevation: Double? = null,
    val child: WidgetAware,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.Chip,
        children = if (child == null) emptyList() else listOf(child.toWidget()),
        attributes = mapOf(
            "color" to color,
            "padding" to padding,
            "elevation" to elevation,
            "shadowColor" to shadowColor,
        )
    )
}
