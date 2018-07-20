package ringui.text

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps

interface TextProps : RClassnameProps {
    var comment: Boolean
    var info: Boolean
}

fun RBuilder.text(text: String, comment: Boolean? = null, info: Boolean? = null, block: RHandler<TextProps> = {}) = child(Text::class) {
    comment?.let { attrs.comment = comment }
    info?.let { attrs.info = info }

    +text

    block()
}

