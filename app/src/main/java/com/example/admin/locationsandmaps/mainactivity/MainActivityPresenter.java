package com.example.admin.locationsandmaps.mainactivity;

import com.example.admin.locationsandmaps.DatabaseHelper;

/**
 * Created by Admin on 10/24/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    MainActivityContract.View view;
    DatabaseHelper databaseHelper;

    public MainActivityPresenter(DatabaseHelper databaseHelper) {
        this.databaseHelper = databaseHelper;
    }

    @Override
    public void addView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void getLocation() {
        databaseHelper.saveData("current location");
        view.updateLocation();
    }
}
