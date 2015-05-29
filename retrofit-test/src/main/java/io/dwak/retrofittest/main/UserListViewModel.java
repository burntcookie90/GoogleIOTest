package io.dwak.retrofittest.main;

import java.util.List;

import io.dwak.retrofittest.model.User;
import io.dwak.retrofittest.network.GithubService;
import retrofit.RestAdapter;
import rx.Observable;

public class UserListViewModel {

    private final GithubService mGithubService;

    public UserListViewModel() {
        mGithubService = new RestAdapter.Builder()
                .setEndpoint("https://api.github.com")
                .build()
                .create(GithubService.class);
    }

    public Observable<List<User>> getUsers(){
        return mGithubService.getUsers();
    }

}
