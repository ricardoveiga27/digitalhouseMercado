package digitalHouse.projetodigitalhouse;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText nome;
    private TextInputEditText email;
    private TextInputEditText senha;
    private TextInputEditText senhaConfirma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        nome = findViewById(R.id.edit_nome);
        email = findViewById(R.id.edit_email);
        senha = findViewById(R.id.edit_senha);
        senhaConfirma = findViewById(R.id.edit_senha_confirma);


        FloatingActionButton fab = findViewById(R.id.fab_register);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nome.getEditableText().toString().equals("")){
                    nome.setError("Campo nome não pode ser vazio!");
                }
                else if (email.getEditableText().toString().equals("")){
                    email.setError("Campo Email não pode ser vazio!");
                }

                else if (senha.getEditableText().toString().equals(senhaConfirma.getEditableText().toString())
                        && !senha.toString().equals("")
                        && !senhaConfirma.toString().equals("")){

                    botaoClicado(v);

                }else {
                    senha.setError("senhas não conferem!");
                }

            }
        });

        }
    public void botaoClicado(View view){
        Snackbar.make(view, "USUARIO CADASTRADO!!!", Snackbar.LENGTH_INDEFINITE).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).setActionTextColor(getResources().getColor(R.color.laranja))
                .show();
    }

}
