package com.aboveall.formrecycleview.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.aboveall.formrecycleview.R;
import com.aboveall.formrecycleview.adapter.DetailsAdapter;
import com.aboveall.formrecycleview.model.Details;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

EditText etName,etAge;
RadioGroup radioGroup;
RadioButton rbm,rbf,rbo;
Button button;
RecyclerView recyclerView;
Spinner spinnerImg;
String name,age,gender;
int imageposition;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.etName);
        etAge=findViewById(R.id.etAge);
        radioGroup=findViewById(R.id.radioGroup);
        rbm=findViewById(R.id.rbm);
        rbf=findViewById(R.id.rbf);
        rbo=findViewById(R.id.rbo);
        button=findViewById(R.id.button);
        recyclerView=findViewById(R.id.recyclerView);
        spinnerImg=findViewById(R.id.spinnerImg);



        final String images[]={"man1","man2","woman1","woman2","woman3"};
        final int ImageList[]={


                R.drawable.men1,
                R.drawable.men2,
                R.drawable.women1,
                R.drawable.women,
                R.drawable.men
        };



        //List of details to display in recyclerView
        final List<Details> detailsList=new ArrayList<>();

        ArrayAdapter adapter= new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                images
        );
        spinnerImg.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //parsing
                name=etName.getText().toString();

                age=etAge.getText().toString();

                int selected=radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton=findViewById(selected);
                gender=radioButton.getText().toString();

                int pos=(spinnerImg.getSelectedItemPosition());

                imageposition=ImageList[pos];


                //adding all details in list
                detailsList.add(new Details(name,age,gender,imageposition));
                DetailsAdapter detailsAdapter=new DetailsAdapter(MainActivity.this,detailsList);

                recyclerView.setAdapter(detailsAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


            }
        });

    }





    }

