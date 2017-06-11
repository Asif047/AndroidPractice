package com.example.admin.bitmday2b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AcademicInformation extends AppCompatActivity {


    private TextView AcademicInfoTV;

    private Student student;

    private ArrayList<Student> studentList;

    private Spinner depSnipper;

    private ArrayList<String> department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_information);

        depSnipper= (Spinner) findViewById(R.id.DepartmentSpinner);
        department=new ArrayList<>();
        department.add("CSE");
        department.add("EEE");
        department.add("Civil");
        department.add("IPE");
        department.add("Textile");

        ArrayAdapter<String> depAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,department);
        depSnipper.setAdapter(depAdapter);


        student= (Student) getIntent().getSerializableExtra("Greetings");
        //studentList= (ArrayList<Student>) getIntent().getSerializableExtra("Greetings2");
        //Toast.makeText(this,msgFromMainActivity,Toast.LENGTH_LONG).show();

        String studentInfo= (String) getIntent().getSerializableExtra("Greetings2");

        AcademicInfoTV= (TextView) findViewById(R.id.StudentInfoTextView2);
       // AcademicInfoTV.setText(student.toString());

        //for(int i=0;i<studentList.size();i++)
        AcademicInfoTV.setText(studentInfo);
    }
}
