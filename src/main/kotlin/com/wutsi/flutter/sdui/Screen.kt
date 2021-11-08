package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.Screen

class Screen(
    val appBar: AppBar? = null,
    val safe: Boolean = false,
    val child: WidgetAware? = null,
    val backgroundColor: String? = null,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Screen,
        children = child?.let { listOf(it.toWidget()) } ?: emptyList(),
        attributes = mapOf(
            "safe" to safe,
            "backgroundColor" to backgroundColor,
        ),
        appBar = appBar?.toWidget(),
    )
}
