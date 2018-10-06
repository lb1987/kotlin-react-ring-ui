@file:JsModule("@jetbrains/ring-ui/components/error-message/error-message")

package ringui.errorMessage

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class ErrorMessage : Component<ErrorMessageProps, RState> {
    override fun render(): ReactElement?
}
