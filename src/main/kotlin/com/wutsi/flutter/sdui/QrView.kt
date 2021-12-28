package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

class QrView(
    val action: Action? = null,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.QrView,
        action = action,
    )
}
