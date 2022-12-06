package rgu.appdev.bookapp_assessment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import rgu.appdev.bookapp_assessment.Adapter.bookAdapter;
import rgu.appdev.bookapp_assessment.Model.bookModel;

public class bookOverviewActivity extends AppCompatActivity {

    public RecyclerView booksRecyclerView;
    public bookAdapter booksAdapter;

    private List<bookModel> bookList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_overview);

        //Defining the recycler view
        booksRecyclerView = findViewById(R.id.booksRecyclerView);
        booksRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        booksAdapter = new bookAdapter((this));
        booksRecyclerView.setAdapter(booksAdapter);

        //setting dummy data
        bookModel book = new bookModel();
        book.setBookName("Test");

        //Manually adding data for test
        bookList.add(book);
        bookList.add(book);
        bookList.add(book);
        bookList.add(book);

        //Code doesn't like that the method isn't status, but if i change it then it also breaks
        //bookAdapter.setBook(bookList);

    }
}