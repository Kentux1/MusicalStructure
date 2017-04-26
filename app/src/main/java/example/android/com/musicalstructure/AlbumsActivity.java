package example.android.com.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        TextView album = (TextView) findViewById(R.id.album);
        if (album != null) {
            //Set a click listener on this View
            album.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when this view is clicked
                @Override
                public void onClick(View view) {
                    Intent albumIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                    startActivity(albumIntent);
                }
            });
        }
    }
}

