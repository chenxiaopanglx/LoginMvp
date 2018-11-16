package com.slh.chy.loginmvp.mvp.model

import com.slh.chy.loginmvp.mvp.bean.UserBean

/**
 * Author: chy
 * Date:  2018/11/16
 * Description:
 */
class LoginModel : IModel {
    override fun login(userName: String, userPassword: String, onLoginListener: OnLoginListener) {
        Thread {
            Thread.sleep(2 * 1000)
            if ("chy" == userName && "123" == userPassword) {
                val userBean = UserBean(userName, userPassword)
                onLoginListener.loginSuccess(userBean)
            }else {
                onLoginListener.loginFailed()
            }
        }.start()
    }
}