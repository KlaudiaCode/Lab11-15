package domanska.klaudia.lab_11_15.ui.vehicleDetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020 2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Ldomanska/klaudia/lab_11_15/ui/vehicleDetails/VehicleDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Ldomanska/klaudia/lab_11_15/databinding/FragmentVehicleDetailsBinding;", "adapter", "Ldomanska/klaudia/lab_11_15/ui/vehicleDetails/VehicleDetailsAdapter;", "binding", "getBinding", "()Ldomanska/klaudia/lab_11_15/databinding/FragmentVehicleDetailsBinding;", "navArgs", "Ldomanska/klaudia/lab_11_15/ui/vehicleDetails/VehicleDetailsFragmentArgs;", "getNavArgs", "()Ldomanska/klaudia/lab_11_15/ui/vehicleDetails/VehicleDetailsFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "vehicle", "Ldomanska/klaudia/lab_11_15/data/entity/Vehicle;", "viewModel", "Ldomanska/klaudia/lab_11_15/ui/vehicleDetails/VehicleDetailsViewModel;", "viewModelFactory", "Ldomanska/klaudia/lab_11_15/ui/vehicleDetails/VehicleDetailsViewModelFactory;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "app_debug"})
public final class VehicleDetailsFragment extends androidx.fragment.app.Fragment {
    private domanska.klaudia.lab_11_15.databinding.FragmentVehicleDetailsBinding _binding;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private final domanska.klaudia.lab_11_15.ui.vehicleDetails.VehicleDetailsAdapter adapter = null;
    private domanska.klaudia.lab_11_15.data.entity.Vehicle vehicle;
    private domanska.klaudia.lab_11_15.ui.vehicleDetails.VehicleDetailsViewModel viewModel;
    private domanska.klaudia.lab_11_15.ui.vehicleDetails.VehicleDetailsViewModelFactory viewModelFactory;
    
    public VehicleDetailsFragment() {
        super();
    }
    
    private final domanska.klaudia.lab_11_15.databinding.FragmentVehicleDetailsBinding getBinding() {
        return null;
    }
    
    private final domanska.klaudia.lab_11_15.ui.vehicleDetails.VehicleDetailsFragmentArgs getNavArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}