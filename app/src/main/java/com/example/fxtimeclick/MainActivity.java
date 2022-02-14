package com.example.fxtimeclick;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MainActivity extends AppCompatActivity {
    String url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        TextView text = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                // 現在日時情報で初期化されたインスタンスの取得
                LocalDateTime nowDateTime = LocalDateTime.now();
                DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
                // 日時情報を指定フォーマットの文字列で取得
                String java8Disp = nowDateTime.format(java8Format);
                text.setText(java8Disp);
                String parm = ",'1','50/100'";
                url = url + "'" + java8Disp + "'" + parm;
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                java8Disp = "";
                url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                // 現在日時情報で初期化されたインスタンスの取得
                LocalDateTime nowDateTime = LocalDateTime.now();
                DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
                // 日時情報を指定フォーマットの文字列で取得
                String java8Disp = nowDateTime.format(java8Format);
                text.setText(java8Disp);
                String parm = ",'1','25/100'";
                url = url + "'" + java8Disp + "'" + parm;
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                java8Disp = "";
                url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                // 現在日時情報で初期化されたインスタンスの取得
                LocalDateTime nowDateTime = LocalDateTime.now();
                DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
                // 日時情報を指定フォーマットの文字列で取得
                String java8Disp = nowDateTime.format(java8Format);
                text.setText(java8Disp);
                String parm = ",'1','50/50'";
                url = url + "'" + java8Disp + "'" + parm;
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                java8Disp = "";
                url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                // 現在日時情報で初期化されたインスタンスの取得
                LocalDateTime nowDateTime = LocalDateTime.now();
                DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
                // 日時情報を指定フォーマットの文字列で取得
                String java8Disp = nowDateTime.format(java8Format);
                text.setText(java8Disp);
                String parm = ",'1','25/50'";
                url = url + "'" + java8Disp + "'" + parm;
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                java8Disp = "";
                url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                // 現在日時情報で初期化されたインスタンスの取得
                LocalDateTime nowDateTime = LocalDateTime.now();
                DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
                // 日時情報を指定フォーマットの文字列で取得
                String java8Disp = nowDateTime.format(java8Format);
                text.setText(java8Disp);
                String parm = ",'2','50/100'";
                url = url + "'" + java8Disp + "'" + parm;
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                java8Disp = "";
                url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                // 現在日時情報で初期化されたインスタンスの取得
                LocalDateTime nowDateTime = LocalDateTime.now();
                DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
                // 日時情報を指定フォーマットの文字列で取得
                String java8Disp = nowDateTime.format(java8Format);
                text.setText(java8Disp);
                String parm = ",'2','25/100'";
                url = url + "'" + java8Disp + "'" + parm;
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                java8Disp = "";
                url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                // 現在日時情報で初期化されたインスタンスの取得
                LocalDateTime nowDateTime = LocalDateTime.now();
                DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
                // 日時情報を指定フォーマットの文字列で取得
                String java8Disp = nowDateTime.format(java8Format);
                text.setText(java8Disp);
                String parm = ",'2','50/50'";
                url = url + "'" + java8Disp + "'" + parm;
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                java8Disp = "";
                url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                // 現在日時情報で初期化されたインスタンスの取得
                LocalDateTime nowDateTime = LocalDateTime.now();
                DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
                // 日時情報を指定フォーマットの文字列で取得
                String java8Disp = nowDateTime.format(java8Format);
                text.setText(java8Disp);
                String parm = ",'2','25/50'";
                url = url + "'" + java8Disp + "'" + parm;
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                java8Disp = "";
                url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
            }
        });
    }
}