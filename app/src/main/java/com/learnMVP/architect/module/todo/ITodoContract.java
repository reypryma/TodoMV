package com.learnMVP.architect.module.todo;

import com.learnMVP.architect.base.BasePresenter;
import com.learnMVP.architect.base.BaseView;
import com.learnMVP.architect.module.profile.IProfileContract;

public interface ITodoContract {

    interface View extends BaseView<IProfileContract.Presenter> {
        void goBackToTodo();
        void updateTodo(String userName, String email);
    }

    interface Presenter extends BasePresenter {
        void getProfile();
    }

    void create(String title, String description, boolean completed);

    void delete();

}
