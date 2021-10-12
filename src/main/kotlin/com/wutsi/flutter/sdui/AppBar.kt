package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.AppBar

class AppBar(
    val title: String? = null,
    val children: List<IconButton> = emptyList()
) : WidgetAware {
    override fun toWidget() = Widget(
        type = AppBar,
        attributes = mapOf(
            "title" to title
        ),
        children = children.map { it.toWidget() }
    )
}
