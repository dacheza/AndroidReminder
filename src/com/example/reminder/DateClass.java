package com.example.reminder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Oleksandra on 31.03.2015.
 */
public class DateClass {



    static  ArrayList<String> liste_gold_String = new ArrayList<String>();
    static  ArrayList<String> liste_blue_String = new ArrayList<String>();
    static  ArrayList<String> liste_green_String = new ArrayList<String>();
    static  ArrayList<String> liste_black_String = new ArrayList<String>();

    static  ArrayList<Date>  liste_gold_search = new ArrayList<Date>();
    static  ArrayList<Date>  liste_blue_search = new ArrayList<Date>();
    static  ArrayList<Date>  liste_green_search = new ArrayList<Date>();
    static  ArrayList<Date>  liste_black_search = new ArrayList<Date>();


    public  void main() {


        ArrayList<Date> liste_gold = new ArrayList<Date>();
        ArrayList<Date> liste_blue = new ArrayList<Date>();
        ArrayList<Date> liste_black = new ArrayList<Date>();
        ArrayList<Date> liste_green = new ArrayList<Date>();


        liste_gold_add(liste_gold);
        liste_gold_search(liste_gold);
        liste_blue_add(liste_blue);
        liste_blue_search(liste_blue);
        liste_black_add(liste_black);
        liste_black_search(liste_black);
        liste_green_add(liste_green);
        liste_green_search(liste_green);

    }
    public   ArrayList<Date> liste_gold_add (ArrayList<Date> arrayList ){

        arrayList.add(new Date(115,2,24,7,0,0));
        arrayList.add(new Date(115,3,23,7,0,0));
        arrayList.add(new Date(115,4,21,7,0,0));
       arrayList.add(new Date(115,5,18,7,0,0));
       arrayList.add(new Date(115,6,16,7,0,0));
        arrayList.add(new Date(115,7,13,7,0,0));
        arrayList.add(new Date(115,8,10,7,0,0));
        arrayList.add(new Date(115,9,8,7,0,0));
        arrayList.add(new Date(115,10,5,7,0,0));
        arrayList.add(new Date(115,11,3,7,0,0));
        arrayList.add(new Date(115,11,31,7,0,0));
        return arrayList;
    }

    public  ArrayList<Date> liste_blue_add (ArrayList<Date> arrayList ){

        arrayList.add(new Date(115,2,24,7,0,0));
        arrayList.add(new Date(115,3,23,7,0,0));
        arrayList.add(new Date(115,4,21,7,0,0));
        arrayList.add(new Date(115,5,18,7,0,0));
        arrayList.add(new Date(115,6,16,7,0,0));
        arrayList.add(new Date(115,7,13,7,0,0));
        arrayList.add(new Date(115,8,10,7,0,0));
        arrayList.add(new Date(115,9,8,7,0,0));
        arrayList.add(new Date(115,10,5,7,0,0));
        arrayList.add(new Date(115,11,3,7,0,0));
        arrayList.add(new Date(115,11,31,7,0,0));
        return arrayList;
    }

    public  ArrayList<Date> liste_green_add (ArrayList<Date> arrayList ){
        arrayList.add(new Date(115,2,5,7,0,0));
        arrayList.add(new Date(115,2,20,7,0,0));
        arrayList.add(new Date(115,3,2,7,0,0));
        arrayList.add(new Date(115,3,17,7,0,0));
        arrayList.add(new Date(115,4,2,7,0,0));
        arrayList.add(new Date(115,4,16,7,0,0));
        arrayList.add(new Date(115,4,30,7,0,0));
        arrayList.add(new Date(115,5,12,7,0,0));
        arrayList.add(new Date(115,5,26,7,0,0));
        arrayList.add(new Date(115,6,10,7,0,0));
        arrayList.add(new Date(115,6,24,7,0,0));
        arrayList.add(new Date(115,7,7,7,0,0));
        arrayList.add(new Date(115,7,21,7,0,0));
        arrayList.add(new Date(115,8,4,7,0,0));
        arrayList.add(new Date(115,8,18,7,0,0));
        arrayList.add(new Date(115,9,2,7,0,0));
        arrayList.add(new Date(115,9,16,7,0,0));
        arrayList.add(new Date(115,9,30,7,0,0));
        arrayList.add(new Date(115,10,13,7,0,0));
        arrayList.add(new Date(115,10,27,7,0,0));
        arrayList.add(new Date(115,11,11,7,0,0));
        arrayList.add(new Date(115,11,24,7,0,0));

        return arrayList;
    }
    public  ArrayList<Date> liste_black_add (ArrayList<Date> arrayList ){

        arrayList.add(new Date(115,2,13,7,0,0));
        arrayList.add(new Date(115,2,27,7,0,0));
        arrayList.add(new Date(115,3,11,7,0,0));
        arrayList.add(new Date(115,3,24,7,0,0));
        arrayList.add(new Date(115,4,8,7,0,0));
        arrayList.add(new Date(115,4,22,7,0,0));
        arrayList.add(new Date(115,5,6,7,0,0));
        arrayList.add(new Date(115,5,19,7,0,0));
        arrayList.add(new Date(115,6,3,7,0,0));
        arrayList.add(new Date(115,6,17,7,0,0));
        arrayList.add(new Date(115,6,31,7,0,0));
        arrayList.add(new Date(115,7,14,7,0,0));
        arrayList.add(new Date(115,7,28,7,0,0));
        arrayList.add(new Date(115,8,11,7,0,0));
        arrayList.add(new Date(115,8,25,7,0,0));
        arrayList.add(new Date(115,9,9,7,0,0));
        arrayList.add(new Date(115,9,23,7,0,0));
        arrayList.add(new Date(115,10,6,7,0,0));
        arrayList.add(new Date(115,10,20,7,0,0));
        arrayList.add(new Date(115,11,4,7,0,0));
        arrayList.add(new Date(115,11,18,7,0,0));
        return arrayList;
    }


