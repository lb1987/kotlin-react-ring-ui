@file:JsModule("@jetbrains/ring-ui/components/button-group/button-group")

package ringui.buttongroup

import react.Component
import react.RState
import react.ReactElement
import ringui.RClassnameProps

@JsName("default")
external class ButtonGroup : Component<RClassnameProps, RState> {
    override fun render(): ReactElement?
}
