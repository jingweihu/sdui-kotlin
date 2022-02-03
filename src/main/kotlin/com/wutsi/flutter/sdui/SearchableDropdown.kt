package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class SearchableDropdown(
    val name: String,
    val value: String? = null,
    val hint: String? = null,
    val required: Boolean? = null,
    val children: List<DropdownMenuItem> = emptyList()
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.SearchableDropdown,
        attributes = mapOf(
            "name" to name,
            "value" to value,
            "hint" to hint,
            "required" to required
        ),
        children = children.map { it.toWidget() }
    )
}
