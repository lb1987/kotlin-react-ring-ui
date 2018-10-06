package ringui.list

import ringui.RDynamicProps
import ringui.REventFunc

object ListItemType {
    var SEPARATOR: Short = 0
    var LINK: Short = 1
    var ITEM: Short = 2
    var HINT: Short = 3
    var CUSTOM: Short = 4
    var TITLE: Short = 5
    var MARGIN: Short = 6
}

data class ListItem(var label: String, var rgItemType: Short = ListItemType.ITEM, val disabled: Boolean? = null, val key: String? = null, val details: String? = null)

interface ListProps : RDynamicProps {
    var hint: String
    var hintOnSelection: String
    var data: Array<ListItem>
    var maxHeight: Int
    var activeIndex: Int
    var restoreActiveIndex: Boolean
    var activateSingleItem: Boolean
    var activateFirstItem: Boolean
    var shortcuts: Boolean
    //    var onMouseOut: REventFunc
//    var onSelect: REventFunc
    var onScrollToBottom: REventFunc
    var useMouseUp: Boolean
    var visible: Boolean
    var renderOptimization: Boolean
    var disableMoveDownOverflow: Boolean
}

