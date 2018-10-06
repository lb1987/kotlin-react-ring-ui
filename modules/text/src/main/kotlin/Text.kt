@file:JsModule("@jetbrains/ring-ui/components/text/text")

package ringui.text

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Text : Component<TextProps, RState> {
    override fun render(): ReactElement?
}
