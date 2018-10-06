@file:JsModule("@jetbrains/ring-ui/components/input/input")

package ringui.input

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Input : Component<InputProps, RState> {
    override fun render(): ReactElement?
}
