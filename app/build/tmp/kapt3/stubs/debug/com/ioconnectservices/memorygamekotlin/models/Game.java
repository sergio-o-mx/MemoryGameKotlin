package com.ioconnectservices.memorygamekotlin.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\bH\u0002J\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/ioconnectservices/memorygamekotlin/models/Game;", "", "rows", "", "cols", "(II)V", "_gameEnded", "Landroidx/lifecycle/MutableLiveData;", "", "cards", "", "Lcom/ioconnectservices/memorygamekotlin/models/Card;", "getCards", "()[[Lcom/ioconnectservices/memorygamekotlin/models/Card;", "setCards", "([[Lcom/ioconnectservices/memorygamekotlin/models/Card;)V", "[[Lcom/ioconnectservices/memorygamekotlin/models/Card;", "gameEnded", "Landroidx/lifecycle/LiveData;", "getGameEnded", "()Landroidx/lifecycle/LiveData;", "totalCards", "areAllPairsFound", "doCardsMatch", "key1", "", "key2", "getTotalCards", "hasGameEnded", "app_debug"})
public final class Game {
    private int totalCards;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _gameEnded;
    @org.jetbrains.annotations.NotNull()
    private com.ioconnectservices.memorygamekotlin.models.Card[][] cards;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getGameEnded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ioconnectservices.memorygamekotlin.models.Card[][] getCards() {
        return null;
    }
    
    public final void setCards(@org.jetbrains.annotations.NotNull()
    com.ioconnectservices.memorygamekotlin.models.Card[][] p0) {
    }
    
    public final int getTotalCards() {
        return 0;
    }
    
    public final boolean doCardsMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String key1, @org.jetbrains.annotations.NotNull()
    java.lang.String key2) {
        return false;
    }
    
    public final boolean hasGameEnded() {
        return false;
    }
    
    private final boolean areAllPairsFound() {
        return false;
    }
    
    public Game(int rows, int cols) {
        super();
    }
}