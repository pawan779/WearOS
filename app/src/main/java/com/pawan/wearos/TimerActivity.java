package com.pawan.wearos;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.wearable.activity.WearableActivity;
import android.widget.Button;
import android.widget.TextView;

public class TimerActivity extends WearableActivity {

   private TextView tvSeconds;
   private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
tvSeconds=findViewById(R.id.tvSecond);
btnSend=findViewById(R.id.btnSend);
        // Enables Always-on
        setAmbientEnabled();
     new CountDownTimer(30000,1000){
         public void onTick(long millisUntilFinished)
         {
             tvSeconds.setText("SEcond REmaining : "+millisUntilFinished/1000);
         }
         public void onFinish()
         {
             tvSeconds.setText("Done");
         }
     }.start();


    }
}
