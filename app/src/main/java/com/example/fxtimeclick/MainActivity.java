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
                url = url + java8Disp;
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                java8Disp = "";
                url = "http://yniwa0130.php.xdomain.jp/index.php?a=";
            }
        });
    }
}