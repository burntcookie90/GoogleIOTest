package io.dwak.googleiotest.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import io.dwak.googleiotest.BR;

public class User extends BaseObservable{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
