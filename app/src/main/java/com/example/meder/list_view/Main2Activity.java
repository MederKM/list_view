package com.example.meder.list_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {

    EditText adressEditText;
    EditText priceEditText;
    EditText areaEditText;
    EditText floorEditText;
    EditText totalFloorsEditText;
    EditText roomsEditText;
    Button saveButton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Flats");
        adressEditText = findViewById(R.id.adress_edit_text);
        priceEditText = findViewById(R.id.price_edit_text);
        areaEditText = findViewById(R.id.area_edit_text);
        floorEditText =findViewById(R.id.floor_edit_text);
        totalFloorsEditText = findViewById(R.id.total_floors_edit_text);
        roomsEditText = findViewById(R.id.rooms_edit_text);
        saveButton = findViewById(R.id.save_button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String adress = adressEditText.getText().toString();
               String price = priceEditText.getText().toString();
               String area = areaEditText.getText().toString();
               String floor = floorEditText.getText().toString();
               String totalFloors = totalFloorsEditText.getText().toString();
               String rooms = roomsEditText.getText().toString();
               Flat flat = new Flat(adress, price, area,floor, totalFloors, rooms);
               flat.setId(databaseReference.push().getKey());
               databaseReference.child(flat.getId()).setValue(flat);


            }
        });

    }
}
