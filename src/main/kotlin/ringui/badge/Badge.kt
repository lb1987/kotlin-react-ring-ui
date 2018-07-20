@file:JsModule("@jetbrains/ring-ui/components/group/group")

package ringui.badge

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Badge : Component<BadgeProps, RState> {
    override fun render(): ReactElement?
}
