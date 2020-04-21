package com.practice.sharedpreference_0421

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this;

    abstract fun setupEvents()
    abstract fun setValues()

}