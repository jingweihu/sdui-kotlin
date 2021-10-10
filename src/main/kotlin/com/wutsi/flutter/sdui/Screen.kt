package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.Screen

class Screen(
    val title: String? = null,
    val showAppBar: Boolean = true,
    val safe: Boolean = false,
    val child: WidgetAware? = null,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Screen,
        children = child?.let { listOf(it.toWidget()) } ?: emptyList(),
        attributes = mapOf(
            "title" to title,
            "safe" to safe,
            "showAppBar" to showAppBar
        )
    )
}
