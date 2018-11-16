package com.slh.chy.loginmvp.mvp.model

import com.slh.chy.loginmvp.mvp.bean.UserBean

/**
 * Author: chy
 * Date:  2018/11/16
 * Description:
 */
interface OnLoginListener {
    fun loginSuccess(userBean: UserBean)
    fun loginFailed()
}