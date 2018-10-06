package ringui.grid

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps

typealias RowModifierType = String

object RowModifierTypes {
    val XS = "xs"
    val SM = "sm"
    val MD = "md"
    val LG = "lg"
}

interface RowProps : RClassnameProps {
    var reverse: Boolean
    var start: RowModifierType
    var center: RowModifierType
    var end: RowModifierType
    var top: RowModifierType
    var middle: RowModifierType
    var baseline: RowModifierType
    var bottom: RowModifierType
    var around: RowModifierType
    var between: RowModifierType
    var first: RowModifierType
    var last: RowModifierType
}

interface ColProps : RClassnameProps {
    var xs: dynamic /* Int | Boolean */
    var sm: dynamic /* Int | Boolean */
    var md: dynamic /* Int | Boolean */
    var lg: dynamic /* Int | Boolean */
    var xsOffset: Int
    var smOffset: Int
    var mdOffset: Int
    var lgOffset: Int
    var reverse: Boolean
}

fun RBuilder.grid(block: RHandler<RClassnameProps> = {}) = child(Grid::class) {
    block()
}

fun RBuilder.row(start: RowModifierType? = null, center: RowModifierType? = null, end: RowModifierType? = null, block: RHandler<RowProps> = {}) = child(Row::class) {
    start?.let { attrs.start = start }
    center?.let { attrs.center = center }
    end?.let { attrs.end = end }

    block()
}

fun RBuilder.col(xs: Int? = null, xsOffset: Int? = null, sm: Int? = null, smOffset: Int? = null, md: Int? = null, mdOffset: Int? = null, lg: Int? = null, lgOffset: Int? = null, block: RHandler<ColProps> = {}) = child(Col::class) {
    xs?.let { attrs.xs = xs }
    sm?.let { attrs.sm = sm }
    md?.let { attrs.md = md }
    lg?.let { attrs.lg = lg }

    xsOffset?.let { attrs.xsOffset = xsOffset }
    smOffset?.let { attrs.smOffset = smOffset }
    mdOffset?.let { attrs.mdOffset = mdOffset }
    lgOffset?.let { attrs.lgOffset = lgOffset }

    block()
}

