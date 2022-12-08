package pcru.phattara.arrayspinnerv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> arrList = new ArrayList<String>();
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        arrList.add("Android");
        arrList.add("iOS");
        arrList.add("Windows");
        arrList.add("Blackberry");
        arrList.add("Ubuntu");
        arrList.add("Linux");
        arrList.add("Mac OS");
        ArrayAdapter<String> arrAd = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrList);
        spin.setAdapter(arrAd);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, String.valueOf("Your Selected : "+arrList.get(position)), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, String.valueOf("Your Selected Empty"), Toast.LENGTH_SHORT).show();
            }
        });
    }
}