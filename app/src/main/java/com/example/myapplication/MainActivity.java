package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
TextInputLayout textInputLayout;
AutoCompleteTextView autoCompleteTextView;
Button bnt;
EditText propertytype, Bedroom, monthlyprc, report, datetime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputLayout = findViewById(R.id.bedroom);
        autoCompleteTextView = findViewById(R.id.chooseroom);
        String[] bedroom = {"Studio", "1", "2", "3"};
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.listbedroom,bedroom);
        autoCompleteTextView.setAdapter(itemAdapter);
        //furnituretype
        textInputLayout = findViewById(R.id.furnituretype);
        autoCompleteTextView = findViewById(R.id.choosefurnituretype);
        String[] furnituretype = {"Furnished","Part Furnished", "Unfurnished"};
        ArrayAdapter<String> itemnish = new ArrayAdapter<>(MainActivity.this,R.layout.lishfurnituretype,furnituretype);
        autoCompleteTextView.setAdapter(itemnish);
        //khaibao
        propertytype = (EditText) findViewById(R.id.propertytype);
        Bedroom = (EditText) findViewById(R.id.chooseroom);
        datetime = (EditText) findViewById(R.id.dateandtime);
        monthlyprc = (EditText) findViewById(R.id.monthprc);
        report = (EditText) findViewById(R.id.report);
        bnt = (Button) findViewById(R.id.create);
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!alertproperty()|!alertbedroom()|!alertdatetime()|!alertmonthlyprc()|!alertreport()) {
                    Toast.makeText(MainActivity.this, "Error!!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }


        });
    }
    //propertytype
    private Boolean alertproperty(){
        String propertytypeabc = propertytype.getText().toString();
        if(propertytypeabc.length()==0){
            propertytype.setError("Please to type");
            return false;
        }
        else {
            propertytype.setError(null);
            return true;
        }

    }
    //bedroom
    private Boolean alertbedroom(){
        String bedroomabc = Bedroom.getText().toString();
        if(bedroomabc.length()==0){
            Bedroom.setError("Please to type");
            return false;
        }
        else {
            Bedroom.setError(null);
            return true;
        }

    }
    private Boolean alertdatetime(){
        String datetimeabc = datetime.getText().toString();
        if(datetimeabc.length()==0){
            datetime.setError("Please to type");
            return false;
        }
        else {
            datetime.setError(null);
            return true;
        }

    }
    private Boolean alertmonthlyprc(){
        String monthlyprcabc = monthlyprc.getText().toString();
        if(monthlyprcabc.length()==0){
            monthlyprc.setError("Please to type");
            return false;
        }
        else {
            monthlyprc.setError(null);
            return true;
        }

    }
    private Boolean alertreport(){
        String reportabc = report.getText().toString();
        if(reportabc.length()==0){
            report.setError("Please to type");
            return false;
        }
        else {
            report.setError(null);
            return true;
        }

    }
}