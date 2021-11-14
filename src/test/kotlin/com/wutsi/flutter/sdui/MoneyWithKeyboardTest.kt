package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class MoneyWithKeyboardTest {

    @Test
    fun toWidget() {
        val button = MoneyWithKeyboard(
            moneyColor = "1111",
            name = "foo",
            maxLength = 7,
            deleteText = "xxx",
            keyboardButtonSize = 90.0,
            currency = "XAF",
            value = 10000,
            keyboardColor = "2222",
            numberFormat = "xxx"
        )

        val widget = button.toWidget()

        assertEquals(WidgetType.MoneyWithKeyboard, widget.type)
        assertNull(widget.action)

        assertEquals(9, widget.attributes.size)
        assertEquals(button.value, widget.attributes["value"])
        assertEquals(button.moneyColor, widget.attributes["moneyColor"])
        assertEquals(button.keyboardColor, widget.attributes["keyboardColor"])
        assertEquals(button.name, widget.attributes["name"])
        assertEquals(button.deleteText, widget.attributes["deleteText"])
        assertEquals(button.maxLength, widget.attributes["maxLength"])
        assertEquals(button.currency, widget.attributes["currency"])
        assertEquals(button.keyboardButtonSize, widget.attributes["keyboardButtonSize"])
        assertEquals(button.numberFormat, widget.attributes["numberFormat"])

        assertEquals(0, widget.children.size)
    }
}
