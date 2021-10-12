package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class IconButtonTest {

    @Test
    fun toWidget() {
        val button = IconButton(
            icon = "0erf",
            size = 100.0,
            color = "ff0000",
            tooltip = "yo"
        )

        val widget = button.toWidget()

        assertEquals(WidgetType.IconButton, widget.type)
        assertNull(widget.action)

        assertEquals(4, widget.attributes.size)
        assertEquals(button.icon, widget.attributes["icon"])
        assertEquals(button.size, widget.attributes["size"])
        assertEquals(button.color, widget.attributes["color"])
        assertEquals(button.tooltip, widget.attributes["tooltip"])

        assertEquals(0, widget.children.size)
    }
}
