package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.ActionType.Prompt
import com.wutsi.flutter.sdui.enums.ButtonType.Outlined
import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ButtonTest {
    @Test
    fun toWidget() {
        val button = Button(
            caption = "Yo",
            padding = 10.0,
            type = Outlined,
            stretched = false,
            action = Action(
                type = Prompt
            )
        )

        val widget = button.toWidget()

        assertEquals(WidgetType.Button, widget.type)
        assertEquals(button.action, widget.action)

        assertEquals(4, widget.attributes.size)
        assertEquals(button.caption, widget.attributes["caption"])
        assertEquals(button.padding, widget.attributes["padding"])
        assertEquals(button.type, widget.attributes["type"])
        assertEquals(button.stretched, widget.attributes["stretched"])

        assertEquals(0, widget.children.size)
    }
}
