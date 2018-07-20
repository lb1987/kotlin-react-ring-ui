package ringui.input

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps

interface InputProps : RDynamicProps {
    val multiline: Boolean
    //val inputRef: ,
    val active: Boolean
    val error: Boolean //fixme
    val valid: Boolean
    val material: Boolean
    val shortcuts: Boolean
}

fun RBuilder.input(block: RHandler<InputProps> = {}) = child(Input::class, block)

