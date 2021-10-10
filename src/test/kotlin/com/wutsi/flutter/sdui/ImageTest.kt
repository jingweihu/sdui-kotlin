package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class ImageTest {
    @Test
    fun toWidget() {
        val image = Image(
            url = "http://img.com/1.png",
            width = 100.0,
            height = 200.0
        )

        val widget = image.toWidget()

        assertEquals(WidgetType.Image, widget.type)
        assertNull(widget.action)

        assertEquals(3, widget.attributes.size)
        assertEquals(image.url, widget.attributes["url"])
        assertEquals(image.width, widget.attributes["width"])
        assertEquals(image.height, widget.attributes["height"])

        assertEquals(0, widget.children.size)
    }
}
