package ringui.button

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps
import ringui.REventFunc

interface ButtonProps : RDynamicProps {
    var theme: String
    var active: Boolean
    var danger: Boolean
    var delayed: Boolean
    var loader: Boolean
    var primary: Boolean
    var short: Boolean
    var text: Boolean
    var inline: Boolean
    var dropdown: Boolean

    var iconSize: Int
    var iconClassName: String

    // icon: String | ()->String
    fun icon(value: String, iconSize: Int? = null, className: String? = null) {
        this.icon = value
        iconSize?.let { this.iconSize = it }
        className?.let { this.iconClassName = it }
    }

    fun icon(value: () -> String, iconSize: Int? = null, className: String? = null) {
        this.asDynamic().icon = value
        iconSize?.let { this.iconSize = it }
        className?.let { this.iconClassName = it }
    }
}

fun RBuilder.button(label: String? = null, active: Boolean? = null, primary: Boolean? = null, danger: Boolean? = null, icon: String? = null, iconSize: Int? = null, href: String? = null, theme: String? = null, onClick: REventFunc? = null, block: RHandler<ButtonProps> = {}) = child(Button::class) {
    active?.let { attrs.active = it }
    primary?.let { attrs.primary = it }
    danger?.let { attrs.danger = it }

    label?.let { +it }
    icon?.let { attrs.icon(it, iconSize) }
    href?.let { attrs.href = it }
    theme?.let { attrs.theme = it }
    onClick?.let { attrs.onClick = it }

    this.block()
}

