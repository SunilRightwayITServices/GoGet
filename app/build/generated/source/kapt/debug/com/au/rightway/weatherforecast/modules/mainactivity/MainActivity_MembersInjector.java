// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.au.rightway.weatherforecast.modules.mainactivity;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainAcivityContract.Presenter> presenterProvider;

  public MainActivity_MembersInjector(Provider<MainAcivityContract.Presenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MainAcivityContract.Presenter> presenterProvider) {
    return new MainActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }
}
