@file:JsModule("@jetbrains/ring-ui/components/confirm/confirm")

package ringui.confirm

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Confirm : Component<ConfirmProps, RState> {
    override fun render(): ReactElement?
}
