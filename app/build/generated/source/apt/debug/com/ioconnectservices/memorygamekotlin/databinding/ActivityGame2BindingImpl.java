package com.ioconnectservices.memorygamekotlin.databinding;
import com.ioconnectservices.memorygamekotlin.R;
import com.ioconnectservices.memorygamekotlin.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityGame2BindingImpl extends ActivityGame2Binding implements com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityGame2BindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityGame2BindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            );
        this.imageCard00.setTag(null);
        this.imageCard01.setTag(null);
        this.imageCard02.setTag(null);
        this.imageCard03.setTag(null);
        this.imageCard10.setTag(null);
        this.imageCard11.setTag(null);
        this.imageCard12.setTag(null);
        this.imageCard13.setTag(null);
        this.imageCard20.setTag(null);
        this.imageCard21.setTag(null);
        this.imageCard22.setTag(null);
        this.imageCard23.setTag(null);
        this.imageCard30.setTag(null);
        this.imageCard31.setTag(null);
        this.imageCard32.setTag(null);
        this.imageCard33.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 4);
        mCallback47 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 12);
        mCallback43 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 8);
        mCallback42 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 7);
        mCallback50 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 15);
        mCallback36 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 1);
        mCallback48 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 13);
        mCallback44 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 9);
        mCallback51 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 16);
        mCallback49 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 14);
        mCallback37 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 2);
        mCallback45 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 10);
        mCallback40 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 5);
        mCallback38 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 3);
        mCallback46 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 11);
        mCallback41 = new com.ioconnectservices.memorygamekotlin.generated.callback.OnClickListener(this, 6);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.gameViewModel == variableId) {
            setGameViewModel((com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameViewModel(@Nullable com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel GameViewModel) {
        this.mGameViewModel = GameViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.gameViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGameViewModelCards((android.databinding.ObservableArrayMap<java.lang.String,java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGameViewModelCards(android.databinding.ObservableArrayMap<java.lang.String,java.lang.Integer> GameViewModelCards, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.Integer gameViewModelCards31 = null;
        java.lang.Integer gameViewModelCards22 = null;
        java.lang.Integer gameViewModelCards13 = null;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards23 = 0;
        java.lang.Integer gameViewModelCards30 = null;
        com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards03 = 0;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards01 = 0;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards02 = 0;
        java.lang.Integer gameViewModelCards21 = null;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards00 = 0;
        android.databinding.ObservableArrayMap<java.lang.String,java.lang.Integer> gameViewModelCards = null;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards11 = 0;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards20 = 0;
        java.lang.Integer gameViewModelCards03 = null;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards22 = 0;
        java.lang.Integer gameViewModelCards33 = null;
        java.lang.Integer gameViewModelCards20 = null;
        java.lang.Integer gameViewModelCards32 = null;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards31 = 0;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards33 = 0;
        java.lang.Integer gameViewModelCards02 = null;
        java.lang.Integer gameViewModelCards01 = null;
        java.lang.Integer gameViewModelCards00 = null;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards12 = 0;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards13 = 0;
        java.lang.Integer gameViewModelCards12 = null;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards10 = 0;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards21 = 0;
        java.lang.Integer gameViewModelCards11 = null;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards30 = 0;
        int androidDatabindingViewDataBindingSafeUnboxGameViewModelCards32 = 0;
        java.lang.Integer gameViewModelCards10 = null;
        java.lang.Integer gameViewModelCards23 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (gameViewModel != null) {
                    // read gameViewModel.cards
                    gameViewModelCards = gameViewModel.getCards();
                }
                updateRegistration(0, gameViewModelCards);


                if (gameViewModelCards != null) {
                    // read gameViewModel.cards["31"]
                    gameViewModelCards31 = gameViewModelCards.get("31");
                    // read gameViewModel.cards["22"]
                    gameViewModelCards22 = gameViewModelCards.get("22");
                    // read gameViewModel.cards["13"]
                    gameViewModelCards13 = gameViewModelCards.get("13");
                    // read gameViewModel.cards["30"]
                    gameViewModelCards30 = gameViewModelCards.get("30");
                    // read gameViewModel.cards["21"]
                    gameViewModelCards21 = gameViewModelCards.get("21");
                    // read gameViewModel.cards["03"]
                    gameViewModelCards03 = gameViewModelCards.get("03");
                    // read gameViewModel.cards["33"]
                    gameViewModelCards33 = gameViewModelCards.get("33");
                    // read gameViewModel.cards["20"]
                    gameViewModelCards20 = gameViewModelCards.get("20");
                    // read gameViewModel.cards["32"]
                    gameViewModelCards32 = gameViewModelCards.get("32");
                    // read gameViewModel.cards["02"]
                    gameViewModelCards02 = gameViewModelCards.get("02");
                    // read gameViewModel.cards["01"]
                    gameViewModelCards01 = gameViewModelCards.get("01");
                    // read gameViewModel.cards["00"]
                    gameViewModelCards00 = gameViewModelCards.get("00");
                    // read gameViewModel.cards["12"]
                    gameViewModelCards12 = gameViewModelCards.get("12");
                    // read gameViewModel.cards["11"]
                    gameViewModelCards11 = gameViewModelCards.get("11");
                    // read gameViewModel.cards["10"]
                    gameViewModelCards10 = gameViewModelCards.get("10");
                    // read gameViewModel.cards["23"]
                    gameViewModelCards23 = gameViewModelCards.get("23");
                }


                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["31"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards31 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards31);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["22"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards22 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards22);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["13"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards13 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards13);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["30"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards30 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards30);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["21"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards21 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards21);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["03"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards03 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards03);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["33"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards33 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards33);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["20"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards20 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards20);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["32"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards32 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards32);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["02"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards02 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards02);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["01"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards01 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards01);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["00"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards00 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards00);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["12"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards12 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards12);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["11"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards11 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards11);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["10"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards10 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards10);
                // read android.databinding.ViewDataBinding.safeUnbox(gameViewModel.cards["23"])
                androidDatabindingViewDataBindingSafeUnboxGameViewModelCards23 = android.databinding.ViewDataBinding.safeUnbox(gameViewModelCards23);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.imageCard00.setOnClickListener(mCallback36);
            this.imageCard01.setOnClickListener(mCallback37);
            this.imageCard02.setOnClickListener(mCallback38);
            this.imageCard03.setOnClickListener(mCallback39);
            this.imageCard10.setOnClickListener(mCallback40);
            this.imageCard11.setOnClickListener(mCallback41);
            this.imageCard12.setOnClickListener(mCallback42);
            this.imageCard13.setOnClickListener(mCallback43);
            this.imageCard20.setOnClickListener(mCallback44);
            this.imageCard21.setOnClickListener(mCallback45);
            this.imageCard22.setOnClickListener(mCallback46);
            this.imageCard23.setOnClickListener(mCallback47);
            this.imageCard30.setOnClickListener(mCallback48);
            this.imageCard31.setOnClickListener(mCallback49);
            this.imageCard32.setOnClickListener(mCallback50);
            this.imageCard33.setOnClickListener(mCallback51);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.imageCard00.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards00);
            this.imageCard01.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards01);
            this.imageCard02.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards02);
            this.imageCard03.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards03);
            this.imageCard10.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards10);
            this.imageCard11.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards11);
            this.imageCard12.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards12);
            this.imageCard13.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards13);
            this.imageCard20.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards20);
            this.imageCard21.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards21);
            this.imageCard22.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards22);
            this.imageCard23.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards23);
            this.imageCard30.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards30);
            this.imageCard31.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards31);
            this.imageCard32.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards32);
            this.imageCard33.setImageResource(androidDatabindingViewDataBindingSafeUnboxGameViewModelCards33);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(0, 3);
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(2, 3);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(1, 3);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(1, 2);
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(3, 2);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(0, 0);
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(3, 0);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(2, 0);
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(3, 3);
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(3, 1);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(0, 1);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(2, 1);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(1, 0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(0, 2);
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(2, 2);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // gameViewModel
                com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCardAt(1, 1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameViewModel.cards
        flag 1 (0x2L): gameViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}