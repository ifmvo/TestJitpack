package com.ifmvo.testjitpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ifmvo.testjitpack1.TestJitpack1
import com.ifmvo.testjitpack2.TestJitpack2
import com.ifmvo.testjitpack3.TestJitpack3

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestJitpack1.print1()
        TestJitpack2.print2()
        TestJitpack3.print3()
    }
}
