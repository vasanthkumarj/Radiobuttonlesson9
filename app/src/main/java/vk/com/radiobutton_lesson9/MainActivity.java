package vk.com.radiobutton_lesson9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.result_text);
    }

    public void selectFruit(View view) {
        RadioButton fruitChoice = (RadioButton) view;
        boolean checked = fruitChoice.isChecked();
        if(checked)
        {
            resultText.setText(fruitChoice.getText().toString());
        }
    }
}
