package com.practice.sharedpreference_0421.utils

import android.content.Context

class ContextUtil{

    companion object{

        val prefName = "MyPref" //메모장의 파일명에 대응되는 개념 / 프로젝트에맞는이름
        val USER_ID = "USER_ID" //메모장에저장될항목의 이름


        // setter 라는 저장용 함수
        fun setUserId(context:Context, inputId:String){
            //메모장의 파일을 여는 것과 비슷한 행위
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            //USER_ID 항목에 함수의 재료로 들어오는 스트링 변수 지정
            pref.edit().putString(USER_ID, inputId).apply()



        }
//getter : 저장된 데이터 조회용 함수
        fun getUserId(context: Context) : String{
    val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
    return pref.getString(USER_ID, "")!!

}


    }
}