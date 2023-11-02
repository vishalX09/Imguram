// Generated by view binder compiler. Do not edit!
package com.scaler.imguram.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scaler.imguram.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemStoryHeadBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView storyHeadImageView;

  @NonNull
  public final TextView storyHeadTextView;

  private ListItemStoryHeadBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView storyHeadImageView, @NonNull TextView storyHeadTextView) {
    this.rootView = rootView;
    this.storyHeadImageView = storyHeadImageView;
    this.storyHeadTextView = storyHeadTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemStoryHeadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemStoryHeadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_story_head, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemStoryHeadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.storyHeadImageView;
      ImageView storyHeadImageView = ViewBindings.findChildViewById(rootView, id);
      if (storyHeadImageView == null) {
        break missingId;
      }

      id = R.id.storyHeadTextView;
      TextView storyHeadTextView = ViewBindings.findChildViewById(rootView, id);
      if (storyHeadTextView == null) {
        break missingId;
      }

      return new ListItemStoryHeadBinding((LinearLayout) rootView, storyHeadImageView,
          storyHeadTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
