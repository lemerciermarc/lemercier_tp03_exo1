package fr.utt.if26.lemercier_tp03_exo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String message = new String ("Bonjour IF26 !");
        TextView tx = (TextView) findViewById(R.id.message);
        tx.setText(message);



    }
}
