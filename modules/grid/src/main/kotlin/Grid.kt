@file:JsModule("@jetbrains/ring-ui/components/grid/grid")

package ringui.grid

import react.Component
import react.RState
import react.ReactElement
import ringui.RClassnameProps

external class Grid : Component<RClassnameProps, RState> {
    override fun render(): ReactElement?
}

external class Row : Component<RowProps, RState> {
    override fun render(): ReactElement?
}

external class Col : Component<ColProps, RState> {
    override fun render(): ReactElement?
}
