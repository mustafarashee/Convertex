package com.mustafarasheed.convertex;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void btnDollar(View view)
    {
        EditText PKRAmount = findViewById(R.id.PKRamount);
        String PKR = PKRAmount.getText().toString();
        Double doublePkr =Double.parseDouble(PKR);
        Double doubleDollar=doublePkr*160.70;
        String tostText="="+doubleDollar.toString();
        Toast.makeText(this, tostText, Toast.LENGTH_SHORT).show();



    }
    public void btnPound(View view)
    {
        EditText PKRAmount = findViewById(R.id.PKRamount);
        String PKR = PKRAmount.getText().toString();
        Double doublePkr =Double.parseDouble(PKR);
        Double doublePound=doublePkr*196.53;
        String tostText="="+doublePound.toString();
        Toast.makeText(this, tostText, Toast.LENGTH_SHORT).show();



    }
    public void btnEuro(View view)
    {
        EditText PKRAmount = findViewById(R.id.PKRamount);
        String PKR = PKRAmount.getText().toString();
        Double doublePkr =Double.parseDouble(PKR);
        Double doubleEuro=doublePkr*173.64;
        String tostText="="+doubleEuro.toString();
        Toast.makeText(this, tostText, Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
