package cip.ruben.convertidor;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText et_euros,et_dolares;
	private Button b_convertir,b_borrar;
	final DecimalFormat df=	 new DecimalFormat(".##");
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et_euros = (EditText)findViewById(R.id.et_cantidad);
        et_dolares= (EditText)findViewById(R.id.et_dolares);
        
        b_convertir = (Button)findViewById(R.id.bt_convertir);
        
        b_convertir.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				double resultado =((Double.parseDouble(et_euros.getText().toString())*(1.22600)));
				et_dolares.setText(String.valueOf(df.format(resultado)));
			}
		});

        b_borrar = (Button)findViewById(R.id.b_borrar);
        
        b_borrar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				et_euros.setText(" ");
				et_dolares.setText(" ");
			}
		});
        
    }
}
