@file:JsModule("@jetbrains/ring-ui/components/select/select")

package ringui.select

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Select : Component<SelectProps, RState> {
    override fun render(): ReactElement?
}
