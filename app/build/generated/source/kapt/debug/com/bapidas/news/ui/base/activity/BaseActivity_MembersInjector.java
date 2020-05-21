// Generated by Dagger (https://dagger.dev).
package com.bapidas.news.ui.base.activity;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.bapidas.news.di.qualifier.ActivityContext;
import com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseActivity_MembersInjector<D extends ViewDataBinding, V extends BaseActivityViewModel> implements MembersInjector<BaseActivity<D, V>> {
  private final Provider<DispatchingAndroidInjector<Object>> supportFragmentInjectorProvider;

  private final Provider<ViewModelProvider> viewModelProvider;

  public BaseActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> supportFragmentInjectorProvider,
      Provider<ViewModelProvider> viewModelProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.viewModelProvider = viewModelProvider;
  }

  public static <D extends ViewDataBinding, V extends BaseActivityViewModel> MembersInjector<BaseActivity<D, V>> create(
      Provider<DispatchingAndroidInjector<Object>> supportFragmentInjectorProvider,
      Provider<ViewModelProvider> viewModelProvider) {
    return new BaseActivity_MembersInjector<D, V>(supportFragmentInjectorProvider, viewModelProvider);}

  @Override
  public void injectMembers(BaseActivity<D, V> instance) {
    injectSupportFragmentInjector(instance, supportFragmentInjectorProvider.get());
    injectViewModelProvider(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("com.bapidas.news.ui.base.activity.BaseActivity.supportFragmentInjector")
  public static <D extends ViewDataBinding, V extends BaseActivityViewModel> void injectSupportFragmentInjector(
      BaseActivity<D, V> instance, DispatchingAndroidInjector<Object> supportFragmentInjector) {
    instance.supportFragmentInjector = supportFragmentInjector;
  }

  @InjectedFieldSignature("com.bapidas.news.ui.base.activity.BaseActivity.viewModelProvider")
  @ActivityContext
  public static <D extends ViewDataBinding, V extends BaseActivityViewModel> void injectViewModelProvider(
      BaseActivity<D, V> instance, ViewModelProvider viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}