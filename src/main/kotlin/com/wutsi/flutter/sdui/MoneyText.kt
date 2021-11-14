package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

class MoneyText(
    val value: Double,
    val currency: String,
    val color: String? = null,
    val numberFormat: String? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.MoneyText,
        attributes = mapOf(
            "value" to value,
            "color" to color,
            "currency" to currency,
            "numberFormat" to numberFormat,
        )
    )
}
