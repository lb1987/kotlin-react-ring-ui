@file:JsModule("@jetbrains/ring-ui/components/loader/loader")

package ringui.loader

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Loader : Component<LoaderProps, RState> {
    override fun render(): ReactElement?
}
