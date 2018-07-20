@file:JsModule("@jetbrains/ring-ui/components/user-agreement/user-agreement")

package ringui.userAgreement

import react.Component
import react.ReactElement

@JsName("default")
external class UserAgreement : Component<UserAgreementProps, UserAgreementState> {
    override fun render(): ReactElement?
}
