package ringui.pager

import kotlinext.js.JsObject
import react.RBuilder
import react.RHandler
import ringui.RClassnameProps

data class PagerTranslations(val perPage: String, val firstPage: String, val lastPage: String, val nextPage: String, val previousPage: String)

interface PagerProps : RClassnameProps {
    var total: Int
    var currentPage: Int
    var pageSize: Int
    var pageSizes: Array<Int>
    var visiblePagesLimit: Int
    var disablePageSizeSelector: Boolean
    var onPageChange: (currentPage: Int) -> Unit
    var onPageSizeChange: (pageSize: Int) -> Unit
    var translations: JsObject
}

fun PagerProps.translations(value: PagerTranslations) {
    val map = js("{}")
    map.perPage = value.perPage
    map.firstPage = value.firstPage
    map.lastPage = value.lastPage
    map.nextPage = value.nextPage
    this.translations = map
}

fun RBuilder.pager(total: Int, currentPage: Int? = null, onPageChange: ((currentPage: Int) -> Unit)? = null, disablePageSizeSelector: Boolean? = null, onPageSizeChange: ((pageSize: Int) -> Unit)? = null, block: RHandler<PagerProps> = {}) = child(Pager::class) {
    attrs.total = total
    attrs.onPageChange = onPageChange ?: {}

    currentPage?.let { attrs.currentPage = currentPage }
    disablePageSizeSelector?.let { attrs.disablePageSizeSelector = disablePageSizeSelector }
    onPageSizeChange?.let { attrs.onPageSizeChange = onPageSizeChange }

    block()
}
