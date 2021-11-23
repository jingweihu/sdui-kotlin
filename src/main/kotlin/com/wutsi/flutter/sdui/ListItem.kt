package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class ListItem(
    val caption: String,
    val subCaption: String? = null,
    val iconLeft: String? = null,
    val iconRight: String? = null,
    val padding: Double? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.ListItem,
        attributes = mapOf(
            "caption" to caption,
            "subCaption" to subCaption,
            "iconLeft" to iconLeft,
            "iconRight" to iconRight,
            "padding" to padding,
        )
    )
}
