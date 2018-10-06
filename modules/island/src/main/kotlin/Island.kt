@file:JsModule("@jetbrains/ring-ui/components/island/island")

package ringui.island

import react.Component
import react.RState
import react.ReactElement


@JsName("default")
external class Island : Component<IslandProps, RState> {
    override fun render(): ReactElement?
}

@JsName("AdaptiveIsland")
external class AdaptiveIsland : Component<IslandProps, RState> {
    override fun render(): ReactElement?
}

@JsName("Header")
external class IslandHeader : Component<IslandHeaderProps, RState> {
    override fun render(): ReactElement?
}

@JsName("Content")
external class IslandContent : Component<IslandContentProps, RState> {
    override fun render(): ReactElement?
}
