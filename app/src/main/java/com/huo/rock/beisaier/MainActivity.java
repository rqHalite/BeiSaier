package com.huo.rock.beisaier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.huo.rock.beisaier.view.PointLoadingView;

public class MainActivity extends AppCompatActivity {

    private PointLoadingView loadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadingView = (PointLoadingView) findViewById(R.id.pointview);
        loadingView.post(new Runnable() {
            @Override
            public void run() {
                loadingView.Startdown();
            }
        });
    }
}
