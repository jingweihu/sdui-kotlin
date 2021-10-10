package com.wutsi.flutter.sdui

import com.wutsi.flutter.sdui.enums.ActionType

class Action(
    val type: ActionType? = null,
    val url: String = "",
    val prompt: Dialog? = null
)
