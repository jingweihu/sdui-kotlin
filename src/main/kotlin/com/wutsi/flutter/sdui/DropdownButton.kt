package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class DropdownButton(
    val name: String,
    val value: String,
    val hint: String? = null,
    val required: Boolean? = null,
    val children: List<DropdownMenuItem> = emptyList()
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.DropdownButton,
        attributes = mapOf(
            "name" to name,
            "value" to value,
            "hint" to hint,
            "required" to required
        ),
        children = children.map { it.toWidget() }
    )
}
