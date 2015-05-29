package io.dwak.googleiotest.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import io.dwak.googleiotest.R;
import io.dwak.googleiotest.databinding.MainActivityBinding;
import io.dwak.googleiotest.model.User;
import io.dwak.googleiotest.view.MainView;
import io.dwak.mvp_java.MvpActivity;

public class MainActivity extends MvpActivity<MainPresenterImpl> implements MainView {

    private MainActivityBinding mBinding;
    private int counter = 0;

    @Override
    protected Class<MainPresenterImpl> getPresenterClass() {
        return MainPresenterImpl.class;
    }

    @Override
    protected void setView() {
        getPresenter().setView(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        getPresenter().createUser();

        mBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().updateUser("dohohdw" + counter++);
            }
        });
    }

    @Override
    public void displayUser(User user) {
        mBinding.setUser(user);
    }
}
