package ringui.popupMenu

import react.RBuilder
import react.RHandler
import ringui.list.ListProps
import ringui.popup.PopupProps

interface PopupMenuProps : PopupProps, ListProps {
    var closeOnSelect: Boolean
}

fun RBuilder.popupMenu(block: RHandler<PopupMenuProps> = {}) = child(PopupMenu::class, block)

