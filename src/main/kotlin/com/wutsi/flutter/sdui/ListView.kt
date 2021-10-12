package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.Axis
import com.wutsi.flutter.sdui.enums.WidgetType

data class ListView(
    val direction: Axis? = null,
    val separator: Boolean? = null,
    val children: List<WidgetAware>
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.ListView,
        attributes = mapOf(
            "direction" to direction,
            "separator" to separator,
        ),
        children = children.map { it.toWidget() }
    )
}
