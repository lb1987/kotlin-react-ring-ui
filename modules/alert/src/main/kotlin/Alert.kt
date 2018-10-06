@file:JsModule("@jetbrains/ring-ui/components/alert/alert")

package ringui.alert

import react.Component
import react.ReactElement

@JsName("default")
external class Alert : Component<AlertProps, AlertState> {
    override fun render(): ReactElement?
}
