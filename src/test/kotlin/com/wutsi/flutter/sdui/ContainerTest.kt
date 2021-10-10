package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.Alignment.BottomCenter
import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class ContainerTest {
    @Test
    fun toWidget() {
        val container = Container(
            padding = 1.0,
            alignment = BottomCenter,
            background = "aa0000",
            border = 2.0,
            borderColor = "cc0000",
            borderRadius = 3.0,
            margin = 4.0,
            child = Page(url = "xxx"),
        )

        val widget = container.toWidget()

        assertEquals(WidgetType.Container, widget.type)
        assertNull(widget.action)

        assertEquals(7, widget.attributes.size)
        assertEquals(container.padding, widget.attributes["padding"])
        assertEquals(container.alignment, widget.attributes["alignment"])
        assertEquals(container.background, widget.attributes["background"])
        assertEquals(container.border, widget.attributes["border"])
        assertEquals(container.borderColor, widget.attributes["borderColor"])
        assertEquals(container.margin, widget.attributes["margin"])

        assertEquals(1, widget.children.size)
    }
}
