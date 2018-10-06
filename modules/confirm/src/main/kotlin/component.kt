package ringui.confirm

import react.RBuilder
import react.RHandler
import react.RProps
import ringui.REventFunc

interface ConfirmProps : RProps {
    var className: String
    var text: String
    var description: String

    var show: Boolean
    var rejectOnEsc: Boolean
    var inProgress: Boolean
    var cancelIsDefault: Boolean
    var confirmLabel: String
    var rejectLabel: String

    var onConfirm: REventFunc
    var onReject: REventFunc

}

fun RBuilder.confirm(text: String, description: String? = null, show: Boolean? = null, rejectOnEsc: Boolean? = null, inProgress: Boolean? = null, block: RHandler<ConfirmProps> = {}) = child(Confirm::class) {
    attrs.text = text
    description?.let { attrs.description = description }
    show?.let { attrs.show = show }
    rejectOnEsc?.let { attrs.rejectOnEsc = rejectOnEsc }
    inProgress?.let { attrs.inProgress = inProgress }

    block()
}

