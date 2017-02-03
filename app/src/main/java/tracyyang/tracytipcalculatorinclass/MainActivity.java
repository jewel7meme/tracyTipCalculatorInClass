package tracyyang.tracytipcalculatorinclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare variables
    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize variables
        etBill = (EditText) findViewById(R.id.editTextBill);
        etNumParty = (EditText) findViewById(R.id.editTextNumber);
        tvTotalTip = (TextView) findViewById(R.id.totalTipTextView);
        tvTipPerPerson = (TextView) findViewById(R.id.tipPerPersonTextView);
    }
    

    public void onClickBtnCalculateTip(View view) {

        double totalTip = 0;
        double tipPerPerson = 0;
        int numParty = 0;

        String billInput = etBill.getText().toString();
        totalTip = 0.1*(Double.parseDouble(billInput));

        String numPartyInput = etNumParty.getText().toString();
        numParty = Integer.parseInt(numPartyInput);

        tipPerPerson = totalTip/numParty;

        tvTotalTip.setText("Total Bill: " + totalTip);
        tvTipPerPerson.setText("Tip Per Person: " + tipPerPerson);
    }
}
