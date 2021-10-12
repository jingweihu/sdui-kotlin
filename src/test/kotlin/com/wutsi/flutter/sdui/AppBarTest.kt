package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class AppBarTest {
    @Test
    fun toWidget() {
        val screen = AppBar(
            title = "Screen1",
            children = listOf(IconButton("i1"), IconButton("i2"))
        )

        val widget = screen.toWidget()

        assertEquals(WidgetType.AppBar, widget.type)

        assertEquals(1, widget.attributes.size)

        assertEquals(2, widget.children.size)

        assertNull(widget.action)
    }
}
