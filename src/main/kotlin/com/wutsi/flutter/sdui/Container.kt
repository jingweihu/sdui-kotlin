package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.Alignment
import com.wutsi.flutter.sdui.enums.WidgetType.Container

class Container(
    val alignment: Alignment? = null,
    val padding: Double? = null,
    val margin: Double? = null,
    val background: String? = null,
    val border: Double? = null,
    val borderRadius: Double? = null,
    val borderColor: String? = null,
    val child: WidgetAware? = null
) : WidgetAware {
    override fun toWidget() = Widget(
        type = Container,
        attributes = mapOf(
            "alignment" to alignment,
            "padding" to padding,
            "margin" to margin,
            "background" to background,
            "border" to border,
            "borderRadius" to borderRadius,
            "borderColor" to borderColor
        ),
        children = child?.let { listOf(it.toWidget()) } ?: emptyList()
    )
}
