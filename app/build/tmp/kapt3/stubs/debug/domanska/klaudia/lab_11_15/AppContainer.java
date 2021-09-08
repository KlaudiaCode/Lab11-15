package domanska.klaudia.lab_11_15;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Ldomanska/klaudia/lab_11_15/AppContainer;", "", "()V", "database", "Ldomanska/klaudia/lab_11_15/data/AppDatabase;", "getDatabase", "()Ldomanska/klaudia/lab_11_15/data/AppDatabase;", "setDatabase", "(Ldomanska/klaudia/lab_11_15/data/AppDatabase;)V", "repository", "Ldomanska/klaudia/lab_11_15/Repository;", "getRepository", "()Ldomanska/klaudia/lab_11_15/Repository;", "setRepository", "(Ldomanska/klaudia/lab_11_15/Repository;)V", "init", "", "context", "Landroid/content/Context;", "app_debug"})
public final class AppContainer {
    @org.jetbrains.annotations.NotNull()
    public static final domanska.klaudia.lab_11_15.AppContainer INSTANCE = null;
    public static domanska.klaudia.lab_11_15.data.AppDatabase database;
    public static domanska.klaudia.lab_11_15.Repository repository;
    
    private AppContainer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final domanska.klaudia.lab_11_15.data.AppDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    domanska.klaudia.lab_11_15.data.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final domanska.klaudia.lab_11_15.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    domanska.klaudia.lab_11_15.Repository p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}