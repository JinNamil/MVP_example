package com.example.administrator.mvp_example.View;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.example.administrator.mvp_example.Presenter.MainPresenter;
import com.example.administrator.mvp_example.Presenter.MainPresenterImpl;
import com.example.administrator.mvp_example.R;

public class MainActivity extends Activity implements MainPresenter.View {

    private MainPresenter mainPresenter;
    private Button confirmButton;

    @Override
    public void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenterImpl(MainActivity.this);
        mainPresenter.setView(this);


        confirmButton = (Button) findViewById(R.id.btn_confirm);
        confirmButton.setOnClickListener(view -> {

            mainPresenter.onConfirm();

        });
    }

    @Override
    public void setConfirmText(String text) {
        confirmButton.setText(text);
    }
}
