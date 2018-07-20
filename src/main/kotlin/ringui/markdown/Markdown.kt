@file:JsModule("@jetbrains/ring-ui/components/markdown/markdown")

package ringui.markdown

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Markdown : Component<MarkdownProps, RState> {
    override fun render(): ReactElement?
}
