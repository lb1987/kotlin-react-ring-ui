@file:JsModule("@jetbrains/ring-ui/components/popup/popup")

package ringui.popup

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Popup : Component<PopupProps, RState> {
    override fun render(): ReactElement?
}
