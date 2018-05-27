package com.au.rightway.weatherforecast.modules.forecast;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0016J(\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020!H\u0016J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0016J\b\u0010,\u001a\u00020!H\u0007J\u001c\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010\u00072\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020!H\u0016J\b\u00103\u001a\u00020!H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00065"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$View;", "()V", "adapter", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastAdapter;", "errorLoadingLayout", "Landroid/view/View;", "getErrorLoadingLayout", "()Landroid/view/View;", "setErrorLoadingLayout", "(Landroid/view/View;)V", "presenter", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$Presenter;", "getPresenter", "()Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$Presenter;", "setPresenter", "(Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$Presenter;)V", "progress", "Landroid/app/ProgressDialog;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "swipeContainer", "Landroid/support/v4/widget/SwipeRefreshLayout;", "getSwipeContainer", "()Landroid/support/v4/widget/SwipeRefreshLayout;", "setSwipeContainer", "(Landroid/support/v4/widget/SwipeRefreshLayout;)V", "hideLoading", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onTryAgain", "onViewCreated", "view", "setCouldNotLoadLayoutVisibility", "showCouldNotLoadLayout", "", "showLoading", "updateView", "Companion", "app_debug"})
public final class WeatherForecastFragment extends android.support.v4.app.Fragment implements com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.View {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = 2131165315)
    public android.support.v4.widget.SwipeRefreshLayout swipeContainer;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = 2131165281)
    public android.support.v7.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = 2131165237)
    public android.view.View errorLoadingLayout;
    private com.au.rightway.weatherforecast.modules.forecast.WeatherForecastAdapter adapter;
    private android.app.ProgressDialog progress;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.Presenter presenter;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "weather_reports_fragment_tag";
    public static final com.au.rightway.weatherforecast.modules.forecast.WeatherForecastFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.widget.SwipeRefreshLayout getSwipeContainer() {
        return null;
    }
    
    public final void setSwipeContainer(@org.jetbrains.annotations.NotNull()
    android.support.v4.widget.SwipeRefreshLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getErrorLoadingLayout() {
        return null;
    }
    
    public final void setErrorLoadingLayout(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.Presenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void updateView() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void setCouldNotLoadLayoutVisibility(boolean showCouldNotLoadLayout) {
    }
    
    @butterknife.OnClick(value = {2131165332})
    public final void onTryAgain() {
    }
    
    public WeatherForecastFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}