package com.inz.qubuss.camera2test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.inz.qubuss.camera2test.video.Camera2VideoFragment;
import com.inz.qubuss.camera2test.video.CameraActivity;

public class StartingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
    }

    public void goToPhoto(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        onStop();
    }

    public void goToVideo(View view) {
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
        onStop();
    }
}
