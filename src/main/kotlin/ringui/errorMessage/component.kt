package ringui.errorMessage

import react.RBuilder
import react.RHandler
import react.RProps
import ringui.icon.Icon

interface ErrorMessageProps : RProps {
    var icon: dynamic /* String | ()->String */
    var code: String
    var message: String
    var description: String
    var className: String
}

fun RBuilder.errorMessage(icon: Icon, code: String, message: String, description: String? = null, className: String? = null, block: RHandler<ErrorMessageProps> = {}) = child(ErrorMessage::class) {
    attrs.icon = icon
    attrs.code = code
    attrs.message = message
    description?.let { attrs.description = description }
    className?.let { attrs.className = className }

    block()
}

