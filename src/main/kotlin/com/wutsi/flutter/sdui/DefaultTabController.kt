package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class DefaultTabController(
    val length: Int,
    val initialIndex: Int? = null,
    val child: WidgetAware
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.DefaultTabController,
        attributes = mapOf(
            "length" to length,
            "initialIndex" to initialIndex
        ),
        children = listOf(child.toWidget())
    )
}
