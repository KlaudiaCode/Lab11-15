// Generated by view binder compiler. Do not edit!
package domanska.klaudia.lab_11_15.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import domanska.klaudia.lab_11_15.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VehicleRecyclerItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final TextView vehicleBrand;

  @NonNull
  public final TextView vehicleModel;

  @NonNull
  public final TextView vehiclePlate;

  private VehicleRecyclerItemBinding(@NonNull ConstraintLayout rootView, @NonNull View divider,
      @NonNull TextView vehicleBrand, @NonNull TextView vehicleModel,
      @NonNull TextView vehiclePlate) {
    this.rootView = rootView;
    this.divider = divider;
    this.vehicleBrand = vehicleBrand;
    this.vehicleModel = vehicleModel;
    this.vehiclePlate = vehiclePlate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static VehicleRecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VehicleRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vehicle_recycler_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VehicleRecyclerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.vehicle_brand;
      TextView vehicleBrand = ViewBindings.findChildViewById(rootView, id);
      if (vehicleBrand == null) {
        break missingId;
      }

      id = R.id.vehicle_model;
      TextView vehicleModel = ViewBindings.findChildViewById(rootView, id);
      if (vehicleModel == null) {
        break missingId;
      }

      id = R.id.vehicle_plate;
      TextView vehiclePlate = ViewBindings.findChildViewById(rootView, id);
      if (vehiclePlate == null) {
        break missingId;
      }

      return new VehicleRecyclerItemBinding((ConstraintLayout) rootView, divider, vehicleBrand,
          vehicleModel, vehiclePlate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
