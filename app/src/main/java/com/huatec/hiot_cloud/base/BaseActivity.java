package com.huatec.hiot_cloud.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * MVP架构的Activity实现类
 */
public abstract class BaseActivity<V extends Baseview, P extends BasePresenter> extends AppCompatActivity implements Baseview {
    private P presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.setView(this);
    }

    public abstract  P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destory();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
