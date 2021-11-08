package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType.Screen

class Screen(
    val appBar: AppBar? = null,
    val safe: Boolean = false,
    val child: WidgetAware? = null,
    val elevation: Int? = null,
    val backgroundColor: String? = null,
    val foregroundColor: String? = null,
    val actions: List<WidgetAware>? = null,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Screen,
        children = child?.let { listOf(it.toWidget()) } ?: emptyList(),
        attributes = mapOf(
            "safe" to safe,
            "elevation" to elevation,
            "backgroundColor" to backgroundColor,
            "foregroundColor" to foregroundColor,
            "actions" to actions?.map { it.toWidget() }
        ),
        appBar = appBar?.toWidget(),
    )
}
