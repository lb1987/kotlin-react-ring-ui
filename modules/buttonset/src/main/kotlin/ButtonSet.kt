@file:JsModule("@jetbrains/ring-ui/components/button-set/button-set")

package ringui.buttonset

import react.Component
import react.RState
import react.ReactElement
import ringui.RClassnameProps

@JsName("default")
external class ButtonSet : Component<RClassnameProps, RState> {
    override fun render(): ReactElement?
}
