package jerika.com.sacbookstore;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Keji's Lab on 29/09/2017.
 */

public class FragementAllItems extends Fragment{
   private ListView mListViewOptionItems;
    private listAdapter mlistAdapter;
    final ArrayList<ItemListModels> itemListModelses = new ArrayList<>();
    private listAdapterSearch listAdapterSearch;
    final ArrayList<ItemListModels> itemListModelsesfiltered = new ArrayList<>();
    EditText search;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_option_item_selected_list_allitems, container, false);
        mListViewOptionItems = (ListView) rootView.findViewById(R.id.fragment_lv_item_list);
        getlist("".toString(),mlistAdapter,mListViewOptionItems,getActivity(),itemListModelses,listAdapterSearch,itemListModelsesfiltered);
        search = (EditText) rootView.findViewById(R.id.search_bar);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                getlist(s.toString(),mlistAdapter,mListViewOptionItems,getActivity(),itemListModelses,listAdapterSearch,itemListModelsesfiltered);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        return rootView;
    }

    public static class searched{
        public static String query = "";

    }
    public static void getlist(String s,listAdapter mlistAdapter, ListView mListViewOptionItems, Context c,
                               ArrayList<ItemListModels> itemListModelses, listAdapterSearch listAdapterSearch,ArrayList<ItemListModels> itemListModelsesfiltered){
        mlistAdapter = new listAdapter(c,ItemList.all_des(),ItemList.all_unit(),ItemList.all_price(),ItemList.allIcons(),ItemList.all_avai());
        mListViewOptionItems.setAdapter(mlistAdapter);


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

        listAdapterSearch = new listAdapterSearch(c,itemListModelses,ItemList.icons[0]);
        mListViewOptionItems.setAdapter(listAdapterSearch);
        itemListModelsesfiltered.clear();
        for (int i = 0; i<itemListModelses.size();i++){
            if (itemListModelses.get(i).getDes().toLowerCase().contains(s.toLowerCase())){
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
        listAdapterSearch = new listAdapterSearch(c,itemListModelsesfiltered,ItemList.icons[0]);
        mListViewOptionItems.setAdapter(listAdapterSearch);
        listAdapterSearch.notifyDataSetChanged();
        mlistAdapter.notifyDataSetChanged();
    }

}
