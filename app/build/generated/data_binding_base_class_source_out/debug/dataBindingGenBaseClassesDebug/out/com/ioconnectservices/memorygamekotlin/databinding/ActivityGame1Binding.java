package com.ioconnectservices.memorygamekotlin.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityGame1Binding extends ViewDataBinding {
  @NonNull
  public final ImageView imageCard00;

  @NonNull
  public final ImageView imageCard01;

  @NonNull
  public final ImageView imageCard02;

  @NonNull
  public final ImageView imageCard03;

  @NonNull
  public final ImageView imageCard10;

  @NonNull
  public final ImageView imageCard11;

  @NonNull
  public final ImageView imageCard12;

  @NonNull
  public final ImageView imageCard13;

  @NonNull
  public final ImageView imageCard20;

  @NonNull
  public final ImageView imageCard21;

  @NonNull
  public final ImageView imageCard22;

  @NonNull
  public final ImageView imageCard23;

  @Bindable
  protected GameViewModel mGameViewModel;

  protected ActivityGame1Binding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageCard00, ImageView imageCard01, ImageView imageCard02, ImageView imageCard03,
      ImageView imageCard10, ImageView imageCard11, ImageView imageCard12, ImageView imageCard13,
      ImageView imageCard20, ImageView imageCard21, ImageView imageCard22, ImageView imageCard23) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageCard00 = imageCard00;
    this.imageCard01 = imageCard01;
    this.imageCard02 = imageCard02;
    this.imageCard03 = imageCard03;
    this.imageCard10 = imageCard10;
    this.imageCard11 = imageCard11;
    this.imageCard12 = imageCard12;
    this.imageCard13 = imageCard13;
    this.imageCard20 = imageCard20;
    this.imageCard21 = imageCard21;
    this.imageCard22 = imageCard22;
    this.imageCard23 = imageCard23;
  }

  public abstract void setGameViewModel(@Nullable GameViewModel gameViewModel);

  @Nullable
  public GameViewModel getGameViewModel() {
    return mGameViewModel;
  }

  @NonNull
  public static ActivityGame1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_game_1, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityGame1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityGame1Binding>inflateInternal(inflater, com.ioconnectservices.memorygamekotlin.R.layout.activity_game_1, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityGame1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_game_1, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityGame1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityGame1Binding>inflateInternal(inflater, com.ioconnectservices.memorygamekotlin.R.layout.activity_game_1, null, false, component);
  }

  public static ActivityGame1Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityGame1Binding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityGame1Binding)bind(component, view, com.ioconnectservices.memorygamekotlin.R.layout.activity_game_1);
  }
}
