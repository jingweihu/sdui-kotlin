package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.ActionType
import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CircleAvatarTest {

    @Test
    fun toWidget() {
        val obj = CircleAvatar(
            radius = 30.0,
            child = Container(),
            action = Action(type = ActionType.Command)
        )

        val widget = obj.toWidget()

        assertEquals(WidgetType.CircleAvatar, widget.type)
        assertEquals(obj.action, widget.action)

        assertEquals(1, widget.attributes.size)
        assertEquals(obj.radius, widget.attributes["radius"])

        assertEquals(1, widget.children.size)
    }
}
