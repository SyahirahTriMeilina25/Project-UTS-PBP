package id.co.sachie.swsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    Button btnRegistrasi;
    EditText username,email,password,confirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegistrasi = findViewById(R.id.btnRegistrasi);
        username = findViewById(R.id.regusername);
        email = findViewById(R.id.regemail);
        password = findViewById(R.id.regpassword);
        confirmPassword = findViewById(R.id.regfixpassword);

        btnRegistrasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String str_email = email.getText().toString();
                String str_pass = password.getText().toString();
                String str_username = username.getText().toString();
                String str_copass = confirmPassword.getText().toString();
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                intent.putExtra("email", str_email);
                intent.putExtra("Password", str_pass);
                startActivity(intent);

            }

        });
    }
}