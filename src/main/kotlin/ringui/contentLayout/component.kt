package ringui.contentLayout

import react.RBuilder
import react.RHandler
import react.RProps
import react.RState

interface ContentLayoutProps : RProps {
    var className: String
    var contentClassName: String
    var responsive: Boolean
}

fun RBuilder.contentLayout(className: String? = null, responsive: Boolean? = null, block: RHandler<ContentLayoutProps> = {}) = child(ContentLayout::class) {
    className?.let { attrs.className = className }
    responsive?.let { attrs.responsive = responsive }

    block()
}

interface SidebarProps : RProps {
    var right: Boolean
    var className: String
    var containerClassName: String
    var fixedClassName: String
//    var contentNode: PropTypes.object
}

interface SidebarState : RState {
    var topIsOutside: Boolean
    var bottomIsOutside: Boolean
}

fun RBuilder.sidebar(className: String? = null, containerClassName: String? = null, block: RHandler<SidebarProps> = {}) = child(Sidebar::class) {
    className?.let { attrs.className = className }
    containerClassName?.let { attrs.containerClassName = containerClassName }

    block()
}

