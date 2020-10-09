package com.example.appuibasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.modelo.Libro;

public class BotonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton);
        //String opcion=getIntent().getStringExtra("opcion");
        Libro libro = (Libro) getIntent().getExtras().getSerializable("libro");
        //visualizar("en onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        visualizar("en onStart");
        Log.d("Activity Lifecycle","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        visualizar("en onResume");
        Log.d("Activity Lifecycle","onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        visualizar("en onPause");
        Log.d("Activity Lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        visualizar("en onStop");
        Log.d("Activity Lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        visualizar("en onRestart");
        Log.d("Activity Lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        visualizar("en onDestroy");
        Log.d("Activity Lifecycle","onDestroy invoked");
    }

    private void visualizar(String mensaje){
        Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_LONG).show();
    }
}