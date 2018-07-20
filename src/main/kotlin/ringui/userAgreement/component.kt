package ringui.userAgreement

import react.RBuilder
import react.RHandler
import react.RState
import ringui.RClassnameProps

data class UserAgreementTranslations(val accept: String,
                                     var decline: String,
                                     var close: String,
                                     var scrollToAccept: String,
                                     var remindLater: String)

interface UserAgreementProps : RClassnameProps {
    var show: Boolean
    var preview: Boolean
    var text: String
    var onAccept: () -> Unit
    var onDecline: () -> Unit
    var onClose: () -> Unit
    var onRemindLater: () -> Unit
    var translations: UserAgreementTranslations
}

interface UserAgreementState : RState {
    var scrollDown: Boolean
}

fun RBuilder.userAgreement(text: String, onAccept: () -> Unit, onDecline: () -> Unit, onClose: () -> Unit, show: Boolean? = null, preview: Boolean? = null, block: RHandler<UserAgreementProps> = {}) = child(UserAgreement::class) {
    attrs.text = text
    attrs.onAccept = onAccept
    attrs.onDecline = onDecline
    attrs.onClose = onClose

    show?.let { attrs.show = show }
    preview?.let { attrs.preview = preview }

    block()
}

