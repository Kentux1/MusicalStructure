package example.android.com.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        TextView artist = (TextView) findViewById(R.id.artist);
        if (artist != null) {
            //Set a click listener on this View
            artist.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when this view is clicked
                @Override
                public void onClick(View view) {
                    Intent artistIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                    startActivity(artistIntent);
                }
            });
        }
    }
}
