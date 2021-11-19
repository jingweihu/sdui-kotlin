package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class CircleAvatarTest {

    @Test
    fun toWidget() {
        val obj = CircleAvatar(
            radius = 30.0,
            child = Container()
        )

        val widget = obj.toWidget()

        assertEquals(WidgetType.CircleAvatar, widget.type)
        assertNull(widget.action)

        assertEquals(1, widget.attributes.size)
        assertEquals(obj.radius, widget.attributes["radius"])

        assertEquals(1, widget.children.size)
    }
}
