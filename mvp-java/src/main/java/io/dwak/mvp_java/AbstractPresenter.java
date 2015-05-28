package io.dwak.mvp_java;

public class AbstractPresenter<T> {
    private T view;

    public T getView(){
        return view;
    }

    public void setView(T view) {
        this.view = view;
    }
}
