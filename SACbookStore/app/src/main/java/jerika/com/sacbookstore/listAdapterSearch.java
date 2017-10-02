package jerika.com.sacbookstore;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Keji's Lab on 24/07/2017.
 */

public class listAdapterSearch extends BaseAdapter {
    private Context mContext;
    ArrayList<ItemListModels> items = new ArrayList<>();
    private ArrayList<String> filteredData = null;
    private final int img_icon;



    private static LayoutInflater inflater=null;
    public listAdapterSearch(Context c,ArrayList<ItemListModels> itemListModels,int Icon) {
        // TODO Auto-generated constructor stub
        mContext = c;
        this.img_icon = Icon;
        this.items = itemListModels;


        inflater = ( LayoutInflater )c.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        ItemListModels itemListModels = items.get(position);
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.item_list_single, null);
        TextView title = (TextView) rowView.findViewById(R.id.item_name);
        TextView unit = (TextView) rowView.findViewById(R.id.item_unit);
        TextView price = (TextView) rowView.findViewById(R.id.item_price);
        ImageView icon = (ImageView) rowView.findViewById(R.id.icon);

        RelativeLayout getAvail = (RelativeLayout) rowView.findViewById(R.id.availability);
        if (!itemListModels.getAvail()){
            getAvail.setBackgroundResource(R.drawable.not_active_shape_circle);
        }
        icon.setImageResource(itemListModels.getIcons());
        icon.setColorFilter((ContextCompat.getColor(rowView.getContext(), R.color.grayAccent)));

        title.setText(itemListModels.getDes());
        unit.setText(itemListModels.getUnit());
        price.setText(itemListModels.getPrice());

        return rowView;
    }




}
