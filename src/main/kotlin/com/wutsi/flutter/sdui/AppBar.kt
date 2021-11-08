package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.AppBar

class AppBar(
    val title: String? = null,
    val elevation: Int? = null,
    val backgroundColor: String? = null,
    val foregroundColor: String? = null,
    val leading: WidgetAware? = null,
    val actions: List<WidgetAware>? = null,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = AppBar,
        attributes = mapOf(
            "title" to title,
            "elevation" to elevation,
            "backgroundColor" to backgroundColor,
            "foregroundColor" to foregroundColor,
            "actions" to actions?.map { it.toWidget() },
            "leading" to leading?.toWidget()
        ),
    )
}
