package ringui.loader

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps

interface LoaderProps : RDynamicProps {
    //    var size: Int //already in dynamic props, unclear in js file
    var colors: Array<String> //fixme unclear
    var message: String
}

fun RBuilder.loader(message: String, block: RHandler<LoaderProps> = {}) = child(Loader::class) {
    attrs.message = message

    block()
}
