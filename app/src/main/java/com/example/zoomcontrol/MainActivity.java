package com.example.zoomcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

import java.time.ZonedDateTime;

public class MainActivity extends AppCompatActivity {

    private ImageView image1;
    private ZoomControls zoomControls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=(ImageView)findViewById(R.id.image1);
        zoomControls=(ZoomControls)findViewById(R.id.zoomcontrol);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Zoom in",Toast.LENGTH_SHORT).show();
                float x=image1.getScaleX();
                float y=image1.getScaleY();

                image1.setScaleX((float)x+1);
                image1.setScaleY((float)y+1);
            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Zoom Out",Toast.LENGTH_SHORT).show();
                float x=image1.getScaleX();
                float y=image1.getScaleY();
                if(x>1&&y>1)
                {
                    image1.setScaleX((float)x-1);
                    image1.setScaleY((float)y-1);
                }
            }
        });
    }
}