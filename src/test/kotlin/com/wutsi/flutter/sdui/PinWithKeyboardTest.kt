package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.ActionType.Prompt
import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PinWithKeyboardTest {
    @Test
    fun toWidget() {
        val button = PinWithKeyboard(
            hideText = true,
            color = "1111",
            name = "foo",
            action = Action(
                type = Prompt
            ),
            maxLength = 7,
            deleteText = "xxx"
        )

        val widget = button.toWidget()

        assertEquals(WidgetType.PinWidthKeyboard, widget.type)
        assertEquals(button.action, widget.action)

        assertEquals(5, widget.attributes.size)
        assertEquals(button.hideText, widget.attributes["hideText"])
        assertEquals(button.color, widget.attributes["color"])
        assertEquals(button.name, widget.attributes["name"])
        assertEquals(button.deleteText, widget.attributes["deleteText"])
        assertEquals(button.maxLength, widget.attributes["maxLength"])

        assertEquals(0, widget.children.size)
    }
}
