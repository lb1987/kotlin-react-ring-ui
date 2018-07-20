package ringui.panel

import kotlinext.js.JsObject
import react.RBuilder
import react.RHandler
import ringui.RClassnameProps
import ringui.pager.Pager

interface PanelProps : RClassnameProps {
}

fun RBuilder.panel(block: RHandler<PanelProps> = {}) = child(Panel::class) {
    block()
}
