// Generated by view binder compiler. Do not edit!
package com.scaler.imguram.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.scaler.imguram.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout container;

  @NonNull
  public final BottomNavigationView navView;

  @NonNull
  public final RecyclerView storiesRecyclerView;

  private ActivityMainBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout container,
      @NonNull BottomNavigationView navView, @NonNull RecyclerView storiesRecyclerView) {
    this.rootView = rootView;
    this.container = container;
    this.navView = navView;
    this.storiesRecyclerView = storiesRecyclerView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      FrameLayout container = (FrameLayout) rootView;

      id = R.id.nav_view;
      BottomNavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.storiesRecyclerView;
      RecyclerView storiesRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (storiesRecyclerView == null) {
        break missingId;
      }

      return new ActivityMainBinding((FrameLayout) rootView, container, navView,
          storiesRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
