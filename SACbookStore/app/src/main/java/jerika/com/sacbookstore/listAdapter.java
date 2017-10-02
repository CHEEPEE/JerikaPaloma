package jerika.com.sacbookstore;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Keji's Lab on 24/07/2017.
 */

public class listAdapter extends BaseAdapter implements Filterable {
    private Context mContext;
    private final ArrayList<String> arrayTitle;
    private final ArrayList<Boolean> arrayAvalability;
    private final ArrayList<String>  arrayUnit;
    private final ArrayList<String>  arrayPrice;
    private ArrayList<String> filteredData = null;
    private final ArrayList<Integer> img_icon;



    private static LayoutInflater inflater=null;
    public listAdapter(Context c, ArrayList<String>  Title,ArrayList<String>  unit,ArrayList<String>  price,ArrayList<Integer> icon,ArrayList<Boolean> Avalability) {
        // TODO Auto-generated constructor stub
        mContext = c;

        this.arrayTitle = Title;
        this.arrayUnit = unit;
        this.arrayPrice = price;
        this.img_icon = icon;
        this.filteredData = Title;
        this.arrayAvalability = Avalability;

        inflater = ( LayoutInflater )c.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return arrayTitle.size();
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
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.item_list_single, null);
        TextView title = (TextView) rowView.findViewById(R.id.item_name);
        TextView unit = (TextView) rowView.findViewById(R.id.item_unit);
        TextView price = (TextView) rowView.findViewById(R.id.item_price);
        ImageView icon = (ImageView) rowView.findViewById(R.id.icon);
        icon.setImageResource(img_icon.get(position));
        icon.setColorFilter((ContextCompat.getColor(rowView.getContext(), R.color.grayAccent)));

        RelativeLayout availability = (RelativeLayout) rowView.findViewById(R.id.availability);

        if (!arrayAvalability.get(position)){
            availability.setBackgroundResource(R.drawable.not_active_shape_circle);
        }


        title.setText(arrayTitle.get(position));
        unit.setText(arrayUnit.get(position));
        price.setText(arrayPrice.get(position));



        return rowView;
    }


    @Override
    public Filter getFilter() {
        return null;
    }
}
