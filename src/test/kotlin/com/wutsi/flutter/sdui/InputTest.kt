package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.ActionType.Command
import com.wutsi.flutter.sdui.enums.InputType.Email
import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class InputTest {
    @Test
    fun toWidget() {
        val input = Input(
            id = "xx",
            name = "foo",
            value = "bar",
            type = Email,
            required = true,
            maxLength = 10,
            minLength = 3,
            action = Action(
                url = "http://www.google.ca.com/",
                type = Command
            ),
            caption = "Yo",
            enabled = false,
            hideText = true,
            hint = "This is the hint",
            maxLines = 10,
            readOnly = true,
            countries = listOf("CM", "GB")
        )

        val widget = input.toWidget()

        assertEquals(WidgetType.Input, widget.type)

        assertEquals(input.action?.url, widget.action?.url)
        assertEquals(input.action?.type, widget.action?.type)

        assertEquals(14, widget.attributes.size)
        assertEquals(input.id, widget.attributes["id"])
        assertEquals(input.name, widget.attributes["name"])
        assertEquals(input.value, widget.attributes["value"])
        assertEquals(input.type, widget.attributes["type"])
        assertEquals(input.required, widget.attributes["required"])
        assertEquals(input.maxLength, widget.attributes["maxLength"])
        assertEquals(input.minLength, widget.attributes["minLength"])
        assertEquals(input.caption, widget.attributes["caption"])
        assertEquals(input.enabled, widget.attributes["enabled"])
        assertEquals(input.hideText, widget.attributes["hideText"])
        assertEquals(input.hint, widget.attributes["hint"])
        assertEquals(input.maxLines, widget.attributes["maxLines"])
        assertEquals(input.readOnly, widget.attributes["readOnly"])
        assertEquals(input.countries, widget.attributes["countries"])

        assertEquals(0, widget.children.size)
    }
}
