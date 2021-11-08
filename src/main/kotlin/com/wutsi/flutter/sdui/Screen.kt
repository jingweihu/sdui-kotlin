package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.Screen

class Screen(
    val appBar: AppBar? = null,
    val safe: Boolean = false,
    val child: WidgetAware? = null,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Screen,
        children = child?.let { listOf(it.toWidget()) } ?: emptyList(),
        attributes = mapOf(
            "safe" to safe,
        ),
        appBar = appBar?.toWidget(),
    )
}
