@file:JsModule("@jetbrains/ring-ui/components/loader-inline/loader-inline")

package ringui.loaderinline

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class LoaderInline : Component<LoaderInlineProps, RState> {
    override fun render(): ReactElement?
}
