package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.DialogType
import com.wutsi.flutter.sdui.enums.WidgetType.Dialog

class Dialog(
    val type: DialogType = DialogType.Alert,
    val title: String = "",
    val message: String = ""
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Dialog,
        attributes = toMap()
    )

    fun toMap(): Map<String, Any> = mapOf(
        "type" to type,
        "title" to title,
        "message" to message
    )
}
