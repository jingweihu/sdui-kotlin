package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class Radio(
    val caption: String,
    val subCaption: String? = null,
    val value: String? = null,
    val groupValue: String? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.Radio,
        attributes = mapOf(
            "caption" to caption,
            "subCaption" to subCaption,
            "value" to value,
            "groupValue" to groupValue
        )
    )
}
