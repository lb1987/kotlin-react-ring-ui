@file:JsModule("@jetbrains/ring-ui/components/checkbox/checkbox")

package ringui.checkbox

import react.Component
import react.ReactElement

@JsName("default")
external class Checkbox : Component<CheckboxProps, CheckboxState> {
    override fun render(): ReactElement?
}
