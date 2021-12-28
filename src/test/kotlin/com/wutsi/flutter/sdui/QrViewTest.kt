package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.ActionType
import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class QrViewTest {
    @Test
    fun toWidget() {
        val obj = QrView(
            action = Action(
                type = ActionType.Prompt
            ),
        )

        val widget = obj.toWidget()

        Assertions.assertEquals(WidgetType.QrView, widget.type)
        Assertions.assertEquals(obj.action, widget.action)

        Assertions.assertEquals(0, widget.attributes.size)

        Assertions.assertEquals(0, widget.children.size)
    }
}
