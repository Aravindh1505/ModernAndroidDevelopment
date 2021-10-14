package com.aravindh.androidcore.rxjava

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.aravindh.androidcore.R
import com.aravindh.androidcore.databinding.ActivityRxJavaBinding
import com.aravindh.androidcore.utils.CustomLogger
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.disposables.Disposable


class RxJavaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRxJavaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_rx_java)

        initViews()
    }

    private fun initViews() {

        val months: Observable<String> =
            Observable.just("Jan", "Feb", "Mar", "Apr", "May")

        val result: Observer<String> = object : Observer<String> {
            override fun onSubscribe(d: Disposable) {
                CustomLogger.d("onSubscribe")
            }

            override fun onNext(s: String) {
                CustomLogger.d("Name: $s")
            }

            override fun onError(e: Throwable) {
                CustomLogger.d("onError: " + e.message)
            }

            override fun onComplete() {
                CustomLogger.d("All items are emitted!")
            }
        }


        months.observeOn(Schedulers.io())
            .subscribeOn(AndroidSchedulers.mainThread())
            .subscribe(result)
    }
}