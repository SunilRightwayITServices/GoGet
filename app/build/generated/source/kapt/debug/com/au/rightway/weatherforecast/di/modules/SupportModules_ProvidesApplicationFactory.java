// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.au.rightway.weatherforecast.di.modules;

import com.au.rightway.weatherforecast.weatherforecastApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class SupportModules_ProvidesApplicationFactory
    implements Factory<weatherforecastApplication> {
  private final SupportModules module;

  public SupportModules_ProvidesApplicationFactory(SupportModules module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public weatherforecastApplication get() {
    return Preconditions.checkNotNull(
        module.providesApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<weatherforecastApplication> create(SupportModules module) {
    return new SupportModules_ProvidesApplicationFactory(module);
  }
}