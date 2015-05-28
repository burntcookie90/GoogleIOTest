package io.dwak.googleiotest.main;

import io.dwak.googleiotest.model.User;
import io.dwak.googleiotest.presenter.MainPresenter;
import io.dwak.googleiotest.view.MainView;
import io.dwak.mvp_java.AbstractPresenter;

public class MainPresenterImpl extends AbstractPresenter<MainView> implements MainPresenter {
    @Override
    public void getUser() {
        getView().displayUser(new User("vishnu"));
    }
}
