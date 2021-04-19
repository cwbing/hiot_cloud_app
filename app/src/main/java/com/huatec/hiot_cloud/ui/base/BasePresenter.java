package com.huatec.hiot_cloud.ui.base;

/**
 * MVP架构主持者层基类
 */
public class BasePresenter<V extends Baseview> {
    private  V view;

    public BasePresenter() {
    }

    public void setView(V view){
        this.view = view;
    }

    public V getView(){
        return view;
    }

    public void destory(){
        if (view != null){
            view = null;
        }
    }

    public boolean viewAttached(){
        return view != null;
    }
}
