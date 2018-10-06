package ringui.avatar

import kotlinext.js.JsObject
import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.RState

typealias AvatarSize = Short

object AvatarSizes {
    var Size18: AvatarSize = 18
    var Size20: AvatarSize = 20
    var Size24: AvatarSize = 24
    var Size32: AvatarSize = 32
    var Size40: AvatarSize = 40
    var Size48: AvatarSize = 48
    var Size56: AvatarSize = 56
}

interface AvatarProps : RProps {
    var dpr: Int
    var className: String
    var size: AvatarSize
    var style: JsObject
    var url: String
}

interface AvatarState : RState {
    var errorUrl: String
}

fun RBuilder.avatar(url: String? = null, className: String? = null, size: AvatarSize? = null, block: RElementBuilder<AvatarProps>.() -> Unit = {}) = child(Avatar::class) {
    url?.let { attrs.url = url }
    className?.let { attrs.className = className }
    size?.let { attrs.size = size }

    block()
}
