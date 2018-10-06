package ringui.radio

import react.RBuilder
import react.RHandler
import react.RProps
import ringui.RDynamicProps

interface RadioItemProps : RDynamicProps {
    override var value: String
}

fun RBuilder.radioItem(value: String? = null, block: RHandler<RadioItemProps> = {}) = child(RadioItem::class) {
    value?.let { attrs.value = value }

    block()
}

interface RadioProps : RProps {
    var name: String
    var value: dynamic /* String | Int | Boolean */
    var onChange: (newValue: dynamic) -> Unit
}

fun RBuilder.radio(name: String? = null, block: RHandler<RadioProps> = {}) = child(Radio::class) {
    name?.let { attrs.name = name }

    block()
}

