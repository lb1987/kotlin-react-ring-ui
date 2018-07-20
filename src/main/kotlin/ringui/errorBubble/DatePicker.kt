@file:JsModule("@jetbrains/ring-ui/components/error-bubble/error-bubble")

package ringui.errorBubble

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class ErrorBubble : Component<ErrorBubbleProps, RState> {
    override fun render(): ReactElement?
}
