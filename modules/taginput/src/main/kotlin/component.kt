package ringui.tagInput

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps
import ringui.icon.Icon
import kotlin.js.Promise

data class Tag(var key: String, val label: String, val icon: Icon? = null)

interface TagsInputProps : RClassnameProps {
    var tags: Array<Tag>
    var dataSource: Promise<Array<Tag>>
    var onAddTag: () -> Unit
    var onRemoveTag: () -> Unit
    //fixme
    //    customTagComponent: (props, propName, componentName) =>
    var maxPopupHeight: Int
    var minPopupWidth: Int
    var placeholder: String
    var canNotBeEmpty: Boolean
    var disabled: Boolean
    var autoOpen: Boolean
    var renderOptimization: Boolean

    var loadingMessage: String
    var notFoundMessage: String
}

fun RBuilder.tagsInput(disabled: Boolean? = null, block: RHandler<TagsInputProps> = {}) = child(TagsInput::class) {
    disabled?.let { attrs.disabled = disabled }

    block()
}

