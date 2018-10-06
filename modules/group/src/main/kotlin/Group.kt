@file:JsModule("@jetbrains/ring-ui/components/group/group")

package ringui.group

import react.Component
import react.RState
import react.ReactElement
import ringui.RDynamicProps

@JsName("default")
external class Group : Component<RDynamicProps, RState> {
    override fun render(): ReactElement?
}
