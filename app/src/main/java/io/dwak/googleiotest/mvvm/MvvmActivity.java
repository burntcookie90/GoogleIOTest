package io.dwak.googleiotest.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

import io.dwak.googleiotest.R;
import io.dwak.googleiotest.databinding.ActivityMvvmBinding;

public class MvvmActivity extends AppCompatActivity {

    private ActivityMvvmBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final MainViewModel viewModel = new MainViewModel("vishnu", "rajeevan");
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        mBinding.setViewmodel(viewModel);

        mBinding.textInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                viewModel.setTextFromUser(s.toString());
            }
        });
    }
}
