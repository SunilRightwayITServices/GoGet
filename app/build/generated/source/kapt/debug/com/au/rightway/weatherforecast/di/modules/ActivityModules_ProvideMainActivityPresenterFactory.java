// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.au.rightway.weatherforecast.di.modules;

import com.au.rightway.weatherforecast.modules.mainactivity.MainAcivityContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ActivityModules_ProvideMainActivityPresenterFactory
    implements Factory<MainAcivityContract.Presenter> {
  private final ActivityModules module;

  public ActivityModules_ProvideMainActivityPresenterFactory(ActivityModules module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MainAcivityContract.Presenter get() {
    return Preconditions.checkNotNull(
        module.provideMainActivityPresenter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MainAcivityContract.Presenter> create(ActivityModules module) {
    return new ActivityModules_ProvideMainActivityPresenterFactory(module);
  }
}
