package com.example.chamikanandasiri.interactivebookreader;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

import java.io.File;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LibraryActivity extends AppCompatActivity {

    private ImageButton lib_searchButton, lib_contentRemoveButton, del_closeButton;
    private Button del_deleteButton, con_confirmButton, con_cancelButton;
    private ListView del_listView;
    private EditText lib_searchText;
    private Dialog deletePopup, confirmPopup;

    private static String selectedBook;

    private DataBaseHelper dataBaseHelper;
    private BookHandler bookHandler;
    private ContentHandler contentHandler;
    private ToastManager toastManager;

    RecyclerView recview;
    myadapter adapter;

    private String TAG = "Test";
    String currentTheme;
    private ArrayList<SimpleBookObject> displayingBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sharedPreferences = this.getSharedPreferences("sharedPrefs", MODE_PRIVATE);
        currentTheme = sharedPreferences.getString("Theme", "Light");
        if (currentTheme.equals("Light")) {
            setTheme(R.style.LightTheme);
        } else if (currentTheme.equals("Dark")) {
            setTheme(R.style.DarkTheme);
        }

        setContentView(R.layout.activity_view);

        recview = (RecyclerView) findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<fileinfomodel> options =
                new FirebaseRecyclerOptions.Builder<fileinfomodel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("mydocuments"), fileinfomodel.class)
                        .build();

        adapter=new myadapter(options);
        recview.setAdapter(adapter);
        recview.setItemAnimator(null);



//        lib_commentButton.setOnClickListener(v->{
//            Intent intent = new Intent(this,StorageActivity.class);
//            intent.putExtra("bookComment",true);
//            intent.putExtra("type","comment");
//            startActivity(intent);
//        });
//        lib_commentButton.setVisibility(View.GONE);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }


}


