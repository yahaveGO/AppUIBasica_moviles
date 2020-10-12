package com.example.appuibasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.modelo.Libro;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    //private Button botonActivity = findViewById(R.id.btnActividad);
    private Button botonPasoParametros;
    private Button botonCasillaVerificacion;
    private Button botonSelector;
    private Button botonEtiqueta;
    private Button botonRadio;
    private Button botonCajaTexto;
    private Button botonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonPasoParametros      = findViewById(R.id.btnPasoParametro);
        botonCasillaVerificacion = findViewById(R.id.btnCasillaVerificacion);
        botonSelector            = findViewById(R.id.btnSelector);
        botonEtiqueta            = findViewById(R.id.btnEtiqueta);
        botonRadio               = findViewById(R.id.btnRadio);
        botonCajaTexto           = findViewById(R.id.btnCajaTexto);
        botonLogin               = findViewById(R.id.btnLogin);


//--------------------------------------------------------------------------------------------------PASO DE PARAMETROS
        botonPasoParametros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BotonActivity.class);
                intent.putExtra("opcion", "ciclo de vida de las actividades");
                startActivity(intent);
            }
        });

//--------------------------------------------------------------------------------------------------CASILLAS DE VERIFICACION
        botonCasillaVerificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BotonCasillas.class);
                intent.putExtra("opcion", "ciclo de vida de las actividades");
                startActivity(intent);
            }
        });
//--------------------------------------------------------------------------------------------------BOTON SELECTOR
        botonSelector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Selector.class);
                intent.putExtra("opcion", "ciclo de vida de las actividades");
                startActivity(intent);
            }
        });
//--------------------------------------------------------------------------------------------------BOTON ETIQUETAS
        botonEtiqueta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Etiqueta.class);
                intent.putExtra("opcion", "ciclo de vida de las actividades");
                startActivity(intent);
            }
        });
//--------------------------------------------------------------------------------------------------BOTON RADIO
        botonRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Boton_radio.class);
                intent.putExtra("opcion", "ciclo de vida de las actividades");
                startActivity(intent);
            }
        });
//--------------------------------------------------------------------------------------------------BOTON CAJA DE TEXTO
        botonCajaTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CajaTexto.class);
                intent.putExtra("opcion", "ciclo de vida de las actividades");
                startActivity(intent);
            }
        });
//--------------------------------------------------------------------------------------------------
        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BotonLogin.class);
                intent.putExtra("opcion", "ciclo de vida de las actividades");
                startActivity(intent);
            }
        });
//--------------------------------------------------------------------------------------------------


    }


    private Libro getLibro(){
        Libro libro=new Libro();
        libro.setIsnb("100");
        libro.setTitulo("Android1001");
        libro.setAutor("Joyanes100");
        libro.setEditorial("Diana100");
        libro.setEdicion("2100");
        return libro;
    }


}