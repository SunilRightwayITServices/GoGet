package com.au.rightway.weatherforecast.utils;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/au/rightway/weatherforecast/utils/Helper;", "", "()V", "DARKSKY_API_KEY", "", "getDARKSKY_API_KEY", "()Ljava/lang/String;", "DATE_FORMAT_TO_DISPLAY", "formatDateToDisplay", "date", "Ljava/util/Date;", "RowType", "app_debug"})
public final class Helper {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DARKSKY_API_KEY = "b9e5d3279be62822451e3db8c6292d7b";
    private static final java.lang.String DATE_FORMAT_TO_DISPLAY = "dd MMM yyyy";
    public static final com.au.rightway.weatherforecast.utils.Helper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDARKSKY_API_KEY() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDateToDisplay(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    private Helper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/au/rightway/weatherforecast/utils/Helper$RowType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "TODAY_SUMMARY", "ROW_HEADER", "ROW_DATA", "app_debug"})
    public static enum RowType {
        /*public static final*/ TODAY_SUMMARY /* = new TODAY_SUMMARY(0) */,
        /*public static final*/ ROW_HEADER /* = new ROW_HEADER(0) */,
        /*public static final*/ ROW_DATA /* = new ROW_DATA(0) */;
        private final int value = 0;
        
        public final int getValue() {
            return 0;
        }
        
        RowType(int value) {
        }
    }
}