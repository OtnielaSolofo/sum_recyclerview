package solofo.otniela.scrolltotal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelItem> modelItems;
    TextView sumItem;
    RecyclerView recyclerView;
    Adapter adapter;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        sumItem = findViewById(R.id.sumItem);
        recyclerView = findViewById(R.id.recyclerView);
        
        modelItems = new ArrayList<>();
        
        ModelItem modelItem1 = new ModelItem(1 , "text 1");
        ModelItem modelItem2 = new ModelItem(2 , "text 2");
        ModelItem modelItem3 = new ModelItem(3 , "text 3");
        ModelItem modelItem4 = new ModelItem(4 , "text 4");
        ModelItem modelItem5 = new ModelItem(5 , "text 5");
        ModelItem modelItem6 = new ModelItem(6 , "text 6");
        ModelItem modelItem7 = new ModelItem(7 , "text 7");

        ModelItem modelItem8 = new ModelItem(8 , "text 8");
        ModelItem modelItem9 = new ModelItem(9 , "text 9");
        ModelItem modelItem10 = new ModelItem(10 , "text 10");
        ModelItem modelItem11= new ModelItem(11, "text 11");
        ModelItem modelItem12 = new ModelItem(12 , "text 12");
        ModelItem modelItem13 = new ModelItem(13 , "text 13");
        ModelItem modelItem14 = new ModelItem(14 , "text 14");

        ModelItem modelItem15 = new ModelItem(15 , "text 15");
        ModelItem modelItem16 = new ModelItem(16 , "text 16");
        ModelItem modelItem17 = new ModelItem(17 , "text 17");
        ModelItem modelItem18 = new ModelItem(18 , "text 18");
        ModelItem modelItem19 = new ModelItem(19 , "text 19");
        ModelItem modelItem20 = new ModelItem(20 , "text 20");
        ModelItem modelItem21 = new ModelItem(21 , "text 21");
        
        modelItems.add( modelItem1 );
        modelItems.add( modelItem2 );
        modelItems.add( modelItem3 );
        modelItems.add( modelItem4 );
        modelItems.add( modelItem5 );
        modelItems.add( modelItem6 );
        modelItems.add( modelItem7 );

        modelItems.add( modelItem8 );
        modelItems.add( modelItem9 );
        modelItems.add( modelItem10 );
        modelItems.add( modelItem11 );
        modelItems.add( modelItem12 );
        modelItems.add( modelItem13 );
        modelItems.add( modelItem14 );

        modelItems.add( modelItem15 );
        modelItems.add( modelItem16 );
        modelItems.add( modelItem17 );
        modelItems.add( modelItem18 );
        modelItems.add( modelItem19 );
        modelItems.add( modelItem20 );
        modelItems.add( modelItem21 );
        
        initDataInAdapter( modelItems );

        sumItem.setText(String.valueOf( "Sum : " + sumItem( modelItems ) ));
        
    }

    private int sumItem(ArrayList<ModelItem> modelItemArrayList){
        int sum = 0;

        for(ModelItem item : modelItemArrayList){
            sum += item.id;
        }

        return sum;
    }


    private void initDataInAdapter(ArrayList<ModelItem> ModelItemArrayList) {

        adapter = new Adapter(this, ModelItemArrayList, new Adapter.ListModelItemListener() {

            @Override
            public void onItemClicked(ModelItem ModelItem) {

            }

        });

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }
}