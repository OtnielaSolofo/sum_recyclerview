package solofo.otniela.scrolltotal;


import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>
{

    private final Context context;
    ListModelItemListener listener;
    public ArrayList<ModelItem> items;

    public Adapter(@NonNull Context context,
                           ArrayList<ModelItem> items,
                           ListModelItemListener listener)
    {

        this.context = context;
        this.items = items;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {

        ModelItem modelItem = items.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClicked(modelItem);
            }
        });

        holder.text_description.setText( String.valueOf(modelItem.id) + " : " + modelItem.texteDescription );

    }

    class ViewHolder extends RecyclerView.ViewHolder
    {

        private final TextView text_description;

        public ViewHolder(View view)
        {
            super(view);

            text_description = view.findViewById(R.id.idText);
        }

    }

    @Override
    public int getItemCount()
    {
        return items.size();
    }

    public interface ListModelItemListener
    {
        void onItemClicked(ModelItem ModelItem);
    }
}
