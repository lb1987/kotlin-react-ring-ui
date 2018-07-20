package ringui.dataList

import react.RBuilder
import react.RHandler
import react.RProps

//interface ItemProps:RProps{
//    var item: any,
//    var title: string,
//    var items: any[],
//    var className?: string,
//    var level: number,
//    var parentShift?: number,
//
//    var itemFormatter: (item: any) => ItemType,
//
//    var collapsible: boolean,
//    var collapsed: boolean,
//    var onCollapse: () => void,
//    var onExpand: () => void,
//
//    var showFocus: boolean,
//    var onFocus: (item: ItemType) => void,
//
//    var selection: Selection,
//    var selectable: boolean,
//    var selected: boolean,
//    var onSelect: (item: ItemType, selected: boolean) => void,
//
//    var showMoreLessButton: MoreLessButtonState,
//    var onItemMoreLess: (item?: ItemType, more?: boolean) => void
//}

@Suppress("ArrayInDataClass")
data class Item(
        var id: Any,
        var title: dynamic,
        var selectable: Boolean? = null,
        var collapsible: Boolean? = null,
        var collapsed: Boolean? = null,
        var onCollapse: () -> Unit = {},
        var onExpand: () -> Unit = {},
        var items: Array<Item>? = null)

typealias MoreLessButtonState = Short

object MoreLessButtonStates {
    val UNUSED: MoreLessButtonState = 0
    val MORE: MoreLessButtonState = 1
    val MORE_LOADING: MoreLessButtonState = 2
    val LESS: MoreLessButtonState = 3
}

interface DataListProps : RProps {
    var className: String
    var data: Array<Item>
    var loading: Boolean
    var itemFormatter: (item: Item) -> Item

    var onItemMoreLess: (item: Item, more: Boolean?) -> Unit
    var itemMoreLessState: (item: Item?) -> MoreLessButtonState

    var remoteSelection: Boolean

    // selectionShortcutsHOC
//    selection: Selection,
    var selectable: Boolean
//    onSelect: (selection?: Selection) => void,
//    shortcutsMap:
//    {},

    // focusSensorHOC
    var focused: Boolean

    // disableHoverHOC
    var disabledHover: Boolean
}

fun RBuilder.dataList(block: RHandler<DataListProps> = {}) = child(DataList::class) {
    block()
}