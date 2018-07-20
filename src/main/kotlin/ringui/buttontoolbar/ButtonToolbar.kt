@file:JsModule("@jetbrains/ring-ui/components/button-toolbar/button-toolbar")

package ringui.buttontoolbar

import react.Component
import react.RState
import react.ReactElement
import ringui.RClassnameProps

@JsName("default")
external class ButtonToolbar : Component<RClassnameProps, RState> {
    override fun render(): ReactElement?
}
