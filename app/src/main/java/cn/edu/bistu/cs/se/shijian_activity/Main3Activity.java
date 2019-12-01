package cn.edu.bistu.cs.se.shijian_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView tv;
    private EditText et;
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv=findViewById(R.id.main21);
        et=findViewById(R.id.main22);
        bt=findViewById(R.id.main23);
        Intent intent=getIntent();
        String data=intent.getStringExtra("temp");
        tv.setText(data);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent();
                intent1.putExtra("return",et.getText().toString());
                setResult(RESULT_OK,intent1);
                finish();
            }
        });
    }
}
