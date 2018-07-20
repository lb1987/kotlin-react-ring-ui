package ringui.datepicker

import react.RBuilder
import react.RProps

interface DatePickerProps : RProps {
    var date: String
    var from: String
    var to: String
}

fun RBuilder.datePicker() = child(DatePicker::class) {}

