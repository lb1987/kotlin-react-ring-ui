@file:JsModule("@jetbrains/ring-ui/components/date-picker/date-picker")

package ringui.datepicker

import react.Component
import react.RState
import react.ReactElement

@JsName("default")
external class DatePicker : Component<DatePickerProps, RState> {
    override fun render(): ReactElement?
}
