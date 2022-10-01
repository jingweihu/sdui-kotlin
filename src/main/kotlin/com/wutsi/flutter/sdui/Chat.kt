package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

class Chat(
    val userId: String,
    val sendMessageUrl: String,
    val userFirstName: String? = null,
    val userLastName: String? = null,
    val userPictureUrl: String? = null,
    val id: String? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.Chat,
        attributes = mapOf(
            "id" to id,
            "userId" to userId,
            "sendMessageUrl" to sendMessageUrl,
            "userFirstName" to userFirstName,
            "userLastName" to userLastName,
            "userPictureUrl" to userPictureUrl
        )
    )
}
