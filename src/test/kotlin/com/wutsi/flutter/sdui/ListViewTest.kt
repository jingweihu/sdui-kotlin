package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.Axis
import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Test

internal class ListViewTest {

    @Test
    fun toWidget() {
        val group = ListView(
            direction = Axis.Horizontal,
            separator = true,
            children = listOf(Radio("1"), Radio("2")),
            separatorColor = "xxx"
        )

        val widget = group.toWidget()

        kotlin.test.assertEquals(WidgetType.ListView, widget.type)
        kotlin.test.assertNull(widget.action)

        kotlin.test.assertEquals(3, widget.attributes.size)
        kotlin.test.assertEquals(group.direction, widget.attributes["direction"])
        kotlin.test.assertEquals(group.separator, widget.attributes["separator"])
        kotlin.test.assertEquals(group.separatorColor, widget.attributes["separatorColor"])

        kotlin.test.assertEquals(2, widget.children.size)
    }
}
