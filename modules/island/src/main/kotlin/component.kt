package ringui.island

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps
import ringui.REventFunc

interface IslandProps : RClassnameProps {
    var narrow: Boolean
    var withoutPaddings: Boolean
}

interface IslandHeaderProps : RClassnameProps {
    var border: Boolean
    var wrapWithTitle: Boolean
    var phase: Number
}

interface IslandContentProps : RClassnameProps {
    var scrollableWrapperClassName: String
    var fade: Boolean
    var bottomBorder: Boolean
    var onScroll: REventFunc
    var onScrollToBottom: REventFunc
}

fun RBuilder.island(className: String? = null, narrow: Boolean? = null, withoutPaddings: Boolean? = null, block: RHandler<IslandProps> = {}) = child(Island::class) {
    className?.let { attrs.className = className }
    narrow?.let { attrs.narrow = narrow }
    withoutPaddings?.let { attrs.withoutPaddings = withoutPaddings }

    block()
}

fun RBuilder.adaptiveIsland(className: String? = null, narrow: Boolean? = null, withoutPaddings: Boolean? = null, block: RHandler<IslandProps> = {}) = child(AdaptiveIsland::class) {
    className?.let { attrs.className = className }
    narrow?.let { attrs.narrow = narrow }
    withoutPaddings?.let { attrs.withoutPaddings = withoutPaddings }

    block()
}

fun RBuilder.islandHeader(title: String? = null, className: String? = null, border: Boolean? = null, wrapWithTitle: Boolean? = null, block: RHandler<IslandHeaderProps> = {}) = child(IslandHeader::class) {
    className?.let { attrs.className = className }
    border?.let { attrs.border = border }
    wrapWithTitle?.let { attrs.wrapWithTitle = wrapWithTitle }

    title?.let { +it }
    block()
}

fun RBuilder.islandContent(content: String? = null, className: String? = null, scrollableWrapperClassName: String? = null, fade: Boolean? = null, bottomBorder: Boolean? = null, block: RHandler<IslandContentProps> = {}) = child(IslandContent::class) {
    className?.let { attrs.className = className }
    scrollableWrapperClassName?.let { attrs.scrollableWrapperClassName = scrollableWrapperClassName }
    fade?.let { attrs.fade = fade }
    bottomBorder?.let { attrs.bottomBorder = bottomBorder }

    content?.let { +content }
    block()
}

