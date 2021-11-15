package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.Axis
import com.wutsi.flutter.sdui.enums.Axis.Vertical
import com.wutsi.flutter.sdui.enums.WidgetType.PageView
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class PageViewTest {

    @Test
    fun toWidget() {
        val view = PageView(
            id = "xxx",
            direction = Vertical,
            children = listOf(
                Page(url = "https://www.google.ca/1"),
                Page(url = "https://www.google.ca/2")
            )
        )

        val widget = view.toWidget()
        assertEquals(PageView, widget.type)
        assertNull(widget.action)

        assertEquals(2, widget.attributes.size)
        assertEquals(view.id, widget.attributes["id"])
        assertEquals(Axis.Vertical, widget.attributes["direction"])

        assertEquals(2, widget.children.size)
    }
}
