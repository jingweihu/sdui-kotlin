package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.ButtonType
import com.wutsi.flutter.sdui.enums.ButtonType.Elevated
import com.wutsi.flutter.sdui.enums.WidgetType.Button

class Button(
    val caption: String,
    val type: ButtonType = Elevated,
    val padding: Double = 15.0,
    val action: Action? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Button,
        action = action,
        attributes = mapOf(
            "caption" to caption,
            "padding" to padding,
            "type" to type
        )
    )
}
