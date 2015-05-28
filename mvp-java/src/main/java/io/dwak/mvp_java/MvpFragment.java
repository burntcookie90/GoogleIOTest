package io.dwak.mvp_java;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public abstract class MvpFragment<T extends AbstractPresenter> extends Fragment {
    private T presenter;

    protected abstract Class<T> getPresenterClass();
    protected abstract void setView();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView();
    }

    protected T getPresenter(){
        if(presenter == null){
            try {
                presenter = getPresenterClass().newInstance();
            } catch (java.lang.InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return presenter;
    }
}
