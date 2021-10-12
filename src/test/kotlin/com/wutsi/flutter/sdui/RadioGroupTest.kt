package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class RadioGroupTest {
    @Test
    fun toWidget() {
        val group = RadioGroup(
            name = "foo",
            value = "1",
            children = listOf(Radio("1"), Radio("2"))
        )

        val widget = group.toWidget()

        assertEquals(WidgetType.RadioGroup, widget.type)
        assertNull(widget.action)

        assertEquals(2, widget.attributes.size)
        assertEquals(group.name, widget.attributes["name"])
        assertEquals(group.value, widget.attributes["value"])

        assertEquals(2, widget.children.size)
    }
}
