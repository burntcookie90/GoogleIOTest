package io.dwak.retrofittest.model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login") private String login;
    @SerializedName("id") private int id;
    @SerializedName("avatar_url") private String avatarUrl;
    @SerializedName("url") private String url;
    @SerializedName("repos_url") private String reposUrl;

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getUrl() {
        return url;
    }

    public String getReposUrl() {
        return reposUrl;
    }
}
