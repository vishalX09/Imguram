// Generated by view binder compiler. Do not edit!
package com.scaler.imguram.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scaler.imguram.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFeedBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final RecyclerView feedRecyclerView;

  @NonNull
  public final TextView feedTypeTextView;

  private FragmentFeedBinding(@NonNull FrameLayout rootView, @NonNull RecyclerView feedRecyclerView,
      @NonNull TextView feedTypeTextView) {
    this.rootView = rootView;
    this.feedRecyclerView = feedRecyclerView;
    this.feedTypeTextView = feedTypeTextView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFeedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_feed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFeedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.feedRecyclerView;
      RecyclerView feedRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (feedRecyclerView == null) {
        break missingId;
      }

      id = R.id.feedTypeTextView;
      TextView feedTypeTextView = ViewBindings.findChildViewById(rootView, id);
      if (feedTypeTextView == null) {
        break missingId;
      }

      return new FragmentFeedBinding((FrameLayout) rootView, feedRecyclerView, feedTypeTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
