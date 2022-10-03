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
            roomId = "man",
            sendMessageUrl = "https://www.google.ca/send",
            fetchMessageUrl = "https://www.google.ca/fetch",
            userFirstName = "Ray",
            userLastName = "Sponsible",
            userPictureUrl = "https://pic.com/1.png",
            id = "111",
            fontSize = 12.0,
            language = "fr",
            receivedMessageBackground = "xx",
            receivedMessageTextColor = "yy",
            sentMessageBackground = "aa",
            sentMessageTextColor = "bb",
            showUserAvatars = true,
            showUserNames = false
        )

        val widget = obj.toWidget()

        assertNull(widget.action)

        assertEquals(WidgetType.Chat, widget.type)

        assertEquals(16, widget.attributes.size)
        assertEquals(obj.id, widget.attributes["id"])
        assertEquals(obj.sendMessageUrl, widget.attributes["sendMessageUrl"])
        assertEquals(obj.fetchMessageUrl, widget.attributes["fetchMessageUrl"])
        assertEquals(obj.userId, widget.attributes["userId"])
        assertEquals(obj.roomId, widget.attributes["roomId"])
        assertEquals(obj.userFirstName, widget.attributes["userFirstName"])
        assertEquals(obj.userLastName, widget.attributes["userLastName"])
        assertEquals(obj.userPictureUrl, widget.attributes["userPictureUrl"])
        assertEquals(obj.language, widget.attributes["language"])
        assertEquals(obj.receivedMessageBackground, widget.attributes["receivedMessageBackground"])
        assertEquals(obj.receivedMessageTextColor, widget.attributes["receivedMessageTextColor"])
        assertEquals(obj.sentMessageBackground, widget.attributes["sentMessageBackground"])
        assertEquals(obj.sentMessageTextColor, widget.attributes["sentMessageTextColor"])
        assertEquals(obj.showUserAvatars, widget.attributes["showUserAvatars"])
        assertEquals(obj.showUserNames, widget.attributes["showUserNames"])

        assertEquals(0, widget.children.size)
    }
}
