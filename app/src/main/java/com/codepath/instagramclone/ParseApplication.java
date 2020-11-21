package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("NE0AGKQy4e8fC55Ut5hsEZXrcy9grnhTOGBiw6Zh")
                .clientKey("DSda0loNrdNcreRxgeG1It4C0p7dIQCgKwkb3ScC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
