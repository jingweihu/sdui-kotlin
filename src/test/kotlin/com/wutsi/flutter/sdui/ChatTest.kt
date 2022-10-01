package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class ChatTest {
    @Test
    fun toWidget() {
        val obj = Chat(
            userId = "yo",
            sendMessageUrl = "https://www.google.ca/send",
            userFirstName = "Ray",
            userLastName = "Sponsible",
            userPictureUrl = "https://pic.com/1.png",
            id = "111"
        )

        val widget = obj.toWidget()

        assertNull(widget.action)

        assertEquals(WidgetType.Chat, widget.type)

        assertEquals(6, widget.attributes.size)
        assertEquals(obj.id, widget.attributes["id"])
        assertEquals(obj.sendMessageUrl, widget.attributes["sendMessageUrl"])
        assertEquals(obj.userId, widget.attributes["userId"])
        assertEquals(obj.userFirstName, widget.attributes["userFirstName"])
        assertEquals(obj.userLastName, widget.attributes["userLastName"])
        assertEquals(obj.userPictureUrl, widget.attributes["userPictureUrl"])

        assertEquals(0, widget.children.size)
    }
}
