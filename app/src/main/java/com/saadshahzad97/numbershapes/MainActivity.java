package com.saadshahzad97.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Name of the class
    class appNumber
    {
       int triangularNumber = 1;
       int numbers;

       //Method for checking if it is a triangular number
       public boolean triangularNumber()
       {
           int x = 1;

           while (triangularNumber < numbers)
           {
               x++;
               triangularNumber = triangularNumber + x;
           }

           if(triangularNumber == numbers)
           {
               return true;
           }

           else
           {
               return false;
           }
       }

       //Method to check if it is a square number
       public boolean squareNumber()
       {
          double squareRoot = Math.sqrt(numbers);

          if(squareRoot == Math.floor(squareRoot))
          {
              return true;
          }

          else
          {
              return false;
          }
       }

    }

    //On click method i.e. The name of the button
    public void onClick(View view)
    {
        String message ="";

        EditText userInput = (EditText) findViewById(R.id.Numbers);

        //If user is empty
        if(userInput.getText().toString().isEmpty()){

            message = "Please Enter a number";
        }

        else {

            appNumber myNumber = new appNumber();

            myNumber.numbers = Integer.parseInt(userInput.getText().toString());

            if(myNumber.squareNumber())
            {
                if(myNumber.triangularNumber())
                {
                    message = myNumber.numbers + " is square number and triangular number";
                }
                else
                {
                    message = myNumber.numbers + " is square number but not triangular number";
                }
            }

            else
            {
                if (myNumber.triangularNumber())
                {
                    message = myNumber.numbers + " is a triangular number but not square number";
                }

                else
                    {
                    message = myNumber.numbers + " is neither triangular nor square number";
                }
            }

        }

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//end of the code