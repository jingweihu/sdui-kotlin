package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ListItemSwitchTest {

    @Test
    fun toWidget() {
        val item = ListItemSwitch(
            name = "field",
            selected = true,
            caption = "foo",
            subCaption = "bar",
            icon = "1"
        )

        val widget = item.toWidget()

        assertEquals(WidgetType.ListItemSwitch, widget.type)

        assertEquals(item.action, widget.action)

        assertEquals(5, widget.attributes.size)
        assertEquals(item.caption, widget.attributes["caption"])
        assertEquals(item.subCaption, widget.attributes["subCaption"])
        assertEquals(item.icon, widget.attributes["icon"])
        assertEquals(item.selected, widget.attributes["selected"])
        assertEquals(item.name, widget.attributes["name"])

        assertEquals(0, widget.children.size)
    }
}