    public  ArrayList<Date> liste_gold_search (ArrayList<Date> arrayList ){
        Date cuurentTime = new Date();
      //  liste_gold_String.add( "Gelbe Tonne :");
        for(Date ausgabe : arrayList) {
            if (cuurentTime.getMonth() == ausgabe.getMonth() )
                if (  ausgabe.after(cuurentTime))
               {
              // System.out.println(format1.format(ausgabe));
              //  SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy ");
                //   String sDate = sdf.format(new Date(System.currentTimeMillis()));
                    SimpleDateFormat sdf = new SimpleDateFormat("d  MMMM, EEEE");
                String sDate = sdf.format(ausgabe);
                liste_gold_String.add(sDate);
                liste_gold_search.add(ausgabe);



    }


}
      //  System.out.println( "yellow  :"+ liste_gold_search.toString());
    return liste_gold_search;
   }

    public  ArrayList<Date> liste_blue_search (ArrayList<Date> arrayList ){
        Date cuurentTime = new Date();
     //   liste_blue_String.add( "Blaue Tonne :");

        for(Date ausgabe : arrayList) {
            if (cuurentTime.getMonth() == ausgabe.getMonth() )
                if (  ausgabe.after(cuurentTime)) {
              //  SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy ");
                    SimpleDateFormat sdf = new SimpleDateFormat("d  MMMM, EEEE");
                String sDate = sdf.format(ausgabe);
                liste_blue_String.add(sDate);
                liste_blue_search.add(ausgabe);


            }

        }
      //  System.out.println ("blue  :" +liste_blue_search.toString());
        return liste_blue_search;
    }

    public  ArrayList<Date> liste_green_search (ArrayList<Date> arrayList ) {
        Date cuurentTime = new Date();

      //  liste_green_String.add( "Grüne Tonne :");

        for (Date ausgabe : arrayList) {
            if (cuurentTime.getMonth() == ausgabe.getMonth() )
                if (  ausgabe.after(cuurentTime)) {

               // SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy ");
                    SimpleDateFormat sdf = new SimpleDateFormat("d  MMMM, EEEE");
                String sDate = sdf.format(ausgabe);
                liste_green_String.add(sDate);
                liste_green_search.add(ausgabe);


            }

        }
      //  System.out.println("green  :" + liste_green_search.toString());
        return liste_green_search;
    }
    public  ArrayList<Date> liste_black_search (ArrayList<Date> arrayList ) {
        Date cuurentTime = new Date();

      //  liste_black_String.add( "Schwarze Tonne :");

        for (Date ausgabe : arrayList) {
            if (cuurentTime.getMonth() == ausgabe.getMonth() )
                if (  ausgabe.after(cuurentTime)) {

              //  SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy ");
              SimpleDateFormat sdf = new SimpleDateFormat("d  MMMM, EEEE");
               // DateFormat sdf;

              // sdf =  DateFormat.getDateInstance(DateFormat.FULL);
                String sDate = sdf.format(ausgabe);
                liste_black_String.add(sDate);
                liste_black_search.add(ausgabe);


            }

        }
       // System.out.println("black  :" + liste_black_search.toString());
        return liste_black_search;
    }






        }





