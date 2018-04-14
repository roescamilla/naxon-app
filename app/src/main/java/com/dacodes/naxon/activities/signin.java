package com.dacodes.naxon.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.dacodes.naxon.R;
import com.dacodes.naxon.login_signin;
import butterknife.OnClick;

public class signin extends AppCompatActivity {

    @OnClick(R.id.btn_signin)
    void submitButton(View view) {
        if (view.getId() == R.id.btn_signin) {
            Intent intento = new Intent(this, login_signin.class);
            this.startActivity(intento);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
}
