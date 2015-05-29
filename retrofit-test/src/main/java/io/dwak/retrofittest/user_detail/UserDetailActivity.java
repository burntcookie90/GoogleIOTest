package io.dwak.retrofittest.user_detail;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import io.dwak.retrofittest.R;
import io.dwak.retrofittest.binding.UserDetailActivityBinding;

public class UserDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserDetailActivityBinding binder = DataBindingUtil.setContentView(this, R.layout.activity_user_detail);
    }
}
