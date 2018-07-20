package ringui.link

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps

interface LinkProps : RDynamicProps {
    var active: Boolean
    var inherit: Boolean
    var pseudo: Boolean
    var hover: Boolean
}

fun RBuilder.link(title: String? = null, href: String? = null, active: Boolean? = null, inherit: Boolean? = null, pseudo: Boolean? = null, hover: Boolean? = null, block: RHandler<LinkProps> = {}) = child(Link::class) {
    href?.let { attrs.href = href }
    title?.let { +title }
    active?.let { attrs.active = active }
    inherit?.let { attrs.inherit = inherit }
    pseudo?.let { attrs.pseudo = pseudo }
    hover?.let { attrs.hover = hover }

    block()
}

