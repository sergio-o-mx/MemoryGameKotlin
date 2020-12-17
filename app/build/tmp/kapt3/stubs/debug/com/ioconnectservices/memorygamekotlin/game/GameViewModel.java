package com.ioconnectservices.memorygamekotlin.game;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bJ\b\u0010\u001b\u001a\u00020\u0013H\u0002R\u001c\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/ioconnectservices/memorygamekotlin/game/GameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "cards", "error/NonExistentClass", "getCards", "()Lerror/NonExistentClass;", "setCards", "(Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "cols", "", "firstKey", "", "game", "Lcom/ioconnectservices/memorygamekotlin/models/Game;", "rows", "secondKey", "checkIfCardsMatch", "", "hasGameEnded", "Landroidx/lifecycle/LiveData;", "", "init", "onClickedCardAt", "col", "row", "randomizeCards", "app_debug"})
public final class GameViewModel extends androidx.lifecycle.ViewModel {
    private com.ioconnectservices.memorygamekotlin.models.Game game;
    private int cols = 0;
    private int rows = 0;
    private java.lang.String firstKey = "";
    private java.lang.String secondKey = "";
    public error.NonExistentClass cards;
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getCards() {
        return null;
    }
    
    public final void setCards(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass p0) {
    }
    
    public final void init(int cols, int rows) {
    }
    
    private final void randomizeCards() {
    }
    
    public final void onClickedCardAt(int col, int row) {
    }
    
    private final void checkIfCardsMatch() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> hasGameEnded() {
        return null;
    }
    
    public GameViewModel() {
        super();
    }
}