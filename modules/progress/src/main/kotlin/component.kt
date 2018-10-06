package ringui.progress

import react.RBuilder
import react.RHandler
import ringui.RClassnameProps

/**
 * @author jansorg
 */
// PopupMenu
interface ProgressbarProps : RClassnameProps {
    /**
     * Dark background mode
     * @type {boolean}
     */
    var light: Boolean

    /**
     * Sets the ring-progress-bar_global class to position the progress bar on top of the screen.
     * Should be placed directly inside body, will be positioned right below .ring-header
     * if placed adjacent to it.
     * @type {boolean}
     */
    var global: Boolean

    /**
     * Custom class
     * @type {string}
     */
    override var className: String

    /**
     * A floating point number that specifies minimum completion rate for a task to be considered
     * complete. Default value is 1.0.
     * @type {number}
     */
    var max: Double

    /**
     * A floating point number that specifies current task completion rate.
     * @type {number}
     */
    var value: Double
}

fun RBuilder.progressbar(value: Double? = null, block: RHandler<ProgressbarProps> = {}) = child(ProgressBar::class) {
    value?.let { attrs.value = value }

    block()
}
