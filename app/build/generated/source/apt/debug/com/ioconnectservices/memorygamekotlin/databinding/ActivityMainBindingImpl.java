package com.ioconnectservices.memorygamekotlin.databinding;
import com.ioconnectservices.memorygamekotlin.R;
import com.ioconnectservices.memorygamekotlin.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text_select_game, 4);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textType1.setTag(null);
        this.textType2.setTag(null);
        this.textType3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainViewModel == variableId) {
            setMainViewModel((com.ioconnectservices.memorygamekotlin.viewmodels.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainViewModel(@Nullable com.ioconnectservices.memorygamekotlin.viewmodels.MainViewModel MainViewModel) {
        this.mMainViewModel = MainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mainViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.ioconnectservices.memorygamekotlin.viewmodels.MainViewModel mainViewModel = mMainViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.textType1.setOnClickListener(mCallback1);
            this.textType2.setOnClickListener(mCallback2);
            this.textType3.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // mainViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onGameTypeSelected(2);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // mainViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onGameTypeSelected(0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // mainViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onGameTypeSelected(1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}