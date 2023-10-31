package com.example.login;// Import the necessary libraries
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login.MainActivity;
import com.example.login.R;

public class LoginActivity extends Activity {
    // Declare the UI elements
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Initialize the UI elements
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        // Set an onClick listener on the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the username and password from the UI elements
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                // Validate the username and password
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter a username and password", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Check if the username and password are correct
                if (username.equals("admin") && password.equals("password")) {
                    // The username and password are correct, so start the main activity
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    // The username and password are incorrect, so show an error message
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}