package com.au.rightway.weatherforecast.modules.forecast;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\"B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006#"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/RowModel;", "", "accountSummary", "Lcom/au/rightway/weatherforecast/networking/responsemodels/Currently;", "viewType", "Lcom/au/rightway/weatherforecast/utils/Helper$RowType;", "(Lcom/au/rightway/weatherforecast/networking/responsemodels/Currently;Lcom/au/rightway/weatherforecast/utils/Helper$RowType;)V", "forecastDate", "Ljava/util/Date;", "(Ljava/util/Date;Lcom/au/rightway/weatherforecast/utils/Helper$RowType;)V", "data", "Lcom/au/rightway/weatherforecast/networking/responsemodels/DailyData;", "(Lcom/au/rightway/weatherforecast/networking/responsemodels/DailyData;Lcom/au/rightway/weatherforecast/utils/Helper$RowType;)V", "dailyData", "getDailyData", "()Lcom/au/rightway/weatherforecast/networking/responsemodels/DailyData;", "setDailyData", "(Lcom/au/rightway/weatherforecast/networking/responsemodels/DailyData;)V", "rowHeader", "Lcom/au/rightway/weatherforecast/modules/forecast/RowModel$RowHeader;", "getRowHeader", "()Lcom/au/rightway/weatherforecast/modules/forecast/RowModel$RowHeader;", "setRowHeader", "(Lcom/au/rightway/weatherforecast/modules/forecast/RowModel$RowHeader;)V", "rowType", "getRowType", "()Lcom/au/rightway/weatherforecast/utils/Helper$RowType;", "setRowType", "(Lcom/au/rightway/weatherforecast/utils/Helper$RowType;)V", "todayWeather", "getTodayWeather", "()Lcom/au/rightway/weatherforecast/networking/responsemodels/Currently;", "setTodayWeather", "(Lcom/au/rightway/weatherforecast/networking/responsemodels/Currently;)V", "RowHeader", "app_debug"})
public final class RowModel {
    @org.jetbrains.annotations.NotNull()
    private com.au.rightway.weatherforecast.utils.Helper.RowType rowType;
    @org.jetbrains.annotations.Nullable()
    private com.au.rightway.weatherforecast.networking.responsemodels.Currently todayWeather;
    @org.jetbrains.annotations.Nullable()
    private com.au.rightway.weatherforecast.modules.forecast.RowModel.RowHeader rowHeader;
    @org.jetbrains.annotations.Nullable()
    private com.au.rightway.weatherforecast.networking.responsemodels.DailyData dailyData;
    
    @org.jetbrains.annotations.NotNull()
    public final com.au.rightway.weatherforecast.utils.Helper.RowType getRowType() {
        return null;
    }
    
    public final void setRowType(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.utils.Helper.RowType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.au.rightway.weatherforecast.networking.responsemodels.Currently getTodayWeather() {
        return null;
    }
    
    public final void setTodayWeather(@org.jetbrains.annotations.Nullable()
    com.au.rightway.weatherforecast.networking.responsemodels.Currently p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.au.rightway.weatherforecast.modules.forecast.RowModel.RowHeader getRowHeader() {
        return null;
    }
    
    public final void setRowHeader(@org.jetbrains.annotations.Nullable()
    com.au.rightway.weatherforecast.modules.forecast.RowModel.RowHeader p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.au.rightway.weatherforecast.networking.responsemodels.DailyData getDailyData() {
        return null;
    }
    
    public final void setDailyData(@org.jetbrains.annotations.Nullable()
    com.au.rightway.weatherforecast.networking.responsemodels.DailyData p0) {
    }
    
    public RowModel(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.networking.responsemodels.Currently accountSummary, @org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.utils.Helper.RowType viewType) {
        super();
    }
    
    public RowModel(@org.jetbrains.annotations.NotNull()
    java.util.Date forecastDate, @org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.utils.Helper.RowType viewType) {
        super();
    }
    
    public RowModel(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.networking.responsemodels.DailyData data, @org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.utils.Helper.RowType viewType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/RowModel$RowHeader;", "", "headerDate", "Ljava/util/Date;", "(Ljava/util/Date;)V", "getHeaderDate", "()Ljava/util/Date;", "app_debug"})
    public static final class RowHeader {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Date headerDate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date getHeaderDate() {
            return null;
        }
        
        public RowHeader(@org.jetbrains.annotations.NotNull()
        java.util.Date headerDate) {
            super();
        }
    }
}