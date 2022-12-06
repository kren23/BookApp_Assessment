package rgu.appdev.bookapp_assessment.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import rgu.appdev.bookapp_assessment.Model.bookModel;
import rgu.appdev.bookapp_assessment.R;
import rgu.appdev.bookapp_assessment.bookOverviewActivity;

//I hate this adapter

public class bookAdapter extends RecyclerView.Adapter<bookAdapter.ViewHolder> {


    private List<bookModel> bookModelList;
    private bookOverviewActivity activity;

    public bookAdapter(bookOverviewActivity activity){
        this.activity = activity;
    }

    public void onBindViewHolder(ViewHolder holder, int position){
        bookModel item = bookModelList.get(position);
        holder.book.setText(item.getBookName());
    }

    //Method for the recycler view to understand how many things it needs to display

    //TODO fix this bloody code - it's not working for some reason. Error points to below method
    public int getItemCount(){
        Log.d("listnum", "Value: " + (bookModelList.toString()));
        return bookModelList.size();
    }

    //Small method to convert integer into bool
    private boolean convertBool(int num){
        return num!=0;
    }


    //This function wont work - no idea why
    public void setBook(List<bookModel> bookModelList) {
        this.bookModelList = bookModelList;
        notifyDataSetChanged();
    }

    //Defining the viewholder function

    public ViewHolder onCreateViewHolder(ViewGroup parent, int view){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.book_list_progress, parent, false);
        return new ViewHolder(itemView);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView book;

        ViewHolder(View view){
            super(view);
            book = view.findViewById(R.id.bookName);
        }

    }

}


