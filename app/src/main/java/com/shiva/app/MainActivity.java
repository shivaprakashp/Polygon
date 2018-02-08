package com.shiva.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((ImageView) findViewById(R.id.triangle))
                .setBackgroundDrawable(new PolygonalDrwable(Color.GREEN, 3));

        ((ImageView) findViewById(R.id.square))
                .setBackgroundDrawable(new PolygonalDrwable(Color.MAGENTA, 4));

        ((ImageView) findViewById(R.id.pentagon))
                .setBackgroundDrawable(new PolygonalDrwable(Color.LTGRAY, 5));

        ((ImageView) findViewById(R.id.hex))
                .setBackgroundDrawable(new PolygonalDrwable(Color.RED, 6));

        ((ImageView) findViewById(R.id.hept))
                .setBackgroundDrawable(new PolygonalDrwable(Color.MAGENTA, 7));

        ((ImageView) findViewById(R.id.oct))
                .setBackgroundDrawable(new PolygonalDrwable(Color.YELLOW, 8));
    }

}
