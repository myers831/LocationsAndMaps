package com.example.admin.locationsandmaps.mainactivity.di;

import com.example.admin.locationsandmaps.DatabaseHelper;
import com.example.admin.locationsandmaps.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/24/2017.
 */

@Module
public class MainActivityModule {

    DatabaseHelper databaseHelper;

    public MainActivityModule(DatabaseHelper databaseHelper) {
        this.databaseHelper = databaseHelper;
    }

    @Provides
    MainActivityPresenter providesMainActivityPresenter(){
        return new MainActivityPresenter(databaseHelper);
    }
}
