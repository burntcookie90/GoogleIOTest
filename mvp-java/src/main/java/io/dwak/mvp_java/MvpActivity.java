package io.dwak.mvp_java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class MvpActivity<T extends AbstractPresenter> extends AppCompatActivity {
    private T presenter;


    protected abstract Class<T> getPresenterClass();
    protected abstract void setView();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
