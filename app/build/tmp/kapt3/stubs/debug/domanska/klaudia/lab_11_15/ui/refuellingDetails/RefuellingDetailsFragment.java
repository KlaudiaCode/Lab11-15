package domanska.klaudia.lab_11_15.ui.refuellingDetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Ldomanska/klaudia/lab_11_15/ui/refuellingDetails/RefuellingDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Ldomanska/klaudia/lab_11_15/databinding/FragmentRefuellingDetailsBinding;", "binding", "getBinding", "()Ldomanska/klaudia/lab_11_15/databinding/FragmentRefuellingDetailsBinding;", "navArgs", "Ldomanska/klaudia/lab_11_15/ui/refuellingDetails/RefuellingDetailsFragmentArgs;", "getNavArgs", "()Ldomanska/klaudia/lab_11_15/ui/refuellingDetails/RefuellingDetailsFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "refuelling", "Ldomanska/klaudia/lab_11_15/data/entity/Refueling;", "viewModel", "Ldomanska/klaudia/lab_11_15/ui/refuellingDetails/RefuellingDetailsViewModel;", "viewModelFactory", "Ldomanska/klaudia/lab_11_15/ui/refuellingDetails/RefuellingDetailsViewModelFactory;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "app_debug"})
public final class RefuellingDetailsFragment extends androidx.fragment.app.Fragment {
    private domanska.klaudia.lab_11_15.databinding.FragmentRefuellingDetailsBinding _binding;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private domanska.klaudia.lab_11_15.ui.refuellingDetails.RefuellingDetailsViewModel viewModel;
    private domanska.klaudia.lab_11_15.ui.refuellingDetails.RefuellingDetailsViewModelFactory viewModelFactory;
    private domanska.klaudia.lab_11_15.data.entity.Refueling refuelling;
    
    public RefuellingDetailsFragment() {
        super();
    }
    
    private final domanska.klaudia.lab_11_15.databinding.FragmentRefuellingDetailsBinding getBinding() {
        return null;
    }
    
    private final domanska.klaudia.lab_11_15.ui.refuellingDetails.RefuellingDetailsFragmentArgs getNavArgs() {
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