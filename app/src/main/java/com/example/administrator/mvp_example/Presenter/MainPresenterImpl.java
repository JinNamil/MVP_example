package com.example.administrator.mvp_example.Presenter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.mvp_example.Model.MainModel;

/**
 * Created by Administrator on 2017-12-06.
 */

public class MainPresenterImpl extends AppCompatActivity implements MainPresenter {

    private Activity activity;
    private MainPresenter.View view;
    private MainModel mainModel;

    public MainPresenterImpl(Activity activity) {
        this.activity = activity;
        this.mainModel = new MainModel();
    }

    @Override
    public void setView(MainPresenter.View view) {
        this.view = view;
    }

    @Override
    public void onConfirm() {
        if (view != null) {
            view.setConfirmText(mainModel.getClickedText());
        }
    }

}