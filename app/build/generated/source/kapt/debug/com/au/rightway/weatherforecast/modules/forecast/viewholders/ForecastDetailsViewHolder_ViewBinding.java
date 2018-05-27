// Generated code from Butter Knife. Do not modify!
package com.au.rightway.weatherforecast.modules.forecast.viewholders;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class ForecastDetailsViewHolder_ViewBinding implements Unbinder {
  private ForecastDetailsViewHolder target;

  private View view2131165338;

  @UiThread
  public ForecastDetailsViewHolder_ViewBinding(final ForecastDetailsViewHolder target,
      View source) {
    this.target = target;

    View view;
    target.temperatureTextView = Utils.findRequiredViewAsType(source, 2131165319, "field 'temperatureTextView'", TextView.class);
    target.windSpeedTextView = Utils.findRequiredViewAsType(source, 2131165343, "field 'windSpeedTextView'", TextView.class);
    target.humidityTextView = Utils.findRequiredViewAsType(source, 2131165249, "field 'humidityTextView'", TextView.class);
    target.pressureTextView = Utils.findRequiredViewAsType(source, 2131165277, "field 'pressureTextView'", TextView.class);
    view = Utils.findRequiredView(source, 2131165338, "method 'onRowClicked'");
    view2131165338 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRowClicked();
      }
    });
  }

  @Override
  public void unbind() {
    ForecastDetailsViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.temperatureTextView = null;
    target.windSpeedTextView = null;
    target.humidityTextView = null;
    target.pressureTextView = null;

    view2131165338.setOnClickListener(null);
    view2131165338 = null;
  }
}
