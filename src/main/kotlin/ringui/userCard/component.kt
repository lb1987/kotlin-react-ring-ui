package ringui.userCard

import kotlinext.js.JsObject
import react.RBuilder
import react.RHandler
import ringui.RClassnameProps

data class UserCardUser(
        var name: String,
        var login: String,
        var avatarUrl: String,
        var email: String? = null,
        var href: String? = null)

data class UserCardWording(
        var banned: String,
        var online: String,
        var offline: String)

interface UserCardProps : RClassnameProps {
    var user: UserCardUser
    var wording: UserCardWording?
}

fun RBuilder.userCard(user: UserCardUser, wording: UserCardWording? = null, block: RHandler<UserCardProps> = {}) = child(UserCard::class) {
    attrs.user = user
    wording?.let { attrs.wording = wording }

    block()
}

interface UserCardTooltipProps : RClassnameProps {
    var dropdownProps: JsObject
    var user: UserCardUser
//    var renderUserCard: PropTypes.func, //fixme
//    var renderNoUser: PropTypes.func //fixme
}

fun RBuilder.userCardTooltip(user: UserCardUser, block: RHandler<UserCardTooltipProps> = {}) = child(UserCardTooltip::class) {
    attrs.user = user

    block()
}

