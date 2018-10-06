package ringui.code

import react.RBuilder
import react.RProps

interface CodeProps : RProps {
    var className: String
    var code: String
    var inline: Boolean
    var language: String
    var replacer: (String) -> String
}

fun RBuilder.code(language: String, className: String? = null, inline: Boolean? = null, replacer: ((String) -> String)? = null, code: () -> String) = child(Code::class) {
    attrs.language = language
    className?.let { attrs.className = className }
    inline?.let { attrs.inline = inline }
    replacer?.let { attrs.replacer = replacer }

    attrs.code = code()
}

