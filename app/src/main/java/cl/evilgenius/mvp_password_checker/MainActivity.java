package cl.evilgenius.mvp_password_checker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements PassChecker {

    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        editText = findViewById(R.id.inputEt);
        textView = findViewById(R.id.validationTv);
        Button button = findViewById(R.id.resultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = editText.getText().toString();
                new PassChekerLogic(MainActivity.this).PasswordEight(password);

            }
        });

    }


    @Override
    public void correct() {
        textView.setText("Contraseña correcta");
        editText.setText("");
    }


    @Override
    public void incorrect() {
        textView.setText("Contraseña inconrecta, vuelva a intentarlo");
        editText.setText("");
    }
}
