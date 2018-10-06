@file:JsModule("@jetbrains/ring-ui/components/auth-dialog/auth-dialog")

package ringui.authdialog

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class AuthDialog : Component<AuthDialogProps, RState> {
    override fun render(): ReactElement?
}
