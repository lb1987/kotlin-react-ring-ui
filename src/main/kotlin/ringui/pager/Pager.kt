@file:JsModule("@jetbrains/ring-ui/components/pager/pager")

package ringui.pager

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Pager : Component<PagerProps, RState> {
    override fun render(): ReactElement?
}
