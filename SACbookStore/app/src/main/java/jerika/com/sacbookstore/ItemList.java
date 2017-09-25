package jerika.com.sacbookstore;

import java.util.ArrayList;

/**
 * Created by Keji's Lab on 23/07/2017.
 */

public class ItemList {

    public static int[] icons = {R.drawable.ic_apps_black_24dp,R.drawable.supplies,R.drawable.book,R.drawable.crim,R.drawable.nursing,R.drawable.other,R.drawable.pe_uniform,R.drawable.uniform};


    public static final String[] categories = {"All Items","Supplies","Books","Criminology Supplies","Nursing Supplies","Others","PE Uniforms","Uniforms"};

    //34
    public static final String[] school_supplies_item_description={"BALLPEN FABER CASTELL","BALLPEN HBW 2000","BALLPEN HBW MATRIX","BONDPAPER CACTUS LONG","BONDPAPER CACTUS SHORT","BROWN ENV LONG","BROWN ENV SHORT","CATTLEYA NOTES","CONSTRUCTION PAPER LONG","FASTENER PLASTIC","FILE FOLDER LONG BLUE","FILE FOLDER LONG WHITE","FILE FOLDER SHORT white","FLASH DRIVE 16GB KINGSTON","FLASH DRIVE 8GB KINGSTON","GRAPHING PAPER","HBW GLUE","ID PROTECTOR  PORTRAIT","ILLUSTRATION BOARD 1/8","INDEX CARD 3X5 (1/4)","INDEX CARD 5X8 (1/2)","INTERMEDIATE PAD","LEDGER","MANILA PAPER","MARKER PEN PILOT","PENCIL ERASER","PENCIL MONGOL #2","PLASTIC ENV LONG","RULER","SHARPENER","SIGN PEN FINE TECH","SLIDING FOLDER LONG WHITE","TEST BOOKLET","YELLOW PAD"};
    public static final String[] school_supplies_unit={"PIECE","PIECE","PIECE","REAM","REAM","PIECE","PIECE","PIECE","PACK (10 PCS)","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PACK (20 PCS)","TUBE","PIECE","PIECE","SET (20 PCS)","SET (10 PCS)","PAD","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","SET (4 PCS)","PAD"};
    public static final String[] school_supplies_selling_price={"10.00","5.00","5.00","180.00","150.00","3.00","3.00","9.00","15.00","1.00","5.00","5.00","4.00","475.00","380.00","10.00","15.00","10.00","5.00","5.00","5.00","15.00","25.00","5.00","32.00","3.00","6.00","6.00","5.00","5.00","25.00","5.00","1.25","15.00"};
    public static final Boolean[] availability_supplies = {true,false,false,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,};
    public static final ArrayList<Integer> suppliesIcon = getIcons(icons[1],school_supplies_item_description);

