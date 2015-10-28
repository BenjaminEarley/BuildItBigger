package com.benjaminearley.viewjokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class JokeActivity extends ActionBarActivity {

    public static final String JOKE_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView jokeTV = (TextView) findViewById(R.id.jokeText);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra(JOKE_KEY)) {
            jokeTV.setText(intent.getStringExtra(JOKE_KEY));
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                super.onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
