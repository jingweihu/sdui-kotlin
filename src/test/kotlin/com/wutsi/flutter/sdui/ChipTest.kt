package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ChipTest {

    @Test
    fun toWidget() {
        val obj = Chip(
            child = Text("Yo"),
            color = "fff",
            padding = 10.0,
        )

        val widget = obj.toWidget()

        Assertions.assertNull(widget.action)

        Assertions.assertEquals(WidgetType.Chip, widget.type)

        Assertions.assertEquals(2, widget.attributes.size)
        Assertions.assertEquals(obj.padding, widget.attributes["padding"])
        Assertions.assertEquals(obj.color, widget.attributes["color"])

        Assertions.assertEquals(1, widget.children.size)
    }
}
