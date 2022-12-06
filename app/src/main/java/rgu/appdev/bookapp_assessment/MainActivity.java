package rgu.appdev.bookapp_assessment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //----------------------------Navigation / buttons  ----------------------------------

    //Button that launches the Book Overview activity
    public void launchBookOverview(View v) {
        Intent loadBookOverview = new Intent(this, bookOverviewActivity.class);
        startActivity(loadBookOverview);
    }

    //Button that launches the Book search activity
    public void launchBookSearch(View v) {
        //launch book search
        Intent loadBookSearch = new Intent(this, bookSearchActivity.class);
        startActivity(loadBookSearch);
    }

    //Button that launches the Bookstore search activity
    public void launchBookstoreSearch(View v) {
        //launch bookstore search
        Intent loadBookstoreSearch = new Intent(this, bookStoreSearchActivity.class);
        startActivity(loadBookstoreSearch);
    }

    //Button that takes you back to home
    public void goHome(View v) {
        Intent loadHomepage = new Intent(this, MainActivity.class);
        startActivity(loadHomepage);
    }

}