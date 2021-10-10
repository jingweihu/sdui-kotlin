package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.Column

class Column(
    val children: List<WidgetAware>
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Column,
        children = children.map { it.toWidget() }
    )
}
