package com.dacodes.naxon;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import com.dacodes.naxon.activities.home;
import com.dacodes.naxon.activities.signin;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class login_signin extends AppCompatActivity {


    @OnClick({R.id.btn_signin, R.id.btn_login})
    void submitButton(View view) {
        if (view.getId() == R.id.btn_signin) {
            Intent intento = new Intent(this, signin.class);
            this.startActivity(intento);

        }else if(view.getId() == R.id.btn_login){
            if(username.getText().toString().isEmpty()){
                err_username.setError("Campo obligatorio");
                return;
            }else if(password.getText().toString().isEmpty()){
                err_password.setError("Campo obligatorio");
                return;
            }
                Intent intent = new Intent(this, home.class);
                this.startActivity(intent);

        }
    }

    @BindView(R.id.text_input_layout_username)
    TextInputLayout err_username;
    @BindView(R.id.text_input_layout_password)
    TextInputLayout err_password;
    @BindView(R.id.username)
    TextInputEditText username;
    @BindView(R.id.password)
    TextInputEditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signin);
        ButterKnife.bind(this, this);

        password.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
                int result = actionId & EditorInfo.IME_MASK_ACTION;
                switch(result) {
                    case EditorInfo.IME_ACTION_DONE://cuando presione el boton de done en el teclado del telefono
                        if(username.getText().toString().isEmpty()){
                            err_username.setError("Campo obligatorio");
                            break;
                        }else if(password.getText().toString().isEmpty()){
                            err_password.setError("Campo obligatorio");
                            break;
                        }
                        Intent intent = new Intent(login_signin.this, home.class);
                        login_signin.this.startActivity(intent);
                        break;
                    case EditorInfo.IME_ACTION_NEXT:

                        break;
                }
                return true;
            }
        });






    }
}
