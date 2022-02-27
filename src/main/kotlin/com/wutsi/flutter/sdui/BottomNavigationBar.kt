package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.WidgetType

class BottomNavigationBar(
    val currentIndex: Int? = null,
    val background: String? = null,
    val selectedItemColor: String? = null,
    val unselectedItemColor: String? = null,
    val iconSize: Double? = null,
    val elevation: Double? = null,
    val items: List<BottomNavigationBarItem>,
) : WidgetAware {
    override fun toWidget() = Widget(
        type = WidgetType.BottomNavigationBar,
        attributes = mapOf(
            "background" to background,
            "selectedItemColor" to selectedItemColor,
            "unselectedItemColor" to unselectedItemColor,
            "iconSize" to iconSize,
            "elevation" to elevation,
            "currentIndex" to currentIndex
        ),
        children = items.map { it.toWidget() }
    )
}
