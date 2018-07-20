@file:JsModule("@jetbrains/ring-ui/components/popup-menu/popup-menu")

package ringui.popupMenu

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class PopupMenu : Component<PopupMenuProps, RState> {
    override fun render(): ReactElement?
}
