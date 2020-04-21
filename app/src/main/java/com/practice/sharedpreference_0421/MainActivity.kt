package com.practice.sharedpreference_0421

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practice.sharedpreference_0421.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun setupEvents() {
        loginBtn.setOnClickListener {
            val inputId = idEdt.text.toString()
            ContextUtil.setUserId(mContext, inputId)

        }

    }

    override fun setValues() {
    idEdt.setText(ContextUtil.getUserId(mContext))


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }
}