    //27
    public static final String[] pe_uniform_item_description={"PE T-SHIRT: 8","PE T-SHIRT: 10","PE T-SHIRT: 12","PE T-SHIRT: 14","PE T-SHIRT: 16","PE T-SHIRT: 18","PE T-SHIRT: 20","PE T-SHIRT: SMALL","PE T-SHIRT: MEDIUM","PE T-SHIRT: LARGE","PE T-SHIRT: XL","PE T-SHIRT: 2XL","PE T-SHIRT: 3XL","PE T-SHIRT: 4XL","PE JOGGING PANTS: 8","PE JOGGING PANTS: 10","PE JOGGING PANTS: 12","PE JOGGING PANTS: 14","PE JOGGING PANTS: 16","PE JOGGING PANTS: 18","PE JOGGING PANTS: 20","PE JOGGING PANTS: SMALL","PE JOGGING PANTS: MEDIUM","PE JOGGING PANTS: LARGE","PE JOGGING PANTS: XL","PE JOGGING PANTS: 2XL","PE JOGGING PANTS: 3XL"};
    public static final String[] pe_uniform_unit={"PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE"};
    public static final String[] pe_uniform_selling_price={"205.00","215.00","215.00","215.00","230.00","230.00","230.00","240.00","240.00","240.00","250.00","250.00","250.00","260.00","245.00","265.00","265.00","265.00","295.00","295.00","295.00","315.00","315.00","315.00","335.00","335.00","335.00"};
    public static final Boolean[] avail_pe_uniform = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,};
    public static final ArrayList<Integer> pe_uniformIcons = getIcons(icons[6],pe_uniform_item_description);


    //18
    public static final String[] school_uniform_item_description={"GRADE SCHOOL: POLO","GRADE SCHOOL: PANTS","GRADE SCHOOL: BLOUSE","GRADE SCHOOL: SKIRT","JUNIOR HIGH SCHOOL: POLO","JUNIOR HIGH SCHOOL: PANTS","JUNIOR HIGH SCHOOL: BLOUSE","JUNIOR HIGH SCHOOL: SKIRT","SENIOR HIGH SCHOOL: POLO","SENIOR HIGH SCHOOL: PANTS","SENIOR HIGH SCHOOL: BLOUSE","SENIOR HIGH SCHOOL: SKIRT","COLLEGE: POLO","COLLEGE: PANTS","COLLEGE: BLOUSE","COLLEGE: SKIRT","COLLEGE NECKTIE","GRADE SCHOOL NECKTIE"};
    public static final String[] school_uniform_unit={"PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE","PIECE"};
    public static final String[] school_uniform_selling_price={"230.00","225.00","235.00","230.00","250.00","285.00","250.00","250.00","260.00","300.00","260.00","260.00","260.00","290.00","270.00","255.00","25.00","75.00"};
    public static final Boolean[] avail_uniform = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,};
    public static final ArrayList<Integer> schoolUniformIcons = getIcons(icons[7],school_supplies_item_description);

    //10
    public static final String[] nursing_uniform_item_description={"CLINICAL UNIFORM - MALE","CLINICAL UNIFORM - FEMALE","CHN UNIFORM MALE/FEMALE","SCRUB SUIT MALE/FEMALE","LABORATORY GOWN","NURSING CAP ","NURSING NAMEPLATE","CLINICAL BAG","CHN BAG W/ ACCESSORIES","PANTY HOSE WHITE"};
    public static final String[] nursing_uniform_unit={"SET","SET","SET","SET","PIECE","PIECE","PIECE","PIECE","PIECE","SET","PACK"};
    public static final String[] nursing_uniform_selling_price ={"650.00","800.00","1,030.00","1,200.00","300.00","135.00","140.00","185.00","1,050.00","2,280.00","175.00"};
    public static final Boolean[] avail_nursing_uniform = {true,true,true,true,true,true,true,true,true,true,};
    public static final ArrayList<Integer> nurisingUniformIcons = getIcons(icons[4],nursing_uniform_item_description);


    //3
    public static final String[] criminology_uniform_item_description={"DEPARTMENTAL T-SHIRT","INTER T-SHIRT","BALL CAP"};
    public static final String[] criminology_uniform_unit={"PIECE","PIECE","PIECE"};
    public static final String[] criminology_uniform_selling_price={"500.00","500.00","200.00"};
    public static final Boolean[] avail_crim = {true,true,true,};
    public static final ArrayList<Integer> crimUniformIcons = getIcons(icons[3],criminology_uniform_item_description);


    //9
    public static final String[] books_manuals_item_description={"FUNDAMENTALS OF ACCOUNTING & BUSINESS MANAGEMENT","INCOME TAXATION","PARTNERSHIP & CORPOTATION ACCOUNTING","COMPOSITION OF FINGERPRINT PATTERN","FINGERPRINT CLASSIFICATION","FINGERPRINT PATTERN","PHOTOGRAPHY: NEGATIVE POSITIVE MANUAL","GENERAL CHEMISTRY LABORATORY MANUAL","TARAMDAN SA LANTIPULONG KINIRAY-A"};
    public static final String[] books_manuals_unit={"COPY","COPY","COPY","COPY","COPY","COPY","COPY","COPY","COPY"};
    public static final String[] books_manuals_selling_price={"555.00","475.00","535.00","340.00","170.00","335.00","115.00","130.00","245.00"};
    public static final Boolean[] avai_books = {true,true,true,true,true,true,true,true,true,};
    public static final ArrayList<Integer> bookIcons = getIcons(icons[2],books_manuals_item_description);

    //5
    public static final Boolean[] avail_others = {true,true,true,true,true,};
    public static final String[] others_item_description={"LOGO PATCH","ID NECKLACE","CARPASS STICKER","STOCKING","APRON W/ CAP"};
    public static final String[] others_unit={"PIECE","PIECE","PIECE","PACK","SET"};
    public static final String[] others_selling_price={"50.00","30.00","50.00","15.00","180.00"};
    public static final ArrayList<Integer> othersIcons = getIcons(icons[5],others_item_description);

    private int[] layoutId = {R.id.rel_supplies,R.id.rel_book,R.id.rel_crim,R.id.rel_nursing,R.id.rel_others,R.id.rel_peuniform,R.id.rel_uniform};


    public static  String getNumber = school_uniform_item_description.length+" "+school_uniform_unit.length+" " +school_uniform_selling_price.length+"";


    public static ArrayList<String> all_des(){
        ArrayList<String> allist_des = new ArrayList<>();

        addall(allist_des,school_supplies_item_description);
        addall(allist_des,pe_uniform_item_description);
        addall(allist_des,school_uniform_item_description);
        addall(allist_des,nursing_uniform_item_description);
        addall(allist_des,criminology_uniform_item_description);
        addall(allist_des,books_manuals_item_description);
        addall(allist_des,others_item_description);

        return allist_des;
    }

    public static ArrayList<String> all_price(){


        ArrayList<String> allist_price = new ArrayList<>();

        addall(allist_price,school_supplies_selling_price);
        addall(allist_price,pe_uniform_selling_price);
        addall(allist_price,school_uniform_selling_price);
        addall(allist_price,nursing_uniform_selling_price);
        addall(allist_price,criminology_uniform_selling_price);
        addall(allist_price,books_manuals_selling_price);
        addall(allist_price,others_selling_price);

        return allist_price;
    }

    public static ArrayList<String> all_unit(){

        ArrayList<String> allist_unit = new ArrayList<>();

        addall(allist_unit,school_supplies_unit);
        addall(allist_unit,pe_uniform_unit);
        addall(allist_unit,school_uniform_unit);
        addall(allist_unit,nursing_uniform_unit);
        addall(allist_unit,criminology_uniform_unit);
        addall(allist_unit,books_manuals_unit);
        addall(allist_unit,others_unit);


        return allist_unit;
    }
    public static ArrayList<Boolean> all_avai(){

        ArrayList<Boolean> allist_unit = new ArrayList<>();

        addallBool(allist_unit,availability_supplies);
        addallBool(allist_unit,avail_pe_uniform);
        addallBool(allist_unit,avail_uniform);
        addallBool(allist_unit,avail_nursing_uniform);
        addallBool(allist_unit,avail_crim);
        addallBool(allist_unit,avai_books);
        addallBool(allist_unit,avail_others);


        return allist_unit;
    }

    public static ArrayList<Integer> allIcons(){
        ArrayList<Integer> alllist_icons = new ArrayList<>();

        addallIcons(alllist_icons,suppliesIcon);
        addallIcons(alllist_icons,pe_uniformIcons);
        addallIcons(alllist_icons,schoolUniformIcons);
        addallIcons(alllist_icons,nurisingUniformIcons);
        addallIcons(alllist_icons,crimUniformIcons);
        addallIcons(alllist_icons,bookIcons);
        addallIcons(alllist_icons,othersIcons);

        return alllist_icons;
    }
    private static void addall(ArrayList<String> arrayList, String[] thearrays){

        for (int i = 0;i<thearrays.length; i++){
            arrayList.add(thearrays[i]);
        }

    }
    private static void addallBool(ArrayList<Boolean> arrayList, Boolean[] thearrays){

        for (int i = 0;i<thearrays.length; i++){
            arrayList.add(thearrays[i]);
        }

    }
    public static ArrayList<String> convertToArrayList(String[] string){
        ArrayList<String> arraylisthere = new ArrayList<>();

        for (int i = 0; i<string.length;i++){
            arraylisthere.add(string[i]);
        }

        return arraylisthere;
    }
    public static int  getnumberArray(String[] array){
      return array.length;
    }

    public static ArrayList<Boolean> convertToArrayListBoolean(Boolean[] string) {
        ArrayList<Boolean> arraylisthere = new ArrayList<>();

        for (int i = 0; i < string.length; i++) {
            arraylisthere.add(string[i]);
        }

        return arraylisthere;

    }
    public static ArrayList<Integer> addallIcons(ArrayList<Integer> puthere,ArrayList<Integer>Icons){


        for (int i = 0; i<Icons.size();i++){
           puthere.add(Icons.get(i));
       }

        return puthere;
    }





    public static ArrayList<Integer> getIcons(int icons, String[] getNumber){
        ArrayList<Integer> icon = new ArrayList<>();
        for (int i =0; i<getNumber.length;i++){
            icon.add(icons);
        }

        return  icon;
    }



}
