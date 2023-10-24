package pl.zabrze.zs10.zegar_szachowy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SzachyActivity2 extends AppCompatActivity {
    private TextView textview1;
    private TextView textview2;
    private Button button;
    private Gracz gracz1;
    private Gracz gracz2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szachy2);
        textview1 = findViewById(R.id.textView2);
        textview2 = findViewById(R.id.textView3);
        button = findViewById(R.id.button);
        gracz1 = new Gracz(true,textview1);
        gracz2 = new Gracz(false,textview2);
        gracz1.startCzas();
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(gracz1.isDzialajacy()){
                            gracz2.startCzas();
                            gracz1.stopCzas();
                            button.setText("Gracz 2");
                        }
                        else{
                            gracz1.startCzas();
                            gracz2.stopCzas();
                            button.setText("Gracz 1");
                        }
                    }
                }
        );
        //TODO znikanie po czsie przycisku
        //TODO dodawanie nowych sekund za wykonanie ruchu
        //TODO wygląd bardziej szachowy

    }
}
