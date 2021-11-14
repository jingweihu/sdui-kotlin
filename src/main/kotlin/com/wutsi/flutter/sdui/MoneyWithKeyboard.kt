package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

data class MoneyWithKeyboard(
    val name: String,
    val maxLength: Int? = null,
    val value: Int? = null,
    val currency: String? = null,
    val keyboardColor: String? = null,
    val moneyColor: String? = null,
    val deleteText: String? = null,
    val keyboardButtonSize: Double? = null,
    val numberFormat: String? = null

) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.MoneyWithKeyboard,
        attributes = mapOf(
            "name" to name,
            "keyboardColor" to keyboardColor,
            "moneyColor" to moneyColor,
            "deleteText" to deleteText,
            "maxLength" to maxLength,
            "value" to value,
            "currency" to currency,
            "keyboardButtonSize" to keyboardButtonSize,
            "numberFormat" to numberFormat,
        )
    )
}
