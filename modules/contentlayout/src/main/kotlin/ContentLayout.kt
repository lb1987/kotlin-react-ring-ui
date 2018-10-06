@file:JsModule("@jetbrains/ring-ui/components/content-layout/content-layout")

package ringui.contentLayout

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class ContentLayout : Component<ContentLayoutProps, RState> {
    override fun render(): ReactElement?
}

external class Sidebar : Component<SidebarProps, SidebarState> {
    override fun render(): ReactElement?
}
