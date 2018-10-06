@file:JsModule("@jetbrains/ring-ui/components/avatar/avatar")

package ringui.avatar

import react.Component
import react.ReactElement

@JsName("default")
external class Avatar : Component<AvatarProps, AvatarState> {
    override fun render(): ReactElement?
}
