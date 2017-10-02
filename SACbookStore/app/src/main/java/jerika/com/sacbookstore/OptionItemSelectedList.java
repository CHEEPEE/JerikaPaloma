package jerika.com.sacbookstore;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class OptionItemSelectedList extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private String pageTitle;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private int pageNum = 3;
    listAdapter listAdapter;
    FloatingActionButton searchFloat;


    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_item_selected_list);
      /*  final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        searchFloat = (FloatingActionButton) findViewById(R.id.floatingActionButton);


        Bundle bundle = getIntent().getExtras();
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        ;

        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setCurrentItem(bundle.getInt("currentItem"));
        getSupportActionBar().setTitle(mSectionsPagerAdapter.getPageTitle(bundle.getInt("currentItem")));
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 7){
                    searchFloat.setVisibility(View.INVISIBLE);
                }
                getSupportActionBar().setTitle(mSectionsPagerAdapter.getPageTitle(position));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        searchFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewPager.setCurrentItem(7);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_option_item_selected_list, menu);



        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    FragementSupplies fragementSupplies = new FragementSupplies();
                    return fragementSupplies;

                case 1:
                    FragementPEUniform fragementPEUniform = new FragementPEUniform();
                    return fragementPEUniform;
                case 2:
                   FragementSchoolUniform fragementSchoolUniform = new FragementSchoolUniform();
                    return fragementSchoolUniform;
                case 3:
                    FragementNurisngUniformAccessories fragementNurisngUniformAccessories = new FragementNurisngUniformAccessories();
                    return  fragementNurisngUniformAccessories;
                case 4:
                    FragementCriminologyUniformAccessories fragementCriminologyUniformAccessories = new FragementCriminologyUniformAccessories();
                    return fragementCriminologyUniformAccessories;
                case 5:
                   FragementBookAndManuals fragementBookAndManuals = new FragementBookAndManuals();
                    return fragementBookAndManuals;
                case 6:
                    FragementOthers fragementOthers = new FragementOthers();
                    return fragementOthers;
                case 7:
                    FragementAllItems fragementAllItems = new FragementAllItems();
                    return fragementAllItems;
                default: return null;
            }


        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 8;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    pageTitle = "test1";
                    return "SCHOOL SUPPLIES";
                case 1:
                    pageTitle = "test2";
                    return "PE UNIFORM";
                case 2:
                    pageTitle = "SCHOOL UNIFORM";
                    return "SCHOOL UNIFORM";
                case 3:
                    return "NURSING UNIFORMS AND ACCESSORIES";
                case 4:
                    return "CRIMINOLOGY UNIFORM AND ACCESSORIES";
                case 5:
                    return "BOOKS AND MANUALS";
                case 6:
                    return "OTHERS";
                case 7:
                    return "ALL ITEMS";

            }
            return null;
        }
    }

    public static class getTitle{
        public static String pageTitle = "";
    }



}
