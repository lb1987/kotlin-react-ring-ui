package ringui.heading

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps

interface HeadingProps : RDynamicProps {
    var level: Short
}

fun RBuilder.heading(level: Short, text: String? = null, block: RHandler<HeadingProps> = {}) = child(Heading::class) {
    attrs.level = level
    text?.let { +text }
    block()
}

fun RBuilder.heading1(text: String? = null, block: RHandler<HeadingProps> = {}) = heading(1, text, block)
fun RBuilder.heading2(text: String? = null, block: RHandler<HeadingProps> = {}) = heading(2, text, block)
fun RBuilder.heading3(text: String? = null, block: RHandler<HeadingProps> = {}) = heading(3, text, block)
fun RBuilder.heading4(text: String? = null, block: RHandler<HeadingProps> = {}) = heading(4, text, block)
fun RBuilder.heading5(text: String? = null, block: RHandler<HeadingProps> = {}) = heading(5, text, block)
fun RBuilder.heading6(text: String? = null, block: RHandler<HeadingProps> = {}) = heading(6, text, block)

