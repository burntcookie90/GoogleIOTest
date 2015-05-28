package io.dwak.googleiotest.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import io.dwak.googleiotest.R;
import io.dwak.googleiotest.databinding.ActivityMainBinding;
import io.dwak.googleiotest.model.User;
import io.dwak.googleiotest.view.MainView;
import io.dwak.mvp_java.MvpActivity;

public class MainActivity extends MvpActivity<MainPresenterImpl> implements MainView {

    private ActivityMainBinding mBinding;

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
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        getPresenter().getUser();
    }

    @Override
    public void displayUser(User user) {
        mBinding.setUser(user);
    }

    public void onButtonClick(){
        Toast.makeText(this, "oewfawohf", Toast.LENGTH_SHORT).show();
    }
}
