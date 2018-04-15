package com.example.android.musicalstructureapp;

public class PlayItem {

    private String mPlayItemName;
    private String mPlayItemAuthor;

    public PlayItem(String playItemName, String playItemAuthor) {
        mPlayItemName = playItemName;
        mPlayItemAuthor = playItemAuthor;
    }

    public String getmPlayItemName() {
        return mPlayItemName;
    }

    public String getmPlayItemAuthor() {
        return mPlayItemAuthor;
    }
}
