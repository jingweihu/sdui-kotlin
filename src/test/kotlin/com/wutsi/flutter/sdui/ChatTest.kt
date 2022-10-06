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
            roomId = "101,111",
            recipientUserId = "101",
            fetchMessageUrl = "https://www.google.ca/fetch",
            rtmUrl = "wss://www.google.ca/rtm",
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
            showUserNames = false,
            deviceId = "xlkfelkfldk"
        )

        val widget = obj.toWidget()

        assertNull(widget.action)

        assertEquals(WidgetType.Chat, widget.type)

        assertEquals(19, widget.attributes.size)
        assertEquals(obj.id, widget.attributes["id"])
        assertEquals(obj.recipientUserId, widget.attributes["recipientUserId"])
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
        assertEquals(obj.rtmUrl, widget.attributes["rtmUrl"])
        assertEquals(obj.tenantId, widget.attributes["tenantId"])
        assertEquals(obj.deviceId, widget.attributes["deviceId"])

        assertEquals(0, widget.children.size)
    }
}
