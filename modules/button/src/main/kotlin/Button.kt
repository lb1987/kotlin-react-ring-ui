@file:JsModule("@jetbrains/ring-ui/components/button/button")

package ringui.button

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Button : Component<ButtonProps, RState> {
    override fun render(): ReactElement?
}
