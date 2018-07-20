@file:JsModule("@jetbrains/ring-ui/components/progress-bar/progress-bar")

package ringui.progress

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class ProgressBar : Component<ProgressbarProps, RState> {
    override fun render(): ReactElement?
}
