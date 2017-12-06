package com.example.administrator.mvp_example.Presenter;

/**
 * Created by Administrator on 2017-12-06.
 */

public interface MainPresenter {

    void setView(MainPresenter.View view);

    void onConfirm();

    public interface View {
        void setConfirmText(String text);
    }

}