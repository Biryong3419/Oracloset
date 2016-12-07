package com.example.woocheol.oracloset.Register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.woocheol.oracloset.R;

public class RegistInfoActivity extends AppCompatActivity {

    Button btn_reg_info_ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_info);

        setTitle("사용자 정보 등록");


        btn_reg_info_ok = (Button)findViewById(R.id.btn_reg_info_ok);
        btn_reg_info_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistInfoActivity.this, RegistGenderActivity.class);
                startActivity(intent);
            }
        });
    }
}
