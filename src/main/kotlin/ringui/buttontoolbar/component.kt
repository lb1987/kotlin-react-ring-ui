package ringui.buttontoolbar

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps

fun RBuilder.buttonToolbar(block: RHandler<RClassnameProps> = {}) = child(ButtonToolbar::class, block)

