package cn.edu.bistu.cs.se.shijian_activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    private Button bt;
    private Button bt1;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.main1);
        bt=findViewById(R.id.main2);
        tv=findViewById(R.id.main3);
        bt1=findViewById(R.id.main4);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=et.getText().toString();
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("temp",temp);
                startActivityForResult(intent,1);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=et.getText().toString();
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                intent.putExtra("temp",temp);
                startActivityForResult(intent,2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    tv.setText("Main2Activity返回的数据为:" + data.getStringExtra("return"));
                }
                break;
            case 2:
                if (resultCode == RESULT_OK) {
                    tv.setText("Main3Activity返回的数据为:" + data.getStringExtra("return"));
                }
                break;
            default:
    }
}
}
