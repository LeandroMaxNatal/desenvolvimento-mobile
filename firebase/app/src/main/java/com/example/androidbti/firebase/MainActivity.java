package com.example.androidbti.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("empregados/Jose/email");
        //myRef.setValue("jose@globo.com");

        //DatabaseReference myRef = database.getReference("empregados");
        //myRef.child("carlos").child("cargo").setValue("assistente");

        //DatabaseReference myRef = database.getReference("empregados/maria");
        //Map<String, Object> dados = new HashMap<>();
        //dados.put("cargo","Diretor");
        //dados.put("email","direcao@gmail.com");
        //dados.put("nome","José diretor");
        //myRef.setValue(dados);

        //Empregado empregado = new Empregado(
        //        "Gerente",
        //        "maria@email",
        //        "Maria Gerente"
        //);

        //myRef.setValue(empregado);

        /*
        //Ler dados
        //DatabaseReference myRef = database.getReference("empregados/jose");
        //ValueEventListener employeeJose = new ValueEventListener() {
        //    @Override
        //    public void onDataChange(DataSnapshot dataSnapshot) {
        //        Empregado dadosJose = dataSnapshot.getValue(Empregado.class);
                Log.i("LOG",dadosJose.getNome()+ " " + dadosJose.getEmail());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        myRef.addValueEventListener(employeeJose);
        */
        DatabaseReference myRef = database.getReference("empregados");

        ChildEventListener empregados = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Empregado empregado = dataSnapshot.getValue(Empregado.class);
                Log.i("LOG", empregado.getNome()+ " "+empregado.getEmail());
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        myRef.addChildEventListener(empregados);
    }
}
