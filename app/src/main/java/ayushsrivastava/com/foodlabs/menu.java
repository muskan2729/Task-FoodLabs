package ayushsrivastava.com.foodlabs;

/**
 * Created by AYUMS19_777 on 19-Oct-18.
 */
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menu extends AppCompatActivity {

    Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_food);
             populatelistview();

    }

    private void populatelistview() {
        String food[]={"EAT PASTA RUN FASTA","Musty Mushroom","Mac n Cheese","Basil Pasta","IT'S BURGER'S CLOCK","Veg Burger","Special Burger","Cheese Burger","Chicken Tikka Burger","TEA,COFFEE OR ME","Latte","Ice Tea","Espresso","Mocha","KEEP CALM & EAT PIZZA","Margherita","Pepper Paneer","Spicy Veg","Morinora","SAVE ROOM FOR DESSERTS","Molten Chocolate","Buttermilk Pie","Royal Cocktail Shake","Banana Shake"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.list_it1,food);
        ListView listView=(ListView)findViewById(R.id.listk);
        listView.setAdapter(adapter);
    }
}