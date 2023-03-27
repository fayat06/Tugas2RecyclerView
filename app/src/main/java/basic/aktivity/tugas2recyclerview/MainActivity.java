package basic.aktivity.tugas2recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    public String Data_Diri [] ={"Fayat Zabihullah", "12150112066", "Teknik Informatika", "Fakultas Sains Dan Teknologi", "Uin Suska Riau"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView) findViewById(R.id.ListDtDr);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Data_Diri);

        listView.setAdapter(adapter);


    }
}