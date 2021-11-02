package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class PinWithKeyboard(
    val name: String,
    val color: String,
    val hideText: Boolean = false,
    val action: Action
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.PinWidthKeyboard,
        attributes = mapOf(
            "name" to name,
            "color" to color,
            "hideText" to hideText,
        ),
        action = action
    )
}
