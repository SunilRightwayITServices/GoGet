package com.au.rightway.weatherforecast.modules.mainactivity


interface MainAcivityContract {
    interface View

    interface Presenter {

        fun attachView(view: View)

        fun detachView()

    }
}
