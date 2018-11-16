package com.slh.chy.loginmvp.mvp.preserent

import android.os.Handler
import com.slh.chy.loginmvp.mvp.bean.UserBean
import com.slh.chy.loginmvp.mvp.model.LoginModel
import com.slh.chy.loginmvp.mvp.model.OnLoginListener
import com.slh.chy.loginmvp.mvp.view.IView

/**
 * Author: chy
 * Date:  2018/11/16
 * Description:
 */
class LoginPresenter(val view:IView) {
    private val model = LoginModel()
    val handler = Handler()

    fun login() {
        model.login(view.userName, view.password, object : OnLoginListener{
            override fun loginSuccess(userBean: UserBean) {
                handler.post {
                    view.toMainActivity()
                }
             }

            override fun loginFailed() {
                handler.post {
                    view.showFailedMessage()
                }
             }

        })
    }

    fun clear() {
        view.clearPassword()
        view.clearUserName()
    }

}