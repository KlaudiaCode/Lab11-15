package domanska.klaudia.lab_11_15.ui.refuellingForm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Ldomanska/klaudia/lab_11_15/ui/refuellingForm/RefuellingFormViewModel;", "Landroidx/lifecycle/ViewModel;", "refuellingId", "", "(I)V", "isEditing", "", "()Z", "setEditing", "(Z)V", "localDate", "Ljava/time/LocalDate;", "getLocalDate", "()Ljava/time/LocalDate;", "setLocalDate", "(Ljava/time/LocalDate;)V", "refuelling", "Landroidx/lifecycle/LiveData;", "Ldomanska/klaudia/lab_11_15/data/entity/Refueling;", "getRefuelling", "()Landroidx/lifecycle/LiveData;", "insertRefuelling", "Lkotlinx/coroutines/Job;", "refueling", "updateRefuelling", "app_debug"})
public final class RefuellingFormViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.time.LocalDate localDate;
    private boolean isEditing = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<domanska.klaudia.lab_11_15.data.entity.Refueling> refuelling = null;
    
    public RefuellingFormViewModel(int refuellingId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getLocalDate() {
        return null;
    }
    
    public final void setLocalDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate p0) {
    }
    
    public final boolean isEditing() {
        return false;
    }
    
    public final void setEditing(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<domanska.klaudia.lab_11_15.data.entity.Refueling> getRefuelling() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertRefuelling(@org.jetbrains.annotations.NotNull()
    domanska.klaudia.lab_11_15.data.entity.Refueling refueling) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateRefuelling(@org.jetbrains.annotations.NotNull()
    domanska.klaudia.lab_11_15.data.entity.Refueling refueling) {
        return null;
    }
}