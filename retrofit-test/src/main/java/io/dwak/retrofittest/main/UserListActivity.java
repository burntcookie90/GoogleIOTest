package io.dwak.retrofittest.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import java.util.List;

import io.dwak.retrofittest.R;
import io.dwak.retrofittest.binding.UserListActivityBinding;
import io.dwak.retrofittest.model.User;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class UserListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UserListActivityBinding binder = DataBindingUtil.setContentView(this, R.layout.activity_user_list);

        UserListViewModel viewModel = new UserListViewModel();

        binder.recycler.setLayoutManager(new LinearLayoutManager(this));

        final UserRecyclerAdapter adapter = new UserRecyclerAdapter(this);
        adapter.setOnItemClickListener(new UserRecyclerAdapter.MainAdapterListener() {
            @Override
            public void onClick(User user) {
            }
        });
        binder.recycler.setAdapter(adapter);

        viewModel.getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<User>>() {
                    @Override
                    public void call(List<User> users) {
                        adapter.setUsers(users);
                    }
                });
    }
}
