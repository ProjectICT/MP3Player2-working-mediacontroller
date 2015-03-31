package com.example.kenny.example_music_player;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
/**
 * Created by Kenny on 5/02/15.
 */
public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> Songs;
    private LayoutInflater songInf;

    public SongAdapter(Context c, ArrayList<Song> theSongs){
        Songs =theSongs;
        songInf=LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return Songs.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //map to Song layout
        LinearLayout songLay = (LinearLayout)songInf.inflate
                (com.example.musicplayer.R.layout.song, parent, false);
        //get title and artist views
        TextView songView = (TextView)songLay.findViewById(com.example.musicplayer.R.id.song_title);
        TextView artistView = (TextView)songLay.findViewById(com.example.musicplayer.R.id.song_artist);
        //get Song using position
        Song currSong = Songs.get(position);
        //get title and artist strings
        songView.setText(currSong.getTitle());
        artistView.setText(currSong.getArtist());
        //set position as tag
        songLay.setTag(position);
        return songLay;
    }

}
