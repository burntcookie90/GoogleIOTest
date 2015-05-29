package io.dwak.googleiotest.main;

import io.dwak.googleiotest.model.User;
import io.dwak.googleiotest.presenter.MainPresenter;
import io.dwak.googleiotest.view.MainView;
import io.dwak.mvp_java.AbstractPresenter;

public class MainPresenterImpl extends AbstractPresenter<MainView> implements MainPresenter {

    private User mUser;

    @Override
    public void getUser() {
        mUser = new User("vishnu");
        getView().displayUser(mUser);
    }

    @Override
    public void updateUser(String name) {
        mUser.setName(name);
    }
}
