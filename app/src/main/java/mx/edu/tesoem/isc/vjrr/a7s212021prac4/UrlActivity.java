package mx.edu.tesoem.isc.vjrr.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class UrlActivity extends AppCompatActivity {

    ImageView MiImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        MiImagen = findViewById(R.id.MiniImagen);
        Picasso.get()
                .load("https://i0.wp.com/europeangaming.eu/portal/wp-content/uploads/2020/04/faze-clan.jpg?resize=1000%2C600&ssl=1")
                .fit()
                .error(R.mipmap.ic_launcher_round)
                .into(MiImagen);

    }
}