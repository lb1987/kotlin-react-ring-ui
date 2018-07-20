package ringui.errorBubble

import react.RBuilder
import react.RHandler
import react.RProps

interface ErrorBubbleProps : RProps {
    var error: String
    var className: String
}

fun RBuilder.errorBubble(error: String, className: String? = null, block: RHandler<ErrorBubbleProps>) = child(ErrorBubble::class) {
    attrs.error = error
    className?.let { attrs.className = className }

    block()
}

