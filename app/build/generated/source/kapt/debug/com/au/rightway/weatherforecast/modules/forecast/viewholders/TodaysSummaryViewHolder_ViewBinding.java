// Generated code from Butter Knife. Do not modify!
package com.au.rightway.weatherforecast.modules.forecast.viewholders;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class TodaysSummaryViewHolder_ViewBinding implements Unbinder {
  private TodaysSummaryViewHolder target;

  @UiThread
  public TodaysSummaryViewHolder_ViewBinding(TodaysSummaryViewHolder target, View source) {
    this.target = target;

    target.todaySummaryTextView = Utils.findRequiredViewAsType(source, 2131165328, "field 'todaySummaryTextView'", TextView.class);
    target.temperatureSummaryTextView = Utils.findRequiredViewAsType(source, 2131165318, "field 'temperatureSummaryTextView'", TextView.class);
    target.windSpeedSummaryTextView = Utils.findRequiredViewAsType(source, 2131165342, "field 'windSpeedSummaryTextView'", TextView.class);
    target.humiditySummaryTextView = Utils.findRequiredViewAsType(source, 2131165248, "field 'humiditySummaryTextView'", TextView.class);
    target.pressureSummaryTextView = Utils.findRequiredViewAsType(source, 2131165276, "field 'pressureSummaryTextView'", TextView.class);
  }

  @Override
  public void unbind() {
    TodaysSummaryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.todaySummaryTextView = null;
    target.temperatureSummaryTextView = null;
    target.windSpeedSummaryTextView = null;
    target.humiditySummaryTextView = null;
    target.pressureSummaryTextView = null;
  }
}
