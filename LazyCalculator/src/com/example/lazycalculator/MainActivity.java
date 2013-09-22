package com.example.lazycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// Helpers
	private void addToDisplay(String c) {
		TextView textView = (TextView) findViewById(R.id.textView1);
		CharSequence previous = textView.getText();
	    textView.setText(previous + c);
	}
	private void addToOperand(int val) {
		
	}
	
	// Insert Numbers
	public void insertDecimal(View view) {
		TextView textView = (TextView) findViewById(R.id.textView1);
		CharSequence previous = textView.getText();
		if (previous.length() == 0)
			return;
		char last_char = previous.charAt(previous.length()-1);
		if (last_char == '+' ||
			last_char == '-' ||
			last_char == '/' ||
			last_char == '*')
			return;
		addToDisplay(".");
	}
	public void addParenthesis(View view) {
		Button b = (Button)view;
		String p = b.getText().toString();
		addToDisplay(p);
		if (p == "(")
			b.setText(")");
		else
			b.setText("(");
	}
	public void insert0(View view) {
		addToDisplay("0");
		addToOperand(0);
	}
	public void insert1(View view) {
		addToDisplay("1");
		addToOperand(1);
	}
	public void insert2(View view) {
		addToDisplay("2");
		addToOperand(2);
	}
	public void insert3(View view) {
		addToDisplay("3");
		addToOperand(3);
	}
	public void insert4(View view) {
		addToDisplay("4");
		addToOperand(4);
	}
	public void insert5(View view) {
		addToDisplay("5");
		addToOperand(5);
	}
	public void insert6(View view) {
		addToDisplay("6");
		addToOperand(6);
	}
	public void insert7(View view) {
		addToDisplay("7");
		addToOperand(7);
	}
	public void insert8(View view) {
		addToDisplay("8");
		addToOperand(8);
	}
	public void insert9(View view) {
		addToDisplay("9");
		addToOperand(9);
	}
	
	
	// Delete stuff
	public void backspace(View view) {
		TextView textView = (TextView) findViewById(R.id.textView1);
		CharSequence previous = textView.getText();
		if (previous.length() != 0) {
			previous = previous.subSequence(0, previous.length()-1);
		}
	    textView.setText(previous);
	}
	public void clear(View view) {
		TextView textView = (TextView) findViewById(R.id.textView1);
	    textView.setText("");
	}
	
	// Do Math
	public void add(View view) {
		addToDisplay("+");
	}
	public void subtract(View view) {
		addToDisplay("-");
	}
	public void multiply(View view) {
		addToDisplay("*");
	}
	public void divide(View view) {
		addToDisplay("/");
	}
	public void solve(View view) {
		TextView textView = (TextView) findViewById(R.id.textView1);
		switch (1 + (int)(Math.random() * ((10-1) + 1))) {
		case 1:
			textView.setText("Get a real calculator.");
			break;
		case 2:
			textView.setText("Maybe some other time.");
			break;
		case 3:
			textView.setText("...");
			break;
		case 4:
			String s = textView.getText().toString();
			String r = new StringBuilder(s).reverse().toString();
			textView.setText(r);
			break;
		case 5:
			textView.setText("You can't do that yourself?");
			break;
		case 6:
			textView.setText("Too easy.");
			break;
		case 7:
			textView.setText("Gimme a sec.");
			break;
		case 8:
			textView.setText("Log in to see the answer.");
			break;
		case 9:
			textView.setText("Play Candy Crush Saga!");
			break;
		case 10:
			textView.setText("Probably 0.");
			break;
		}
	}
}
