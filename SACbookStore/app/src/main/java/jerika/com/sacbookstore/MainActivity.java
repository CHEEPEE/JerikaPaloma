package jerika.com.sacbookstore;

import android.app.Activity;
import android.app.Dialog;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    private int[] layoutId = {R.id.rel_allitems,R.id.rel_supplies,R.id.rel_book,R.id.rel_crim,R.id.rel_nursing,R.id.rel_others,R.id.rel_peuniform,R.id.rel_uniform};
    private int[] imgViewId  = {R.id.img_all_items,R.id.img_supp,R.id.img_book,R.id.img_crim,R.id.img_nursing,R.id.img_other,R.id.img_peuniform,R.id.img_uniform};
    final RelativeLayout[] relativeLayouts = new RelativeLayout[layoutId.length];
    final ImageView[] imageViews = new ImageView[imgViewId.length];
    ListView listView;

    final ArrayList<ItemListModels> itemListModelses = new ArrayList<>();
    final ArrayList<ItemListModels> itemListModelsesfiltered = new ArrayList<>();
    listAdapter listAdapterdec;
    listAdapterSearch listAdapterSearch;
    Toolbar toolbar;

    private int prevNumber = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("SAC Book Store");
        toolbar.setTitleTextColor((ContextCompat.getColor(getBaseContext(), R.color.white)));

        listView = (ListView) findViewById(R.id.listview_items);

        //declaring layouId and ImageView Id
        for (int i = 0; i < layoutId.length ;i++){
            relativeLayouts[i] = (RelativeLayout) findViewById(layoutId[i]);
            imageViews[i] = (ImageView) findViewById(imgViewId[i]);
            activateIcon(relativeLayouts[i],imageViews[i],i);
        }
        relativeLayouts[0].setBackgroundResource(R.drawable.shape_circle_green);
        imageViews[0].setColorFilter((ContextCompat.getColor(getBaseContext(), R.color.white)));
        listAdapterdec = new listAdapter(MainActivity.this,ItemList.all_des(),ItemList.all_unit(),ItemList.all_price(),ItemList.allIcons(),ItemList.all_avai());
        listView.setAdapter(listAdapterdec);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);
        // Locate the search item
        MenuItem searchItem = menu.findItem(R.id.menu_search);
        ItemList.all_des();
        // Retrieves the SearchView from the search menu item
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                itemListModelses.clear();

                for (int i = 0; i<ItemList.all_des().size();i++){
                    ItemListModels itemListModels = new ItemListModels();
                    itemListModels.setDes(ItemList.all_des().get(i));
                    itemListModels.setUnit(ItemList.all_unit().get(i));
                    itemListModels.setPrice(ItemList.all_price().get(i));
                    itemListModels.setAvailability(ItemList.all_avai().get(i));
                    itemListModels.setIcons(ItemList.allIcons().get(i));

                    itemListModelses.add(itemListModels);

                }

                listAdapterSearch = new listAdapterSearch(MainActivity.this,itemListModelses,ItemList.icons[0]);
                listView.setAdapter(listAdapterdec);


                itemListModelsesfiltered.clear();
                for (int i = 0; i<itemListModelses.size();i++){
                    if (itemListModelses.get(i).getDes().toLowerCase().contains(newText.toLowerCase())){
                        ItemListModels itemListModels = new ItemListModels();
                        itemListModels.setDes(itemListModelses.get(i).getDes());
                        itemListModels.setPrice(itemListModelses.get(i).getPrice());
                        itemListModels.setUnit(itemListModelses.get(i).getUnit());
                        itemListModels.setAvailability(itemListModelses.get(i).getAvail());
                        itemListModels.setIcons(itemListModelses.get(i).getIcons());

                        itemListModelsesfiltered.add(itemListModels);

                    }
                }
                Collections.sort(itemListModelsesfiltered, new Comparator<ItemListModels>(){
                    public int compare(ItemListModels s1, ItemListModels s2) {
                        return s1.getDes().compareToIgnoreCase(s2.getDes());
                    }
                });


                listAdapterSearch = new listAdapterSearch(MainActivity.this,itemListModelsesfiltered,ItemList.icons[0]);
                listView.setAdapter(listAdapterSearch);
                listAdapterSearch.notifyDataSetChanged();

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                      //showDialogOnclick(MainActivity.this,position);
                    }
                });




                return true;
            }
        });

        return true;
    }
    //activate icon using onClickListener
    private void activateIcon(final RelativeLayout relativeLayout,final ImageView imageView,final int i) {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportActionBar().setTitle(ItemList.categories[i]);
                relativeLayout.setBackgroundResource(R.drawable.shape_circle_green);
                imageView.setColorFilter((ContextCompat.getColor(getBaseContext(), R.color.white)));
                deActivateIcon(relativeLayouts[prevNumber],imageViews[prevNumber],i);
                setArray(i);

            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportActionBar().setTitle(ItemList.categories[i]);
                relativeLayout.setBackgroundResource(R.drawable.shape_circle_green);
                imageView.setColorFilter((ContextCompat.getColor(getBaseContext(), R.color.white)));
                deActivateIcon(relativeLayouts[prevNumber],imageViews[prevNumber],i);
                setArray(i);


            }
        });
    }

    //to Deactivate icon
    private void deActivateIcon(final RelativeLayout relativeLayout,final ImageView imageView,final int i){
        if (prevNumber==i){

        }else {
            relativeLayout.setBackgroundResource(R.drawable.shape_circle);
            imageView.setColorFilter((ContextCompat.getColor(getBaseContext(), R.color.grayAccent)));
            prevNumber = i;
        }

    }
    private void setArray(int i){
        if (i==0){

            listAdapterdec = new listAdapter(MainActivity.this,ItemList.all_des(),ItemList.all_unit(),ItemList.all_price(),ItemList.allIcons(),ItemList.all_avai());
            listView.setAdapter(listAdapterdec);
            listAdapterdec.notifyDataSetChanged();

        }
         else if (i==1){
            listAdapterdec = new listAdapter(MainActivity.this,ItemList.convertToArrayList(ItemList.school_supplies_item_description),ItemList.convertToArrayList(ItemList.school_supplies_unit),ItemList.convertToArrayList(ItemList.school_supplies_selling_price),ItemList.suppliesIcon,ItemList.convertToArrayListBoolean(ItemList.availability_supplies));
            listView.setAdapter(listAdapterdec);
            listAdapterdec.notifyDataSetChanged();

        }else if (i==2){
            listAdapterdec = new listAdapter(MainActivity.this,ItemList.convertToArrayList(ItemList.books_manuals_item_description),ItemList.convertToArrayList(ItemList.books_manuals_unit),ItemList.convertToArrayList(ItemList.books_manuals_selling_price),ItemList.bookIcons,ItemList.convertToArrayListBoolean(ItemList.avai_books));
            listView.setAdapter(listAdapterdec);
            listAdapterdec.notifyDataSetChanged();

        }else if (i==3){
            listAdapterdec = new listAdapter(MainActivity.this,ItemList.convertToArrayList(ItemList.criminology_uniform_item_description),ItemList.convertToArrayList(ItemList.criminology_uniform_unit),ItemList.convertToArrayList(ItemList.criminology_uniform_selling_price),ItemList.crimUniformIcons,ItemList.convertToArrayListBoolean(ItemList.avail_crim));
            listView.setAdapter(listAdapterdec);
            listAdapterdec.notifyDataSetChanged();

        }else if(i==4){

            listAdapterdec = new listAdapter(MainActivity.this,ItemList.convertToArrayList(ItemList.nursing_uniform_item_description),ItemList.convertToArrayList(ItemList.nursing_uniform_unit),ItemList.convertToArrayList(ItemList.nursing_uniform_selling_price),ItemList.nurisingUniformIcons,ItemList.convertToArrayListBoolean(ItemList.avail_nursing_uniform));
            listView.setAdapter(listAdapterdec);
            listAdapterdec.notifyDataSetChanged();

        }else if (i==5){
            listAdapterdec = new listAdapter(MainActivity.this,ItemList.convertToArrayList(ItemList.others_item_description),ItemList.convertToArrayList(ItemList.others_unit),ItemList.convertToArrayList(ItemList.others_selling_price),ItemList.othersIcons,ItemList.convertToArrayListBoolean(ItemList.avail_others));
            listView.setAdapter(listAdapterdec);
            listAdapterdec.notifyDataSetChanged();

        }else if (i==6){
            listAdapterdec = new listAdapter(MainActivity.this,ItemList.convertToArrayList(ItemList.pe_uniform_item_description),ItemList.convertToArrayList(ItemList.pe_uniform_unit),ItemList.convertToArrayList(ItemList.pe_uniform_selling_price),ItemList.pe_uniformIcons,ItemList.convertToArrayListBoolean(ItemList.avail_pe_uniform));
            listView.setAdapter(listAdapterdec);
            listAdapterdec.notifyDataSetChanged();

        }else if (i==7){
            listAdapterdec = new listAdapter(MainActivity.this,ItemList.convertToArrayList(ItemList.school_uniform_item_description),ItemList.convertToArrayList(ItemList.school_uniform_unit),ItemList.convertToArrayList(ItemList.school_uniform_selling_price),ItemList.schoolUniformIcons,ItemList.convertToArrayListBoolean(ItemList.avail_uniform));
            listView.setAdapter(listAdapterdec);
            listAdapterdec.notifyDataSetChanged();
        }
    }
    private void toaster(String string){
        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();
    }

    private void showDialogOnclick(Activity activity, int pos){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.item_image_onclick);

        final TextView ItemName,ItemUnit,ItemPrice;
        final ImageView itemImg = (ImageView)dialog.findViewById(R.id.image_here);
        ItemName = (TextView) dialog.findViewById(R.id.title);
        ItemUnit = (TextView) dialog.findViewById(R.id.item_unit);
        ItemPrice = (TextView) dialog.findViewById(R.id.price);

        ItemName.setText(itemListModelsesfiltered.get(pos).getDes());
        ItemUnit.setText(itemListModelsesfiltered.get(pos).getUnit());
        ItemPrice.setText(itemListModelsesfiltered.get(pos).getPrice());
        itemImg.setImageResource(itemListModelsesfiltered.get(pos).getIcons());


        dialog.show();

    }
}
