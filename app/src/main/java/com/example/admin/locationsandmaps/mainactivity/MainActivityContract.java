package com.example.admin.locationsandmaps.mainactivity;

import com.example.admin.locationsandmaps.BasePresenter;
import com.example.admin.locationsandmaps.BaseView;

/**
 * Created by Admin on 10/24/2017.
 */

public interface MainActivityContract {
    interface View extends BaseView{
        public void updateLocation();
    }

    interface Presenter extends BasePresenter<View>{
        public void getLocation();
    }
}
