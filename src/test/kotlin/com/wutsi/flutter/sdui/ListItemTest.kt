package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class ListItemTest {

    @Test
    fun toWidget() {
        val item = ListItem(
            caption = "foo",
            subCaption = "bar",
            iconLeft = "1",
            iconRight = "2",
            padding = 10.0
        )

        val widget = item.toWidget()

        assertEquals(WidgetType.ListItem, widget.type)
        assertNull(widget.action)

        assertEquals(5, widget.attributes.size)
        assertEquals(item.caption, widget.attributes["caption"])
        assertEquals(item.subCaption, widget.attributes["subCaption"])
        assertEquals(item.iconLeft, widget.attributes["iconLeft"])
        assertEquals(item.iconRight, widget.attributes["iconRight"])
        assertEquals(item.padding, widget.attributes["padding"])

        assertEquals(0, widget.children.size)
    }
}
