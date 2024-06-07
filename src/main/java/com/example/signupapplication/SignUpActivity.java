package com.example.signupapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button button = findViewById(R.id.sign_up_button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this, "Sign Up BTN", Toast.LENGTH_SHORT).show();
            }
        });
        Log.i("State","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("State","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State","OnStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("State","OnRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State","OnDestroy");
    }
}