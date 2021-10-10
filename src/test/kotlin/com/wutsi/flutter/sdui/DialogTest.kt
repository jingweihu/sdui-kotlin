package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.DialogType.Information
import com.wutsi.flutter.sdui.enums.WidgetType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class DialogTest {
    @Test
    fun toWidget() {
        val dialog = Dialog(
            type = Information,
            title = "information",
            message = "Yo man"
        )

        val widget = dialog.toWidget()

        assertEquals(WidgetType.Dialog, widget.type)

        assertEquals(3, widget.attributes.size)
        assertEquals(dialog.title, widget.attributes["title"])
        assertEquals(dialog.message, widget.attributes["message"])
        assertEquals(dialog.type, widget.attributes["type"])

        assertNull(widget.action)

        assertEquals(0, widget.children.size)
    }
}
