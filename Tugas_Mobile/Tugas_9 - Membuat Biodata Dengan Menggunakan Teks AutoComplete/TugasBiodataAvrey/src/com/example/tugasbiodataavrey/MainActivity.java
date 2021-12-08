package com.example.tugasbiodataavrey;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity  implements TextWatcher, OnClickListener{
	
	//Called when activity is first created
	
	TextView nama, alamat;
	AutoCompleteTextView editAgama, editKota, editHobi;
	Button hapus;
	
	String[] itemAgama = {"Islam", "Kristen", "Hindu", "Budha",};
	String[] itemKota = {"Surabaya", "Malang", "Solo", "Madiun", "Mojokerto"
			, "Sukoharjo", "Magelang"};
	String[] itemHobi = {"Sepakbola", "Futsal", "Makan", "Tidur", "Bulu tangkis"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		nama = (TextView) findViewById(R.id.enternama);
		alamat = (TextView) findViewById(R.id.enteralamat);
		
		editAgama = (AutoCompleteTextView) findViewById(R.id.enteragama);
		editAgama.addTextChangedListener(this);
		editAgama.setAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_dropdown_item_1line, itemAgama));
		
		editKota = (AutoCompleteTextView) findViewById(R.id.enterkota);
		editKota.addTextChangedListener(this);
		editKota.setAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_dropdown_item_1line, itemKota));
		
		editHobi = (AutoCompleteTextView) findViewById(R.id.enterhobi);
		editHobi.addTextChangedListener(this);
		editHobi.setAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_dropdown_item_1line, itemHobi));
		
		hapus = (Button) findViewById(R.id.tombolHapus);
		hapus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				nama.setText("");
				alamat.setText("");
				editKota.setText("");
				editAgama.setText("");
				editHobi.setText("");
				nama.requestFocus();
			}
		});
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void afterTextChanged(Editable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}
