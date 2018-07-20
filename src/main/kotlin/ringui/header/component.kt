package ringui.header

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps

interface HeaderProps : RDynamicProps {
}

fun RBuilder.header(block: RHandler<HeaderProps>) = child(Header::class, block)
fun RBuilder.tray(block: RHandler<RDynamicProps>) = child(Tray::class, block)

