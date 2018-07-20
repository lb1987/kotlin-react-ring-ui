@file:JsModule("@jetbrains/ring-ui/components/contenteditable/contenteditable")

package ringui.contenteditable

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class ContentEditable : Component<ContentEditableProps, RState> {
    override fun render(): ReactElement?
}
