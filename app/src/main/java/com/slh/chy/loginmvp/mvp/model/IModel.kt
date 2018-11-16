package com.slh.chy.loginmvp.mvp.model

/**
 * Author: chy
 * Date:  2018/11/16
 * Description:
 */
interface IModel {
    fun login(userName: String, userPassword: String, onLoginListener: OnLoginListener)
}