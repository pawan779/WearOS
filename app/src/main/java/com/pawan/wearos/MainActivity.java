package com.pawan.wearos;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {
    EditText etFirst;
    Button btnShow;
    TextView tvOutput;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst=findViewById(R.id.etFirst);
        btnShow=findViewById(R.id.btnShow);
        tvOutput=findViewById(R.id.tvOutput);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.append(etFirst.getText().toString()+"\n");
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}
