package ringui.footer

import react.RBuilder
import react.RHandler
import react.RProps

data class FooterLineData(val label: String, val url: String? = null, val title: String? = null, val target: String? = null)

interface FooterProps : RProps {
    var className: String
    var floating: Boolean
    var left: Array<dynamic /* FooterLineData | String */>
    var center: Array<dynamic /* FooterLineData | String */>
    var right: Array<dynamic /* FooterLineData | String */>
}

fun RBuilder.footer(className: String? = null, block: RHandler<FooterProps> = {}) = child(Footer::class) {
    className?.let { attrs.className = className }
    block()
}
