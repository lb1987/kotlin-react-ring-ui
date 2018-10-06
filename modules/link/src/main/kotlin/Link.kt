@file:JsModule("@jetbrains/ring-ui/components/link/link")

package ringui.link

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class Link : Component<LinkProps, RState> {
    override fun render(): ReactElement?
}

/**
 * Returns a link with a given tag name.
 */
//external fun linkHOC(tagName: String): RComponent<LinkProps, RState>
