package ringui.group

import react.RBuilder
import react.RHandler
import react.RProps

fun RBuilder.group(block: RHandler<RProps> = {}) = child(Group::class, block)
