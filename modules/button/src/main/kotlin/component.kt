package ringui.button

import react.RBuilder
import react.RHandler
import ringui.RDynamicProps
import ringui.REventFunc
import ringui.icon.Icon

interface ButtonProps : RDynamicProps {
    var active: Boolean
    var blue: Boolean
    var danger: Boolean
    var delayed: Boolean
    var loader: Boolean
    var primary: Boolean
    var short: Boolean
    var iconSize: Int
    //    var className: String
//    var children: Children

    //Icon or ()->Icon
//    var icon: dynamic

//    fun icon(value: Icon) {
//        this.icon = value
//    }

//    fun icon(value: () -> Icon) {
//        this.icon = value
//    }
}

fun RBuilder.button(label: String? = null, active: Boolean? = null, blue: Boolean? = null, danger: Boolean? = null, primary: Boolean? = null, onClick: REventFunc? = null, block: RHandler<ButtonProps> = {}) = child(Button::class) {
    active?.let { attrs.active = active }
    blue?.let { attrs.blue = blue }
    danger?.let { attrs.danger = danger }
    primary?.let { attrs.primary = primary }

    label?.let { +label }
    onClick?.let { attrs.onClick = onClick }
    this.block()
}

