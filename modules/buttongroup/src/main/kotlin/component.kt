package ringui.buttongroup

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps

fun RBuilder.buttonGroup(block: RHandler<RClassnameProps> = {}) = child(ButtonGroup::class, block)

