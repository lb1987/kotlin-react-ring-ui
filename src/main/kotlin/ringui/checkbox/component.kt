package ringui.checkbox

import react.RBuilder
import react.RHandler
import react.RProps
import react.RState
import ringui.REventFunc

interface CheckboxProps : RProps {
    var name: String
    var label: String
    var className: String
    var checked: Boolean
    var disabled: Boolean
    var onChange: REventFunc
}

interface CheckboxState : RState {
    var checked: Boolean
    var disabled: Boolean
}

fun RBuilder.checkbox(label: String, checked: Boolean? = false, disabled: Boolean? = null, block: RHandler<CheckboxProps> = {}) = child(Checkbox::class) {
    attrs.label = label
    checked?.let { attrs.checked = checked }
    disabled?.let { attrs.disabled = disabled }

    block()
}

