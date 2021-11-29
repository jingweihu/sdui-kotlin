package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class DefaultTabControllerTest {
    @Test
    fun toWidget() {
        val container = DefaultTabController(
            length = 3,
            child = Page(url = "xxx"),
        )

        val widget = container.toWidget()

        assertEquals(WidgetType.DefaultTabController, widget.type)
        assertNull(widget.action)

        assertEquals(1, widget.attributes.size)
        assertEquals(container.length, widget.attributes["length"])

        assertEquals(1, widget.children.size)
    }
}
