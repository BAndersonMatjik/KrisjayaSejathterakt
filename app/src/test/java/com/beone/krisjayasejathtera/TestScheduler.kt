package com.beone.krisjayasejathtera

import androidx.annotation.VisibleForTesting
import com.beone.krisjayasejathtera.networking.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@VisibleForTesting(otherwise = VisibleForTesting.NONE)
class TestScheduler: Scheduler {
    override fun mainThread(): io.reactivex.Scheduler {
        return Schedulers.trampoline()
    }

    override fun io(): io.reactivex.Scheduler {
        return Schedulers.trampoline()
    }

}