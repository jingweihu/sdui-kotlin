package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.Form

class Form(
    val padding: Double? = null,
    val children: List<WidgetAware> = emptyList()
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Form,
        attributes = mapOf(
            "padding" to padding
        ),
        children = children.map { it.toWidget() }
    )
}
