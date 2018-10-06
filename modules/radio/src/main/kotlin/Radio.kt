@file:JsModule("@jetbrains/ring-ui/components/radio/radio")

package ringui.radio

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Radio : Component<RadioProps, RState> {
    override fun render(): ReactElement?
}
