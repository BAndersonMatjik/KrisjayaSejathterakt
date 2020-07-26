package com.beone.krisjayasejathtera.networking

import io.reactivex.Scheduler

interface Scheduler {
    fun mainThread(): Scheduler
    fun io(): Scheduler
}