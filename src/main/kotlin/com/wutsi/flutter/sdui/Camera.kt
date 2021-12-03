package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

class Camera(
    val name: String,
    val uploadUrl: String,
    val action: Action? = null,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.Camera,
        action = action,
        attributes = mapOf(
            "name" to name,
            "uploadUrl" to uploadUrl,
        )
    )
}
