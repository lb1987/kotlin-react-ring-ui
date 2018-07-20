package ringui.contenteditable

import react.RBuilder
import react.RProps
import ringui.REventFunc

interface ContentEditableProps : RProps {
    var disabled: Boolean
    var componentDidUpdate: REventFunc
    var onComponentUpdate: REventFunc
    var className: String
}

/**
 * Only allows regular DOM elements as children.
 */
fun RBuilder.contentEditable(className: String? = null, disabled: Boolean? = null, block: RBuilder.() -> Unit = {}) = child(ContentEditable::class) {
    className?.let { attrs.className = className }
    disabled?.let { attrs.disabled = disabled }

    block()
}

