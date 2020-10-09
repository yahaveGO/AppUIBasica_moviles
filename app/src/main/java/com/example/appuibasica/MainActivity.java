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
    private Button botonActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonActivity = findViewById(R.id.btnActividad);
        botonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BotonActivity.class);
                intent.putExtra("opcion", "ciclo de vida de las actividades");
                startActivity(intent);
            }
        });

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