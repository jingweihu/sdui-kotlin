package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.DialogType
import com.wutsi.flutter.sdui.enums.WidgetType.Dialog

class Dialog(
    val type: DialogType = DialogType.Alert,
    val title: String = "",
    val message: String = "",
    val actions: List<Button>? = null,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Dialog,
        attributes = mapOf(
            "type" to type,
            "title" to title,
            "message" to message,
            "actions" to actions?.map { it.toWidget() }
        )
    )
}
