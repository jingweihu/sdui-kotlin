package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class RadioGroup(
    val name: String,
    val value: String? = null,
    val children: List<Radio>
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.RadioGroup,
        attributes = mapOf(
            "name" to name,
            "value" to value,
        ),
        children = children.map { it.toWidget() }
    )
}
