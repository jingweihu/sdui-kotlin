package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class DefaultTabController(
    val length: Int,
    val child: WidgetAware
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.DefaultTabController,
        attributes = mapOf(
            "length" to length,
        ),
        children = listOf(child.toWidget())
    )
}
