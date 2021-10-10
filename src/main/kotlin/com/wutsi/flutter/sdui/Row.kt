package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.Row

class Row(
    val children: List<WidgetAware>
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Row,
        children = children.map { it.toWidget() }
    )
}
