/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 */
  package com.example.dharanyuvi.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.text.StringCharacterIterator;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=1;
    /**
     * This method is called when the order button is clicked.
     */public void increment(View view) {

        quantity++;
        display(quantity);
    }

    public void decrement(View view) {

        quantity--;
        display(quantity);
    }


    public void submitOrder(View view) {

        int price=calculatePrice(quantity);
        String priceMessage=orderSummary(price);
        displayMessage(priceMessage);
    }


    public int calculatePrice(int a)
    {
        return a*5;
    }


    private String orderSummary(int price)
    {
        String sum="Name: "+"Dharan"+"\nQuantity: "+quantity+"\nTotal: $"+price+"\nThank you!";
        return sum;


    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayMessage(String message) {
        TextView ordersummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        ordersummaryTextView.setText(message);
    }


}