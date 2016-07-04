package com.example.janerubygrissom.bookshelf;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Array mBookList;

    BaseAdapter mBookAdapter;
}



public View getView(int position, View convertView, ViewGroup parent){
        View view=convertView;
        if(view==null){
        LayoutInflater inflater=(LayoutInflater)MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(android.R.layout.simple_list_item_2,null);
        view=inflater.inflate(R.layout.listtemplate,null);
        }
        TextView textview1 = (TextView) view.findViewById(R.id.textview1);
        TextView textview2 = (TextView) view.findViewById(R.id.textview2);
        ImageView img_view=(ImageView)view.findViewById(R.id.imgview);
        textview1.setText("Title: "+mBookList.get(position).getTitle());
        textview2.setText("Author: "+mBookList.get(position).getAuthor());
        img_view.setImageResource(mBookList.get(position).getResourceId());

        return view;
        }

public View getView(int position, View convertView, ViewGroup parent, AdapterView mListView) {
    mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView txt1 = (TextView) view.findViewById(android.R.id.text1);
            TextView txt2 = (TextView) view.findViewById(android.R.id.text2);
            txt1.setTextColor(Color.parseColor("#FF0000"));
            txt2.setTextColor(Color.parseColor("#FF0000"));
        }


        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        }


        //Method to generate a list of Books
        private List<Books> generateBooks(ArrayList Books) {
            return null;
        }

        {
            List<Books> books = new ArrayList<>();

            books.add(new Books("Apples Book", "Brad"));
            books.add(new Books("Cats Book", "Ryan"));
            books.add(new Books("Eagles Book", "Kate"));
            books.add(new Books("Strawberries Cathy", "Brad"));
            books.add(new Books("Dogs Book", "Tom"));
            books.add(new Books("Ants Book", "Zane"));
            books.add(new Books("Apples Book", "Brad"));
            books.add(new Books("Cats Book", "Ryan"));
            books.add(new Books("Eagles Book", "Kate"));
            books.add(new Books("Strawberries Cathy", "Brad"));
            books.add(new Books("Dogs Book", "Tom"));
            books.add(new Books("Ants Book", "Zane"));

            return Books;

        }
    }