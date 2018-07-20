package ringui.alert

import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.RState

enum class AlertType(val value: String) { ERROR("error"), MESSAGE("message"), SUCCESS("success"), WARNING("warning"), LOADING("loading") }

interface AlertProps : RProps {
    var closeable: Boolean
    var showWithAnimation: Boolean
    var type: String
    var `inline`: Boolean
    var isClosing: Boolean
    var timeout: Int
    var onClose: () -> Unit
    var onCloseRequest: () -> Unit
}

interface AlertState : RState {
    var height: Int
}

fun RBuilder.alert(type: AlertType = AlertType.MESSAGE, message: String? = null, block: RElementBuilder<AlertProps>.() -> Unit = {}) = child(Alert::class) {
    attrs.type = type.value
    if (message != null) {
        +message
    }
    this.block()
}
