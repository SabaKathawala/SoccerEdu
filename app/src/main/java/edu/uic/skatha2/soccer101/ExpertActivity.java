package edu.uic.skatha2.soccer101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;


/*
    The user can select one of the three levels: Easy, Intermediate, Expert to start learning about soccer.
    This is an example Activity which visualizes the Expert Level.
 */
public class ExpertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert);
        getSupportActionBar().setTitle("Expert Level");
    }

    //creating options expert_menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.expert_menu, menu);
        return true;
    }
}
