package ringui.tag

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps
import ringui.REventFunc
import ringui.icon.Icon

interface TagProps : RClassnameProps {
    var onRemove: () -> Unit
    var onClick: REventFunc
    var rgTagIcon: Icon
    var icon: String
    var avatar: String
    var rgTagTitle: String
    var readOnly: Boolean
    var disabled: Boolean
    var focused: Boolean
}

fun RBuilder.tag(label: String? = null, readOnly: Boolean? = null, focused: Boolean? = null, block: RHandler<TagProps> = {}) = child(Tag::class) {
    label?.let { +label }
    readOnly?.let { attrs.readOnly = readOnly }
    focused?.let { attrs.focused = focused }

    block()
}

