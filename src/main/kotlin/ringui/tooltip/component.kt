package ringui.tooltip

import kotlinext.js.JsObject
import react.RBuilder
import react.RHandler
import ringui.RClassnameProps

interface TooltipProps : RClassnameProps {
    var delay: Number
    var popupProps: JsObject?
    var title: String
}

fun RBuilder.tooltip(title: String, block: RHandler<TooltipProps> = {}) = child(Tooltip::class) {
    attrs.title = title

    block()
}

