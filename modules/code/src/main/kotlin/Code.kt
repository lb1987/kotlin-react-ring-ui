@file:JsModule("@jetbrains/ring-ui/components/code/code")

package ringui.code

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Code : Component<CodeProps, RState> {
    override fun render(): ReactElement?
}
