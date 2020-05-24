package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.net.Uri.*;

public class MainActivity extends AppCompatActivity {
    Button btnCall,btnOpenMap,btnCallFrend,getBtnOpenWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCall=findViewById(R.id.btncall);
        btnCallFrend=findViewById(R.id.btnCallFrend);
        btnOpenMap=findViewById(R.id.btnOpenMap);
        getBtnOpenWeb=findViewById(R.id.btnOpenWeb);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                startActivity(intent);

            }
        });
        btnCallFrend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent((Intent.ACTION_DIAL),Uri.parse("tel:8949166982"));
                startActivity(intent);

            }
        });
        getBtnOpenWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.backendless.com"));
                startActivity(intent);

            }
        });
        btnOpenMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=state way,welcome to jodhpur"));
                startActivity(intent);

            }
        });
    }
}
