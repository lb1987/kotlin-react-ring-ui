@file:JsModule("@jetbrains/ring-ui/components/footer/footer")

package ringui.footer

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Footer : Component<FooterProps, RState> {
    override fun render(): ReactElement?
}

external fun copyright(year: Int): String