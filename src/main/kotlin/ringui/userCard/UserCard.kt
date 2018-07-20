@file:JsModule("@jetbrains/ring-ui/components/user-card/user-card")

package ringui.userCard

import react.Component
import react.RState
import react.ReactElement

@JsName("UserCard")
external class UserCard : Component<UserCardProps, RState> {
    override fun render(): ReactElement?
}

@JsName("UserCardTooltip")
external class UserCardTooltip : Component<UserCardTooltipProps, RState> {
    override fun render(): ReactElement?
}
