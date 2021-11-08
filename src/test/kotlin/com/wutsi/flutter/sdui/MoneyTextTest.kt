package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class MoneyTextTest {
    @Test
    fun toWidget() {
        val obj = MoneyText(
            currency = "XAD",
            value = 100.0,
            color = "ff0000"
        )

        val widget = obj.toWidget()

        assertEquals(WidgetType.MoneyText, widget.type)
        assertNull(widget.action)

        assertEquals(3, widget.attributes.size)
        assertEquals(obj.currency, widget.attributes["currency"])
        assertEquals(obj.value, widget.attributes["value"])
        assertEquals(obj.color, widget.attributes["color"])

        assertEquals(0, widget.children.size)
    }
}