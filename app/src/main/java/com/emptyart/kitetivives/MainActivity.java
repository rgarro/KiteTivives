package com.emptyart.kitetivives;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.util.Log;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 * from Barbados northshore caves where satan waits the apocalipse
 * you can sail to Monrovia ...
 * En Martinica y Guadalupe ponian arenas del Irazu para cavar pozos
 * electricos con diamantes y hacer brotar agua
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //choosing da beach
        Button btnNext = (Button) findViewById(R.id.my_button);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner = (Spinner) findViewById(R.id.my_spinner);
                String spinnerValue = spinner.getSelectedItem().toString();
                Log.d("beach_code", spinnerValue);
                Intent intent = new Intent(MainActivity.this, SurfLanding.class);
                intent.putExtra("beach_code", spinnerValue);
                startActivity(intent);
            }
        });
    }

}
