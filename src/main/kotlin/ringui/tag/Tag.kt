@file:JsModule("@jetbrains/ring-ui/components/tag/tag")

package ringui.tag

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Tag : Component<TagProps, RState> {
    override fun render(): ReactElement?
}
