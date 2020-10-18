package com.learnMVP.architect.module.todo;

import android.content.Context;
import android.content.SharedPreferences;

import com.learnMVP.architect.module.Constants;

public class TodoPresenter {
    private final ITodoContract.View viewTodo;
    private final SharedPreferences sharedPreferences;
    private final Context context;

    public TodoPresenter(ITodoContract.View viewTodo, SharedPreferences sharedPreferences, Context context) {
        this.viewTodo = viewTodo;
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(Constants.PREFERENCE_KEY, Context.MODE_PRIVATE);
    }




}
