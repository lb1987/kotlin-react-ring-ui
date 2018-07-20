@file:JsModule("@jetbrains/ring-ui/components/dropdown/dropdown")

package ringui.dropdown

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Dropdown : Component<DropdownProps, RState> {
    override fun render(): ReactElement?
}
