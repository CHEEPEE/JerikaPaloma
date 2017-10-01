package jerika.com.sacbookstore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Keji's Lab on 29/09/2017.
 */

public class FragementSchoolUniform extends Fragment{
   private ListView mListViewOptionItems;
    private listAdapter mlistAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_option_item_selected_list, container, false);
        mListViewOptionItems = (ListView) rootView.findViewById(R.id.fragment_lv_item_list);
        mlistAdapter = new listAdapter(getActivity(),ItemList.convertToArrayList(ItemList.school_uniform_item_description),ItemList.convertToArrayList(ItemList.school_uniform_unit),ItemList.convertToArrayList(ItemList.school_uniform_selling_price),ItemList.schoolUniformIcons,ItemList.convertToArrayListBoolean(ItemList.avail_uniform));
        mListViewOptionItems.setAdapter(mlistAdapter);
        mlistAdapter.notifyDataSetChanged();

        return rootView;
    }
}
