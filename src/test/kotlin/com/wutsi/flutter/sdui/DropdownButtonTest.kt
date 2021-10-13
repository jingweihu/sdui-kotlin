package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.DropdownButton
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class DropdownButtonTest {

    @Test
    fun toWidget() {
        val item = DropdownButton(
            name = "Yo",
            value = "man",
            required = true,
            hint = "foo bar",
            children = listOf(DropdownMenuItem("y", "x")),
        )

        val widget = item.toWidget()

        assertEquals(DropdownButton, widget.type)
        assertNull(widget.action)

        assertEquals(4, widget.attributes.size)
        assertEquals(item.name, widget.attributes["name"])
        assertEquals(item.value, widget.attributes["value"])
        assertEquals(item.required, widget.attributes["required"])
        assertEquals(item.hint, widget.attributes["hint"])

        assertEquals(1, widget.children.size)
    }
}
