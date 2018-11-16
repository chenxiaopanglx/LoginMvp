package com.slh.chy.loginmvp.mvp.utils

import android.content.Context
import android.widget.Toast
import java.time.Duration

/**
 * Author: chy
 * Date:  2018/11/16
 * Description:
 */
class ToastUtils {
    companion object {
        fun show(context: Context, text: String, duration: Int = Toast.LENGTH_LONG) {
            var toast: Toast? = null
            if (toast == null) {
                toast = Toast.makeText(context, text, duration)
            } else {
                toast.setText(text)
            }
            toast?.show()
        }
    }
}