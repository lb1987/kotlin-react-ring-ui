package ringui.select

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps
import ringui.icon.Icon
import ringui.popup.Direction

data class AddItemFooter(val prefix: String? = null, val alwaysVisiable: Boolean? = null, val regexp: String? = null, val minLength: Int? = null)
data class Item(val label: String, val key: String, val type: String, val readOnly: Boolean, val icon: String? = null)

interface SelectProps : RClassnameProps {
    var multiple: Boolean //fixme
    var allowAny: Boolean
    var filter: dynamic // properties: placeholder:String

    var getInitial: () -> Unit
    var onClose: () -> Unit
    var onOpen: () -> Unit
    var onDone: () -> Unit
    var onFilter: () -> Unit
    var onChange: () -> Unit
    var onReset: () -> Unit
    var onLoadMore: () -> Unit
    var onAdd: () -> Unit
    var onBeforeOpen: () -> Unit
    var onSelect: () -> Unit
    var onDeselect: () -> Unit
    var onFocus: () -> Unit
    var onBlur: () -> Unit
    var onKeyDown: () -> Unit

    var selected: dynamic /*objec | Array<Object> */
    var data: Array<Item>
    var tags: dynamic // map of name -> Tag
    // var targetElement: PropTypes.

    var loading: Boolean
    var loadingMessage: String
    var notFoundMessage: String
    var maxHeight: Int
    var minWidth: Int
    var directions: Array<Direction>
    var popupClassName: String
    var top: Int
    var left: Int
    var renderOptimization: Boolean
    var ringPopupTarget: String
    //    var hint: List.ListHint.propTypes.label
    var add: AddItemFooter
    //var type: PropTypes.oneOf(Object.values(Type))
    var disabled: Boolean
    var hideSelected: Boolean
    var label: String
    var selectedLabel: String
    var clear: Boolean
    var hideArrow: Boolean
}

fun SelectProps.resetTag(label: String? = null, separator: Boolean = false, glyph: Icon? = null) {
    val o = js("{}")
    o.label = label
    o.separator = separator
    o.glyph = glyph

    val map = js("{}")
    map.reset = o
    this.tags = map
}

fun RBuilder.select(block: RHandler<SelectProps> = {}) = child(Select::class) {
    block()
}

