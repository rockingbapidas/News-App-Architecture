// Generated by Dagger (https://dagger.dev).
package com.bapidas.news.ui.main;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  @Override
  public MainViewModel get() {
    return newInstance();
  }

  public static MainViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MainViewModel newInstance() {
    return new MainViewModel();
  }

  private static final class InstanceHolder {
    private static final MainViewModel_Factory INSTANCE = new MainViewModel_Factory();
  }
}