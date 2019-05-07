package com.example.zb.myswitchbuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.kyleduo.switchbutton.SwitchButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwitchButton mSwitchButton = (SwitchButton) findViewById(R.id.switchButton);
        mSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String s;
                if (b)
                    s = "确定";
                else
                    s = "取消";

                Toast.makeText(getApplication(), s, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
