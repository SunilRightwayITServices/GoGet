// Generated code from Butter Knife. Do not modify!
package com.au.rightway.weatherforecast.modules.forecast.viewholders;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class ForecastHeaderViewHolder_ViewBinding implements Unbinder {
  private ForecastHeaderViewHolder target;

  @UiThread
  public ForecastHeaderViewHolder_ViewBinding(ForecastHeaderViewHolder target, View source) {
    this.target = target;

    target.forecastDateTextView = Utils.findRequiredViewAsType(source, 2131165240, "field 'forecastDateTextView'", TextView.class);
  }

  @Override
  public void unbind() {
    ForecastHeaderViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.forecastDateTextView = null;
  }
}
