package com.pys.caesarcipher;

import static com.pys.caesarcipher.utility.decrypt1;
import static com.pys.caesarcipher.utility.encrypt;
import static com.pys.caesarcipher.utility.encrypt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button encrypt,decrypt;
    private EditText message,cipher,key;
    private TextView screenOutput;

    private static final String ALPHABETSTRING="abcdefghijklmnopqrstuvwxyz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encrypt=findViewById(R.id.btnEncrypt);
        decrypt=findViewById(R.id.btnDecrypt);
        screenOutput=findViewById(R.id.tV1);

        message=findViewById(R.id.inputMessage);
        cipher=findViewById(R.id.ciphEdt);
        key=findViewById(R.id.keyDT);

        encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                encrypt12(message.getText().toString(),Integer.parseInt(key.getText().toString()));
            }
        });
        decrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrypt12(message.getText().toString(),Integer.parseInt((key.getText().toString()))).
            }
        });

        public void decrypt12(String cipher,int key){
            screenOutput.setText(Utility.decrypt1(cipher,key).toLowerCase());
        }
        public String encrypt12(String )
    }
}