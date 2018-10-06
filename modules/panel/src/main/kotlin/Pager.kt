@file:JsModule("@jetbrains/ring-ui/components/panel/panel")

package ringui.panel

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Panel : Component<PanelProps, RState> {
    override fun render(): ReactElement?
}
