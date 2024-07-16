package com.geeks.nurkyz_chomoeva_hw2_4;


import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Window;
import android.view.WindowManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextView textView1, textView2;
    private LinearLayout linearLayout;
    private EditText editText, editText1;
    private Button button, button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.entersTv);
        textView1 = findViewById(R.id.welcomeTv);
        textView2 = findViewById(R.id.enter);
        linearLayout = findViewById(R.id.LL);
        editText = findViewById(R.id.gmailEt);
        editText1 = findViewById(R.id.passwordEt);
        button = findViewById(R.id.btnGo);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText.getText().toString().length() >= 1 && editText1.getText().toString().length() >= 1) {
                    button.setBackgroundColor(Color.parseColor("#F4511E"));
                }else{
                    button.setBackgroundColor(Color.GRAY);
                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("admin") && editText1.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Вы успешно ввели пароль", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.GONE);
                    textView.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                } else {
                    Toast.makeText(MainActivity.this, "Вы ввели неправильный логин или пароль", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }


}