package css.cis3334.heartratetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static css.cis3334.heartratetracker.MainActivity.HEARTRATE_KEY;

public class HeartDetailActivity extends AppCompatActivity {

    TextView tvPulse;
    TextView tvRange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_detail);

        tvPulse = (TextView) findViewById(R.id.textViewPulseDetail);
        tvRange = (TextView) findViewById(R.id.textViewRange);

        Bundle extras = getIntent().getExtras();
        HeartRate hr = (HeartRate) extras.getSerializable(MainActivity.HEARTRATE_KEY);
        //textViewDescription.setText(orderedPizza.toString());
        tvPulse.setText(hr.getPulse().toString());
        tvRange.setText(hr.getRangeName());

    }
}
