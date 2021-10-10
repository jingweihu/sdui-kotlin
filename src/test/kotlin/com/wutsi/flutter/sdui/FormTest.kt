package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class FormTest {
    @Test
    fun toWidget() {
        val form = Form(
            padding = 1.0,
            children = listOf(Page(url = "xxx"), Container()),
        )

        val widget = form.toWidget()

        assertEquals(WidgetType.Form, widget.type)
        assertNull(widget.action)

        assertEquals(1, widget.attributes.size)
        assertEquals(form.padding, widget.attributes["padding"])

        assertEquals(2, widget.children.size)
    }
}
