package ringui.badge

import react.RBuilder
import react.RHandler
import react.RProps

interface BadgeProps : RProps {
    var gray: Boolean
    var valid: Boolean
    var invalid: Boolean
    var disabled: Boolean
}

fun RBuilder.badge(label: String? = null, block: RHandler<BadgeProps> = {}) = child(Badge::class) {
    label?.let { +label }
    block()
}
