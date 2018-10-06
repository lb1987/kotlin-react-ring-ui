package ringui.authdialog

import react.RBuilder
import react.RElementBuilder
import react.RProps

interface AuthDialogProps : RProps {
    var className: String
    var title: String
    var errorMessage: String
    var serviceImage: String
    var serviceName: String
    var loginCaption: String
    var loginToCaption: String

    var show: Boolean
    var cancelOnEsc: Boolean
    var confirmLabel: String
    var cancelLabel: String

    var onConfirm: () -> Unit
    var onCancel: () -> Unit
}

fun RBuilder.authDialog(serviceName: String, title: String? = null, className: String? = null, show: Boolean? = null, block: RElementBuilder<AuthDialogProps>.() -> Unit = {}) = child(AuthDialog::class) {
    attrs.serviceName = serviceName
    title?.let { attrs.title = title }
    show?.let { attrs.show = show }
    className?.let { attrs.className = className }

    this.block()
}
