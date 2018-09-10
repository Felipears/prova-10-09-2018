package prova.felipe.com.prova;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import static android.graphics.Color.RED;
import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {

    private int numero;
    private TextView mensagemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView mensagemTextView = (TextView) findViewById(R.id.textView1);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view){
        Integer numero = parseInt(mensagemTextView.getText().toString());
        numero = numero + 1;
        mensagemTextView.setText(numero);
        mensagemTextView.setBackgroundColor(Color.BLUE);
    }

    public void subtrair(View view){
        Integer numero = parseInt(mensagemTextView.getText().toString());
        numero = numero + 1;
        mensagemTextView.setText(numero);
        mensagemTextView.setBackgroundColor(Color.RED);
    }

    public void zerar(View view){
        mensagemTextView.setText("0");
        mensagemTextView.setBackgroundColor(Color.GREEN);
    }

}
