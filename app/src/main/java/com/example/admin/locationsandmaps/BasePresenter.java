package com.example.admin.locationsandmaps;

/**
 * Created by Admin on 10/24/2017.
 */

public interface BasePresenter<V extends BaseView> {
    public void addView(V View);
    public void removeView();
}
