package ringui.popup

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps
import ringui.REventFunc

typealias Direction = String

object Directions {
    val BOTTOM_RIGHT: Direction = "BOTTOM_RIGHT"
    val BOTTOM_LEFT: Direction = "BOTTOM_LEFT"
    val BOTTOM_CENTER: Direction = "BOTTOM_CENTER"
    val TOP_LEFT: Direction = "TOP_LEFT"
    val TOP_RIGHT: Direction = "TOP_RIGHT"
    val TOP_CENTER: Direction = "TOP_CENTER"
    val RIGHT_TOP: Direction = "RIGHT_TOP"
    val RIGHT_BOTTOM: Direction = "RIGHT_BOTTOM"
    val RIGHT_CENTER: Direction = "RIGHT_CENTER"
    val LEFT_TOP: Direction = "LEFT_TOP"
    val LEFT_BOTTOM: Direction = "LEFT_BOTTOM"
    val LEFT_CENTER: Direction = "LEFT_CENTER"
}

/**
 * @author jansorg
 */
// PopupMenu
interface PopupProps : RDynamicProps {
    //anchorElement: PropTypes.instanceOf(Node),
//    var target: String
//    var className: String
//    var hidden: Boolean
    var onOutsideClick: REventFunc
    var onEscPress: REventFunc
    // onCloseAttempt is a common callback for ESC pressing and outside clicking.
    // Use it if you don't need different behaviors for this cases.
    var onCloseAttempt: REventFunc
    var dontCloseOnAnchorClick: Boolean
    var shortcuts: Boolean
    var keepMounted: Boolean // pass this prop to preserve the popup's DOM state while hidden
    //var `data-test`: String

    var directions: Array<Direction>
    var autoPositioning: Boolean
    var left: Number
    var top: Number
    //    var maxHeight: deprecateString('screen', 'MaxHeight.SCREEN'),
//    var minWidth: deprecateString('target', 'MinWidth.TARGET'),
    var sidePadding: Int

    var attached: Boolean // Popup adjacent to an input, without upper border and shadow

//    var legacy: Boolean
//    autoRemove: legacyProp(Boolean Messages.STOP_RENDERING),
//    onClose: legacyProp(PropTypes.func, Messages.ON_CLOSE_ATTEMPT),
//    cutEdge(props) {
//        if ('cutEdge' in props) {
//            return new Error(Messages.CUT_EDGE_RENAMED);
//        }
//        return null;
//    },
}

fun RBuilder.popup(block: RHandler<PopupProps> = {}) = child(Popup::class, block)
