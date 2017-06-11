package com.example.admin.bitmday2b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private EditText FirstNameET;
    private EditText LastNameET;
    private EditText HouseET;
    private EditText RoadET;
    private EditText CityET;
    private EditText ZipET;
    private EditText PhoneET;

    private Button registerButton;
    private TextView StudentInfoTV;

    private ArrayList<Student> StudentList;

    String studentInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstNameET=(EditText) findViewById(R.id.FirstNameEditText);
        LastNameET=(EditText) findViewById(R.id.LastNameEditText);
        HouseET=(EditText) findViewById(R.id.HouseEditText);
        RoadET=(EditText) findViewById(R.id.RoadEditText);
        CityET=(EditText) findViewById(R.id.CityEditText);
        ZipET=(EditText) findViewById(R.id.ZipEditText);
        PhoneET=(EditText) findViewById(R.id.PhoneNumberEditText);

        registerButton=(Button) findViewById(R.id.RegisterButton);
        StudentInfoTV=(TextView) findViewById(R.id.StudentInfoTextView);

        StudentList=new ArrayList<>();
    }

    public void registerStudent(View view) {

        String FirstName=FirstNameET.getText().toString();
        String LastName=LastNameET.getText().toString();
        String HouseNo=HouseET.getText().toString();
        String RoadNo=RoadET.getText().toString();
        String City=CityET.getText().toString();
        String Zip=ZipET.getText().toString();
        String PhoneNo=PhoneET.getText().toString();

        StudentAddress studentAddress=new StudentAddress(HouseNo,RoadNo,City,Zip);
        Student student=new Student(FirstName,LastName,studentAddress,PhoneNo);

        StudentList.add(new Student(FirstName,LastName,studentAddress,PhoneNo));

        Intent intent=new Intent(MainActivity.this,AcademicInformation.class);

        studentInfo="";

        for(int i=0;i<StudentList.size();i++)
        {
            studentInfo+=StudentList.get(i).toString()+"\n";
        }

        StudentInfoTV.setText(studentInfo);


        //String greeting="Hello asif";
        intent.putExtra("Greetings",student);
        intent.putExtra("Greetings2",studentInfo);

        //startActivity(intent);






        //StudentInfoTV.setText(student.getFirstName()+" ,"+student.getLastName()+" ,"+studentAddress.toString()+" ,"+student.getPhoneNumber());

        //StudentInfoTV.setText(StudentList.get(0)+"");
    }

    public void changeActivity(View view) {

        Intent intent=new Intent(MainActivity.this,AcademicInformation.class);
        intent.putExtra("Greetings2",studentInfo);
        startActivity(intent);
    }
}
