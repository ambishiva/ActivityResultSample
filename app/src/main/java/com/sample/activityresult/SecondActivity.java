package com.sample.activityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Button btn;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        intialiseListener();
    }

    private void intialiseListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String message = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("MESSAGE", message);
                setResult(FirstActivity.SECOND_ACTIVITY_REQUEST_CODE, intent);
                finish();//finishing activity
            }
        });
    }

    private void initView() {
        editText = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);
    }
}