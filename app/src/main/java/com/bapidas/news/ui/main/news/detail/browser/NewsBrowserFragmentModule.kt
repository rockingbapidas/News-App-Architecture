package com.bapidas.news.ui.main.news.detail.browser

import androidx.fragment.app.Fragment
import com.bapidas.news.ui.di.key.FragmentViewModelKey
import com.bapidas.news.ui.di.scope.FragmentScope
import com.bapidas.news.ui.base.viewmodel.BaseFragmentViewModel
import com.handzap.handzap.ui.base.fragment.BaseFragmentModule
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseFragmentModule::class])
abstract class NewsBrowserFragmentModule {
    @Binds
    @FragmentScope
    abstract fun bindFragment(fragment: NewsBrowserFragment): Fragment

    @Binds
    @IntoMap
    @FragmentViewModelKey(NewsBrowserViewModel::class)
    @FragmentScope
    abstract fun bindViewModel(viewModel: NewsBrowserViewModel): BaseFragmentViewModel
}