package com.shivam.FreeHanddDrawing;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class DrawingActivity extends Activity{

	private RadioGroup rbGroup;
	private Spinner spinnerFgColor;
	private Spinner spinnerBgColor;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);
        rbGroup = (RadioGroup) findViewById(R.id.rbg_width);
        spinnerBgColor = (Spinner) findViewById(R.id.spineer_bg_color);
        spinnerFgColor = (Spinner) findViewById(R.id.spineer_fg_color);
        spinnerBgColor.setAdapter(new ColorChooserAdapter(this));
        spinnerFgColor.setAdapter(new ColorChooserAdapter(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_drawing, menu);
        return true;
    }
}
