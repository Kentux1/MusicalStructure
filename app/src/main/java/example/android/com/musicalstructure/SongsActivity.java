package example.android.com.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        TextView song = (TextView) findViewById(R.id.song);
        if (song != null) {
            //Set a click listener on this View
            song.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when this view is clicked
                @Override
                public void onClick(View view) {
                    Intent songIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                    startActivity(songIntent);
                }
            });
        }
    }
}
