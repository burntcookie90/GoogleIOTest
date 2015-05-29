package io.dwak.retrofittest.network;

import java.util.List;

import io.dwak.retrofittest.model.User;
import retrofit.http.GET;
import rx.Observable;

public interface GithubService {
    @GET("/users")
    Observable<List<User>> getUsers();
}
