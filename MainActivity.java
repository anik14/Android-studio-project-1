package com.example.anik1.project2;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoordinatorLayout cL = (CoordinatorLayout) findViewById(R.id.zero);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Mohammad Islam", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button bt = (Button) findViewById(R.id.button4);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et = (EditText) findViewById(R.id.editText2);
                TextView ta = (TextView) findViewById(R.id.textView1);
                String s = et.getText().toString();
                char ch ;
                int i = 0;
                String newS="";
                while(i<s.length())
                {
                    ch = s.charAt(i);
                    newS+= (char)((int)ch + 003);
                    i++;
                }
                ta.setText(newS);



            }
        });
        Button bt5 = (Button) findViewById(R.id.button5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et = (EditText) findViewById(R.id.editText2);
                TextView ta = (TextView) findViewById(R.id.textView1);
                String s = et.getText().toString();
                char ch ;
                int i = 0;
                String newS="";
                while(i<s.length())
                {
                    ch = s.charAt(i);
                    newS+= (char)((int)ch - 003);
                    i++;
                }
                ta.setText(newS);



            }
        });
        Button boi = (Button) findViewById(R.id.button2);
        boi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edi = (EditText) findViewById(R.id.editText2);
                TextView ta = (TextView) findViewById(R.id.textView1);
                ta.setText(edi.getText().toString());
            }

        });



        Button be = (Button) findViewById(R.id.button);
        be.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      EditText edi = (EditText) findViewById(R.id.editText2);
                                      TextView ta = (TextView) findViewById(R.id.textView1);
                                      ta.setText(edi.getText().toString().toUpperCase());
                                  }

    });

        Button bic = (Button) findViewById(R.id.button3);
        bic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edi = (EditText) findViewById(R.id.editText2);
                TextView ta = (TextView) findViewById(R.id.textView1);
                ta.setText(edi.getText().toString().toLowerCase());
            }

        });

        ImageView iv = (ImageView) findViewById(R.id.imageView2);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edi = (EditText) findViewById(R.id.editText2);
                TextView ta = (TextView) findViewById(R.id.textView1);
                edi.setText("");
                ta.setText("Nothing!");
                ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
                Random rand = new Random();
                int n = rand.nextInt(3);
                if(n==0)
                    iv2.setImageResource(R.drawable.admin);
                else if(n==1)
                    iv2.setImageResource(R.drawable.beinthatnumber);
                else
                    iv2.setImageResource(R.drawable.df1b4072002385286720245f92df2474_400x400);


            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_settings:
                View coordinator1 = null;
                Snackbar.make(coordinator1, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


        }

        return super.onOptionsItemSelected(item);
    }




}

