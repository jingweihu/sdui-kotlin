package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class ColumnTest {
    @Test
    fun toWidget() {
        val column = Column(
            children = listOf(Container(), Container())
        )

        val widget = column.toWidget()

        assertEquals(WidgetType.Column, widget.type)
        assertNull(widget.action)

        assertEquals(0, widget.attributes.size)

        assertEquals(2, widget.children.size)
    }
}
