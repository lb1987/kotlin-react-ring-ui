@file:JsModule("@jetbrains/ring-ui/components/tooltip/tooltip")

package ringui.tooltip

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Tooltip : Component<TooltipProps, RState> {
    override fun render(): ReactElement?
}
