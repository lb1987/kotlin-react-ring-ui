package ringui.markdown

import react.RBuilder
import ringui.RDynamicProps

interface MarkdownProps : RDynamicProps {
    var inline: Boolean
    var source: String
    //renderers: PropTypes.object
}

fun RBuilder.markdown(source: String? = null, inline: Boolean? = null, block: () -> String? = { source }) = child(Markdown::class) {
    inline?.let { attrs.inline = inline }

    val v = block()
    v?.let { attrs.source = v }
}
