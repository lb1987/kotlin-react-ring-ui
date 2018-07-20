@file:JsModule("@jetbrains/ring-ui/components/heading/heading")

package ringui.heading

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Heading : Component<HeadingProps, RState> {
    override fun render(): ReactElement?
}