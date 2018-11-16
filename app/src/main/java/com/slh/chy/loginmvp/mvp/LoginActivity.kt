package com.slh.chy.loginmvp.mvp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.slh.chy.loginmvp.MainActivity
import com.slh.chy.loginmvp.R
import com.slh.chy.loginmvp.mvp.preserent.LoginPresenter
import com.slh.chy.loginmvp.mvp.utils.ToastUtils
import com.slh.chy.loginmvp.mvp.view.IView
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), IView {

    private val loginPresenter = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginBtn.setOnClickListener {
            loginPresenter.login()
        }
        clearBtn.setOnClickListener {
            loginPresenter.clear()
        }
     }

    override val userName: String
        get() =  userNameEdit.text.toString()
    override val password: String
        get() =  userPasswordEdit.text.toString()

    override fun showLoading() {
     }

    override fun hideLoading() {
     }

    override fun toMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
     }

    override fun clearUserName() {
        userNameEdit.setText("")
     }

    override fun clearPassword() {
        userPasswordEdit.setText("")
     }

    override fun toRegisterActivity() {
        ToastUtils.show(this, "去注册")

    }

    override fun showFailedMessage() {
        ToastUtils.show(this, "用户名密码错误")
    }


}
