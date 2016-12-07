package com.example.woocheol.oracloset.Register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.woocheol.oracloset.MainActivity;
import com.example.woocheol.oracloset.R;

public class RegistJobActivity extends AppCompatActivity {
private ListView lv;
    private Button bt;
   private EditText et;
    private String lv_arr[]={"대학생","주부","고등학생","회사원","소방사","경찰",
            "대통령","우주비행사","무직","서비스직","어부","패션디자이너","헤어디자이너",
            "프로그래머","관광가이드"};
    ArrayAdapter<String> arrad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_job);
        setTitle("사용자 정보 등록");
        arrad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lv_arr);
        lv=(ListView)findViewById(R.id.job_list);
        lv.setAdapter(arrad);
        lv.setTextFilterEnabled(true);
        bt=(Button)findViewById(R.id.jobBt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistJobActivity.this,RegistStyleActivity.class);
                startActivity(i);
            }
        });
        et=(EditText)findViewById(R.id.job_et);
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                RegistJobActivity.this.arrad.getFilter().filter(editable);
            }
        });


    }
}
