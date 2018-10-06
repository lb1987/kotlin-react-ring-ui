package ringui.buttonset

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps

fun RBuilder.buttonSet(block: RHandler<RClassnameProps> = {}) = child(ButtonSet::class, block)

