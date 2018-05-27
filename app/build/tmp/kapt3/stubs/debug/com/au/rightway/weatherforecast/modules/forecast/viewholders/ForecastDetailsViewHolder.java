package com.au.rightway.weatherforecast.modules.forecast.viewholders;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001bH\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r\u00a8\u0006#"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/viewholders/ForecastDetailsViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$ForecastDataViewHolder;", "itemView", "Landroid/view/View;", "mClickListener", "Lcom/au/rightway/weatherforecast/modules/forecast/viewholders/ForecastDetailsViewHolder$ClickListener;", "(Landroid/view/View;Lcom/au/rightway/weatherforecast/modules/forecast/viewholders/ForecastDetailsViewHolder$ClickListener;)V", "humidityTextView", "Landroid/widget/TextView;", "getHumidityTextView", "()Landroid/widget/TextView;", "setHumidityTextView", "(Landroid/widget/TextView;)V", "pressureTextView", "getPressureTextView", "setPressureTextView", "temperatureTextView", "getTemperatureTextView", "setTemperatureTextView", "windSpeedTextView", "getWindSpeedTextView", "setWindSpeedTextView", "onRowClicked", "", "setHumidity", "humidity", "", "setPressure", "pressure", "setTemperature", "temperature", "setWindSpeed", "windSpeed", "ClickListener", "app_debug"})
public final class ForecastDetailsViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.ForecastDataViewHolder {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = 2131165319)
    public android.widget.TextView temperatureTextView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = 2131165343)
    public android.widget.TextView windSpeedTextView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = 2131165249)
    public android.widget.TextView humidityTextView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = 2131165277)
    public android.widget.TextView pressureTextView;
    private final com.au.rightway.weatherforecast.modules.forecast.viewholders.ForecastDetailsViewHolder.ClickListener mClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTemperatureTextView() {
        return null;
    }
    
    public final void setTemperatureTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getWindSpeedTextView() {
        return null;
    }
    
    public final void setWindSpeedTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getHumidityTextView() {
        return null;
    }
    
    public final void setHumidityTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getPressureTextView() {
        return null;
    }
    
    public final void setPressureTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public void setTemperature(@org.jetbrains.annotations.NotNull()
    java.lang.String temperature) {
    }
    
    @java.lang.Override()
    public void setWindSpeed(@org.jetbrains.annotations.NotNull()
    java.lang.String windSpeed) {
    }
    
    @java.lang.Override()
    public void setHumidity(@org.jetbrains.annotations.NotNull()
    java.lang.String humidity) {
    }
    
    @java.lang.Override()
    public void setPressure(@org.jetbrains.annotations.NotNull()
    java.lang.String pressure) {
    }
    
    @butterknife.OnClick(value = {2131165338})
    public final void onRowClicked() {
    }
    
    public ForecastDetailsViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.Nullable()
    com.au.rightway.weatherforecast.modules.forecast.viewholders.ForecastDetailsViewHolder.ClickListener mClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/viewholders/ForecastDetailsViewHolder$ClickListener;", "", "onClick", "", "position", "", "app_debug"})
    public static abstract interface ClickListener {
        
        public abstract void onClick(int position);
    }
}