@file:JsModule("@jetbrains/ring-ui/components/loader-screen/loader-screen")

package ringui.loaderScreen

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class LoaderScreen : Component<LoaderScreenProps, RState> {
    override fun render(): ReactElement?
}
