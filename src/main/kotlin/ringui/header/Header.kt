@file:JsModule("@jetbrains/ring-ui/components/header/header")

package ringui.header

import react.Component
import react.RState
import react.ReactElement
import ringui.RDynamicProps

@JsName("default")
external class Header : Component<HeaderProps, RState> {
    override fun render(): ReactElement?
}

external class Tray : Component<RDynamicProps, RState> {
    override fun render(): ReactElement?
}
