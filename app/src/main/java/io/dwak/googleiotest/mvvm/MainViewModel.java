package io.dwak.googleiotest.mvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import io.dwak.googleiotest.BR;

public class MainViewModel extends BaseObservable{
    private String firstName;
    private String lastName;
    private String textFromUser;

    public MainViewModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        textFromUser = "";
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getTextFromUser() {
        return textFromUser;
    }

    public void setTextFromUser(String textFromUser) {
        this.textFromUser = textFromUser;
        notifyPropertyChanged(BR.textFromUser);
    }
}
