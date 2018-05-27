// Generated code from Butter Knife. Do not modify!
package com.au.rightway.weatherforecast.modules.forecast;

import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class WeatherForecastFragment_ViewBinding implements Unbinder {
  private WeatherForecastFragment target;

  private View view2131165332;

  @UiThread
  public WeatherForecastFragment_ViewBinding(final WeatherForecastFragment target, View source) {
    this.target = target;

    View view;
    target.swipeContainer = Utils.findRequiredViewAsType(source, 2131165315, "field 'swipeContainer'", SwipeRefreshLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, 2131165281, "field 'recyclerView'", RecyclerView.class);
    target.errorLoadingLayout = Utils.findRequiredView(source, 2131165237, "field 'errorLoadingLayout'");
    view = Utils.findRequiredView(source, 2131165332, "method 'onTryAgain'");
    view2131165332 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTryAgain();
      }
    });
  }

  @Override
  public void unbind() {
    WeatherForecastFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeContainer = null;
    target.recyclerView = null;
    target.errorLoadingLayout = null;

    view2131165332.setOnClickListener(null);
    view2131165332 = null;
  }
}
