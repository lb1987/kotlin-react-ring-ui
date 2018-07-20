@file:JsModule("@jetbrains/ring-ui/components/dialog/dialog")

package ringui.dialog

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Dialog : Component<DialogProps, RState> {
    override fun render(): ReactElement?
}
