package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class RadioGroup(
    val separator: Boolean? = null,
    val separatorColor: String? = null,
    val name: String,
    val value: String? = null,
    val children: List<Radio>,
    val action: Action? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.RadioGroup,
        attributes = mapOf(
            "name" to name,
            "value" to value,
            "separator" to separator,
            "separatorColor" to separatorColor,
        ),
        children = children.map { it.toWidget() },
        action = action
    )
}
