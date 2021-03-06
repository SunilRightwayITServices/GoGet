package com.au.rightway.weatherforecast.utils

import io.reactivex.Scheduler

/**
 * Interface for our Scheduler Container.
 */

interface SchedulersProvider {
    fun mainUiThread(): Scheduler

    fun io(): Scheduler

    fun computation(): Scheduler

    fun immediate(): Scheduler
}
