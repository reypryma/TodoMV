package com.learnMVP.architect.module.todo;

import com.learnMVP.architect.base.BaseFragment;
import com.learnMVP.architect.base.BaseFragmentHolderActivity;
import com.learnMVP.architect.module.profile.IProfileContract;
import com.learnMVP.architect.module.profile.ProfileActivity;

public class TodoActivity  extends BaseFragmentHolderActivity {
    private TodoFragment todoFragment;

    @Override
    protected void initializeFragment() {
        initializeView();
    }
}
