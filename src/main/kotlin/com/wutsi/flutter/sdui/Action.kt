package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.ActionType

class Action(
    val id: String? = null,
    val type: ActionType? = null,
    val url: String = "",
    val prompt: Dialog? = null,
    val replacement: Boolean? = null,
    val parameters: Map<String, String>? = null
)
