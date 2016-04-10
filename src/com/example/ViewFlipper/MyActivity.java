package com.example.ViewFlipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ViewFlipper;

public class MyActivity extends Activity {
    private ViewFlipper viewFlipper;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        viewFlipper=(ViewFlipper)findViewById(R.id.details);
    }
    public void prev(View source)
    {
        viewFlipper.setInAnimation(this,R.anim.slide_in_right);
        viewFlipper.setInAnimation(this,R.anim.slide_out_left);
        viewFlipper.showPrevious();
        viewFlipper.stopFlipping();
    }
    public void next(View source)
    {
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
        viewFlipper.showNext();
        viewFlipper.stopFlipping();
    }

    public void auto(View source)
    {
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
        viewFlipper.startFlipping();

    }
}
