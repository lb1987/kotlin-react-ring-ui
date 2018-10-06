package ringui.icon

import react.RBuilder
import react.RElementBuilder
import react.RProps

interface IconProps : RProps {
    var className: String
    var color: String
    var glyph: dynamic //string or func
    var height: Int
    var size: Int
    var width: Int

//    fun glyph(value: String) {
//        this.glyph = { value }
//    }
//
//    fun glyph(value: () -> String) {
//        this.glyph = value
//    }
}

typealias IconColor = String

object IconColors {
    val BLUE: IconColor = "blue"
    val DEFAULT: IconColor = ""
    val GRAY: IconColor = "gray"
    val GREEN: IconColor = "green"
    val ORANGE: IconColor = "orange"
    val RED: IconColor = "red"
    val WHITE: IconColor = "white"
}

typealias IconSize = Int

object IconSizes {
    val Size12: IconSize = 12
    val Size14: IconSize = 14
    val Size16: IconSize = 16
    val Size18: IconSize = 18
    val Size32: IconSize = 32
    val Size40: IconSize = 40
    val Size48: IconSize = 48
    val Size64: IconSize = 64
    val Size96: IconSize = 96
    val Size128: IconSize = 128
}

fun RBuilder.icon(glyph: String? = null, size: IconSize? = null, color: IconColor? = null, block: RElementBuilder<IconProps>.() -> Unit = {}) = child(Icon::class) {
    glyph?.let { attrs.glyph = glyph }
    size?.let { attrs.size = size }
    color?.let { attrs.color = color }

    block()
}

