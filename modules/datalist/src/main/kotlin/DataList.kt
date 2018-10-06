@file:JsModule("@jetbrains/ring-ui/components/data-list/data-list")

package ringui.dataList

import react.Component
import react.RState
import react.ReactElement

//external fun makeDatalist(): DataList

@JsName("default")
external class DataList : Component<DataListProps, RState> {
    override fun render(): ReactElement?
}
