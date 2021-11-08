package com.wutsi.flutter.sdui

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class ScreenTest {
    lateinit var child1: WidgetAware
    lateinit var widget1: Widget

    @BeforeEach
    fun setUp() {
        widget1 = Widget(type = WidgetType.Container)
        child1 = mock()
        doReturn(widget1).whenever(child1).toWidget()
    }

    @Test
    fun toWidget() {
        val screen = Screen(
            child = child1,
            safe = true,
            appBar = AppBar(
                title = "Yo",
                children = listOf(IconButton("1"), IconButton("2"))
            ),
            elevation = 0,
            foregroundColor = "#ffffff",
            backgroundColor = "#ff0000",
            actions = listOf(
                IconButton(
                    icon = "a",
                ),
                IconButton(
                    icon = "b",
                )

            )
        )

        val widget = screen.toWidget()

        assertEquals(WidgetType.Screen, widget.type)
        assertNull(widget.action)

        assertEquals(5, widget.attributes.size)
        assertEquals(screen.safe, widget.attributes["safe"])
        assertEquals(screen.elevation, widget.attributes["elevation"])
        assertEquals(screen.foregroundColor, widget.attributes["foregroundColor"])
        assertEquals(screen.backgroundColor, widget.attributes["backgroundColor"])

        val actions = (widget.attributes["actions"]) as List<Widget>
        assertEquals(2, actions.size)
        assertEquals("a", actions[0].attributes["icon"])
        assertEquals(WidgetType.IconButton, actions[0].type)
        assertEquals("b", actions[1].attributes["icon"])
        assertEquals(WidgetType.IconButton, actions[1].type)

        assertEquals(screen.appBar?.title, widget.appBar?.attributes?.get("title"))
        assertEquals(screen.appBar?.children?.size, widget.appBar?.children?.size)

        assertEquals(1, widget.children.size)
        assertEquals(widget1, widget.children[0])
    }
}
