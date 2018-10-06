package ringui.dropdown

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps
import ringui.REventFunc

// Dropdown
interface DropdownProps : RDynamicProps {
    var anchor: String //fixme could be a function
    var initShown: Boolean
    var activeClassName: String
    var clickMode: Boolean
    var hoverMode: Boolean
    var hoverShowTimeOut: Int
    var hoverHideTimeOut: Int
    var onShow: REventFunc
    var onHide: REventFunc
//    var onMouseEnter: REventFunc
//    var onMouseLeave: REventFunc
}

fun RBuilder.dropdown(block: RHandler<DropdownProps> = {}) = child(Dropdown::class, block)
