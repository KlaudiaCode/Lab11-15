package domanska.klaudia.lab_11_15.ui.vehicleList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Ldomanska/klaudia/lab_11_15/ui/vehicleList/VehicleListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldomanska/klaudia/lab_11_15/ui/vehicleList/VehicleListAdapter$ViewHolder;", "()V", "data", "", "Ldomanska/klaudia/lab_11_15/data/entity/Vehicle;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "ViewHolder", "app_debug"})
public final class VehicleListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<domanska.klaudia.lab_11_15.ui.vehicleList.VehicleListAdapter.ViewHolder> {
    private java.util.List<domanska.klaudia.lab_11_15.data.entity.Vehicle> data;
    
    public VehicleListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public domanska.klaudia.lab_11_15.ui.vehicleList.VehicleListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    domanska.klaudia.lab_11_15.ui.vehicleList.VehicleListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<domanska.klaudia.lab_11_15.data.entity.Vehicle> data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ldomanska/klaudia/lab_11_15/ui/vehicleList/VehicleListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Ldomanska/klaudia/lab_11_15/databinding/VehicleRecyclerItemBinding;", "(Ldomanska/klaudia/lab_11_15/databinding/VehicleRecyclerItemBinding;)V", "getBinding", "()Ldomanska/klaudia/lab_11_15/databinding/VehicleRecyclerItemBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final domanska.klaudia.lab_11_15.databinding.VehicleRecyclerItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        domanska.klaudia.lab_11_15.databinding.VehicleRecyclerItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final domanska.klaudia.lab_11_15.databinding.VehicleRecyclerItemBinding getBinding() {
            return null;
        }
    }
}