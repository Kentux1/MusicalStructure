package example.android.com.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find the views that show the selected activity
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        TextView playlists = (TextView) findViewById(R.id.playlists);
        TextView artists = (TextView) findViewById(R.id.artists);
        TextView albums = (TextView) findViewById(R.id.albums);

        if (nowPlaying != null) {
            //Set a click listener on this View
            nowPlaying.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when this view is clicked
                @Override
                public void onClick(View view) {
                    Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                    startActivity(nowPlayingIntent);
                }
            });
        }
        if (playlists != null) {
            //Set a click listener on this View
            playlists.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when this view is clicked
                @Override
                public void onClick(View view) {
                    Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                    startActivity(playlistsIntent);
                }
            });
        }
        if (artists != null) {
            //Set a click listener on this View
            artists.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when this view is clicked
                @Override
                public void onClick(View view) {
                    Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                    startActivity(artistsIntent);
                }
            });
        }
        if (albums != null) {
            //Set a click listener on this View
            albums.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when this view is clicked
                @Override
                public void onClick(View view) {
                    Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                    startActivity(albumsIntent);
                }
            });
        }

    }
}
