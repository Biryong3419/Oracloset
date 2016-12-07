package com.example.woocheol.oracloset.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.woocheol.oracloset.R;
import com.example.woocheol.oracloset.Register.RegistInfoActivity;

import java.sql.BatchUpdateException;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    Button btn_regist;

    private long backKeyPressedTime = 0;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button)findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn_regist = (Button)findViewById(R.id.btn_regist);
        btn_regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegistInfoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() >= backKeyPressedTime + 2000){
            backKeyPressedTime = System.currentTimeMillis();
            toast = Toast.makeText(this, "한 번더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }else{
            finish();
            toast.cancel();
        }
    }
}