package com.slh.chy.loginmvp.mvp.view

/**
 * Author: chy
 * Date:  2018/11/16
 * Description:
 */
interface IView {
    val userName: String
    val password: String
    fun showLoading()
    fun hideLoading()
    fun showFailedMessage()
    fun toMainActivity()
    fun toRegisterActivity()
    fun clearUserName()
    fun clearPassword()
}