package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

class Chat(
    val roomId: String,
    val userId: String,
    val fetchMessageUrl: String,
    val rtmUrl: String? = null,
    val userFirstName: String? = null,
    val userLastName: String? = null,
    val userPictureUrl: String? = null,
    val id: String? = null,
    val recipientUserId: String? = null,
    val language: String? = null,
    val fontSize: Double? = null,
    val receivedMessageBackground: String? = null,
    val receivedMessageTextColor: String? = null,
    val sentMessageBackground: String? = null,
    val sentMessageTextColor: String? = null,
    val showUserNames: Boolean? = null,
    val showUserAvatars: Boolean? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.Chat,
        attributes = mapOf(
            "id" to id,
            "userId" to userId,
            "roomId" to roomId,
            "recipientUserId" to recipientUserId,
            "fetchMessageUrl" to fetchMessageUrl,
            "rtmUrl" to rtmUrl,
            "userFirstName" to userFirstName,
            "userLastName" to userLastName,
            "userPictureUrl" to userPictureUrl,
            "language" to language,
            "fontSize" to fontSize,
            "receivedMessageBackground" to receivedMessageBackground,
            "receivedMessageTextColor" to receivedMessageTextColor,
            "sentMessageBackground" to sentMessageBackground,
            "sentMessageTextColor" to sentMessageTextColor,
            "showUserNames" to showUserNames,
            "showUserAvatars" to showUserAvatars
        )
    )
}
