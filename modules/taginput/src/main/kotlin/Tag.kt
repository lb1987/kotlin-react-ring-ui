@file:JsModule("@jetbrains/ring-ui/components/tag/tag")

package ringui.tagInput

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class TagsInput : Component<TagsInputProps, RState> {
    override fun render(): ReactElement?
}
