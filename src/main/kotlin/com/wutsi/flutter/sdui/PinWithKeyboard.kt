package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class PinWithKeyboard(
    val name: String,
    val color: String? = null,
    val hideText: Boolean? = null,
    val maxLength: Int? = null,
    val deleteText: String? = null,
    val action: Action? = null,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.PinWidthKeyboard,
        attributes = mapOf(
            "name" to name,
            "color" to color,
            "deleteText" to deleteText,
            "maxLength" to maxLength,
            "hideText" to hideText,
        ),
        action = action
    )
}
