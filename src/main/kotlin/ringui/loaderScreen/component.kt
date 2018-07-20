package ringui.loaderScreen

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps

interface LoaderScreenProps : RDynamicProps {
    var containerClassName: String
    var message: String
}

fun RBuilder.loaderScreen(message: String? = null, containerClassName: String? = null, block: RHandler<LoaderScreenProps> = {}) = child(LoaderScreen::class) {
    message?.let { attrs.message = message }
    containerClassName?.let { attrs.containerClassName = containerClassName }

    block()
}
