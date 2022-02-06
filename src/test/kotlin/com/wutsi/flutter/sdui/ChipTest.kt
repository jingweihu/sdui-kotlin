package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class ChipTest {

    @Test
    fun toWidget() {
        val obj = Chip(
            child = Text("Yo"),
            color = "fff",
            padding = 10.0,
            elevation = 1.0,
            shadowColor = "xxx"
        )

        val widget = obj.toWidget()

        assertNull(widget.action)

        assertEquals(WidgetType.Chip, widget.type)

        assertEquals(4, widget.attributes.size)
        assertEquals(obj.padding, widget.attributes["padding"])
        assertEquals(obj.color, widget.attributes["color"])
        assertEquals(obj.elevation, widget.attributes["elevation"])
        assertEquals(obj.shadowColor, widget.attributes["shadowColor"])

        assertEquals(1, widget.children.size)
    }
}
