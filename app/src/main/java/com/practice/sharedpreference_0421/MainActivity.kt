package com.practice.sharedpreference_0421

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.practice.sharedpreference_0421.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun setupEvents() {
        loginBtn.setOnClickListener {
            val inputId = idEdt.text.toString()
            ContextUtil.setUserId(mContext, inputId)

            idSaveCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
                ContextUtil.setSaveId(mContext,isChecked)

                if(isChecked){
                    Toast.makeText(mContext, "아이디저장", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(mContext,"저장해제", Toast.LENGTH_SHORT).show()
                }
            }

        }

    }

    override fun setValues() {
    idEdt.setText(ContextUtil.getUserId(mContext))

        idSaveCheckBox.isChecked = ContextUtil.getSaveId(mContext)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }
}
