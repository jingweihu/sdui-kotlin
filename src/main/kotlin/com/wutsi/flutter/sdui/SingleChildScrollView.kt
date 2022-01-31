package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.Axis
import com.wutsi.flutter.sdui.enums.WidgetType

class SingleChildScrollView(
    val scrollDirection: Axis? = null,
    val primary: Boolean? = null,
    val reverse: Boolean? = null,
    val padding: Double? = null,
    val children: List<WidgetAware> = emptyList()
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.SingleChildScrollView,
        children = children.map { it.toWidget() },
        attributes = mapOf(
            "scrollDirection" to scrollDirection,
            "primary" to primary,
            "reverse" to reverse,
            "padding" to padding,
        ),
    )
}
