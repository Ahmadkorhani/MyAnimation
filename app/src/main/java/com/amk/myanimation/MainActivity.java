package com.amk.myanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Animation";
    TextView myLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLabel = (TextView)findViewById(R.id.lblAnim);
    }

    public void animateme(View v){
        Log.w(TAG, "clicked me");
        YoYo.with(Techniques.DropOut).duration(700).playOn(myLabel);
    }

    /*
    Effects

    Attension
        Flash, Pulse, RubberBand, Shake, Swing, Wobble, Bounce, Tada, StandUp, Wave

    Special
        Hinge, RollIn, RollOut,Landing,TakingOff,DropOut

    Bounce
        BounceIn, BounceInDown, BounceInLeft, BounceInRight, BounceInUp

    Fade
        FadeIn, FadeInUp, FadeInDown, FadeInLeft, FadeInRight
        FadeOut, FadeOutDown, FadeOutLeft, FadeOutRight, FadeOutUp

    Flip
        FlipInX, FlipOutX, FlipOutY

    Rotate
        RotateIn, RotateInDownLeft, RotateInDownRight, RotateInUpLeft, RotateInUpRight
    RotateOut, RotateOutDownLeft, RotateOutDownRight, RotateOutUpLeft, RotateOutUpRight

    Slide
        SlideInLeft, SlideInRight, SlideInUp, SlideInDown
        SlideOutLeft, SlideOutRight, SlideOutUp, SlideOutDown

    Zoom
        ZoomIn, ZoomInDown, ZoomInLeft, ZoomInRight, ZoomInUp
        ZoomOut, ZoomOutDown, ZoomOutLeft, ZoomOutRight, ZoomOutUp
     */
}
