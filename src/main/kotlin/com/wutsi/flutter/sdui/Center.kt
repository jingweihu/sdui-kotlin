package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

class Center : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.Center,
    )
}
