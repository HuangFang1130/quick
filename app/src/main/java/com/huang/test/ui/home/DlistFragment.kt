package com.huang.test.ui.home

import android.os.Bundle
import com.huang.test.R
import com.huang.test.base.BaseFragment

/**
 * Created by EDZ on 2020/4/1.
 */
class DlistFragment : BaseFragment() {
    companion object {
        fun getInstance(): DlistFragment {
            val fragment = DlistFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }
    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun initView() {
    }

    override fun lazyLoad() {

    }
}