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

public final class VehicleDetailsTopBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView brand;

  @NonNull
  public final TextView brandTextView;

  @NonNull
  public final View divider3;

  @NonNull
  public final TextView model;

  @NonNull
  public final TextView modelTextView;

  @NonNull
  public final TextView plateNumber;

  @NonNull
  public final TextView plateNumberTextView;

  @NonNull
  public final TextView refuellingListTextView;

  private VehicleDetailsTopBinding(@NonNull ConstraintLayout rootView, @NonNull TextView brand,
      @NonNull TextView brandTextView, @NonNull View divider3, @NonNull TextView model,
      @NonNull TextView modelTextView, @NonNull TextView plateNumber,
      @NonNull TextView plateNumberTextView, @NonNull TextView refuellingListTextView) {
    this.rootView = rootView;
    this.brand = brand;
    this.brandTextView = brandTextView;
    this.divider3 = divider3;
    this.model = model;
    this.modelTextView = modelTextView;
    this.plateNumber = plateNumber;
    this.plateNumberTextView = plateNumberTextView;
    this.refuellingListTextView = refuellingListTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static VehicleDetailsTopBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VehicleDetailsTopBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vehicle_details_top, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VehicleDetailsTopBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.brand;
      TextView brand = ViewBindings.findChildViewById(rootView, id);
      if (brand == null) {
        break missingId;
      }

      id = R.id.brand_text_view;
      TextView brandTextView = ViewBindings.findChildViewById(rootView, id);
      if (brandTextView == null) {
        break missingId;
      }

      id = R.id.divider3;
      View divider3 = ViewBindings.findChildViewById(rootView, id);
      if (divider3 == null) {
        break missingId;
      }

      id = R.id.model;
      TextView model = ViewBindings.findChildViewById(rootView, id);
      if (model == null) {
        break missingId;
      }

      id = R.id.model_text_view;
      TextView modelTextView = ViewBindings.findChildViewById(rootView, id);
      if (modelTextView == null) {
        break missingId;
      }

      id = R.id.plate_number;
      TextView plateNumber = ViewBindings.findChildViewById(rootView, id);
      if (plateNumber == null) {
        break missingId;
      }

      id = R.id.plate_number_text_view;
      TextView plateNumberTextView = ViewBindings.findChildViewById(rootView, id);
      if (plateNumberTextView == null) {
        break missingId;
      }

      id = R.id.refuelling_list_text_view;
      TextView refuellingListTextView = ViewBindings.findChildViewById(rootView, id);
      if (refuellingListTextView == null) {
        break missingId;
      }

      return new VehicleDetailsTopBinding((ConstraintLayout) rootView, brand, brandTextView,
          divider3, model, modelTextView, plateNumber, plateNumberTextView, refuellingListTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}