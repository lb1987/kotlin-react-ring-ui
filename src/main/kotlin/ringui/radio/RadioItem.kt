@file:JsModule("@jetbrains/ring-ui/components/radio/radio__item")

package ringui.radio

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class RadioItem : Component<RadioItemProps, RState> {
    override fun render(): ReactElement?
}
