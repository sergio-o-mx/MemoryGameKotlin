package com.ioconnectservices.memorygamekotlin;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.ioconnectservices.memorygamekotlin.databinding.ActivityGame1BindingImpl;
import com.ioconnectservices.memorygamekotlin.databinding.ActivityGame2BindingImpl;
import com.ioconnectservices.memorygamekotlin.databinding.ActivityGame3BindingImpl;
import com.ioconnectservices.memorygamekotlin.databinding.ActivityMainBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYGAME1 = 1;

  private static final int LAYOUT_ACTIVITYGAME2 = 2;

  private static final int LAYOUT_ACTIVITYGAME3 = 3;

  private static final int LAYOUT_ACTIVITYMAIN = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ioconnectservices.memorygamekotlin.R.layout.activity_game_1, LAYOUT_ACTIVITYGAME1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ioconnectservices.memorygamekotlin.R.layout.activity_game_2, LAYOUT_ACTIVITYGAME2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ioconnectservices.memorygamekotlin.R.layout.activity_game_3, LAYOUT_ACTIVITYGAME3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ioconnectservices.memorygamekotlin.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYGAME1: {
          if ("layout/activity_game_1_0".equals(tag)) {
            return new ActivityGame1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_game_1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYGAME2: {
          if ("layout/activity_game_2_0".equals(tag)) {
            return new ActivityGame2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_game_2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYGAME3: {
          if ("layout/activity_game_3_0".equals(tag)) {
            return new ActivityGame3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_game_3 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "gameViewModel");
      sKeys.put(2, "mainViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_game_1_0", com.ioconnectservices.memorygamekotlin.R.layout.activity_game_1);
      sKeys.put("layout/activity_game_2_0", com.ioconnectservices.memorygamekotlin.R.layout.activity_game_2);
      sKeys.put("layout/activity_game_3_0", com.ioconnectservices.memorygamekotlin.R.layout.activity_game_3);
      sKeys.put("layout/activity_main_0", com.ioconnectservices.memorygamekotlin.R.layout.activity_main);
    }
  }
}
