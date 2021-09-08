package domanska.klaudia.lab_11_15.ui.vehicleForm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J*\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016J\u001a\u0010\'\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Ldomanska/klaudia/lab_11_15/ui/vehicleForm/VehicleFormFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "_binding", "Ldomanska/klaudia/lab_11_15/databinding/FragmentVehicleFormBinding;", "binding", "getBinding", "()Ldomanska/klaudia/lab_11_15/databinding/FragmentVehicleFormBinding;", "isEditing", "", "navArgs", "Ldomanska/klaudia/lab_11_15/ui/vehicleForm/VehicleFormFragmentArgs;", "getNavArgs", "()Ldomanska/klaudia/lab_11_15/ui/vehicleForm/VehicleFormFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "vehicle", "Ldomanska/klaudia/lab_11_15/data/entity/Vehicle;", "viewModel", "Ldomanska/klaudia/lab_11_15/ui/vehicleForm/VehicleFormViewModel;", "viewModelFactory", "Ldomanska/klaudia/lab_11_15/ui/vehicleForm/VehicleFormViewModelFactory;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "", "view", "Landroid/widget/DatePicker;", "year", "", "month", "dayOfMonth", "onViewCreated", "app_debug"})
public final class VehicleFormFragment extends androidx.fragment.app.Fragment implements android.app.DatePickerDialog.OnDateSetListener {
    private domanska.klaudia.lab_11_15.databinding.FragmentVehicleFormBinding _binding;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private boolean isEditing = false;
    private domanska.klaudia.lab_11_15.data.entity.Vehicle vehicle;
    private domanska.klaudia.lab_11_15.ui.vehicleForm.VehicleFormViewModel viewModel;
    private domanska.klaudia.lab_11_15.ui.vehicleForm.VehicleFormViewModelFactory viewModelFactory;
    
    public VehicleFormFragment() {
        super();
    }
    
    private final domanska.klaudia.lab_11_15.databinding.FragmentVehicleFormBinding getBinding() {
        return null;
    }
    
    private final domanska.klaudia.lab_11_15.ui.vehicleForm.VehicleFormFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.Nullable()
    android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    }
}