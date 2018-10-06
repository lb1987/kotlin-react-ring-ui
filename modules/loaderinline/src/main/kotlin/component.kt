package ringui.loaderinline

import react.RBuilder
import react.RProps

interface LoaderInlineProps : RProps {
    var className: String
}

fun RBuilder.loaderInline() = child(LoaderInline::class) {}
