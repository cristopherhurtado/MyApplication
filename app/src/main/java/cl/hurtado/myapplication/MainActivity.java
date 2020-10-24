package cl.hurtado.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText user;
    private  EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.textBoxUsuario);
        password = findViewById(R.id.textBoxClave);
    }

    public void btnAcceder(View view){

            String nombre = user.getText().toString();
            String clave = password.getText().toString();

            if (nombre.equalsIgnoreCase("cristopherhur") && clave.equalsIgnoreCase("1984")){
                Toast.makeText(this, "Usuario y Password Correcto", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Usuario y/o Password Incorrecto", Toast.LENGTH_SHORT).show();
            }


    }

}