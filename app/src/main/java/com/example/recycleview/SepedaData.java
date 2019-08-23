package com.example.recycleview;


import java.util.ArrayList;

public class SepedaData {
    public static String [][] data = new String[][]{
            {"SYSTEMSIX HI-MOD DURA-ACE DI2", "Cannondale","Road Bike","Systemsix","Race","The ALL-NEW SystemSix was created with one simple goal in mind - to be the fastest and most efficient UCI-legal road bike in the world. Its unique fully integrated design delivers more speed, in more situations, than any other bike on the market today. For race day fast. And everyday fast. It's the world's fastest bike. ", "https://www.cannondale.com/~/media/Images/Dorel/Products/Bikes/C11119M/Variants/C11119M3047/images/pewlmahzpguud2leedrb.ashx?mw=1000.jpg"},

            {"SYNAPSE CARBON DISC DURA-ACE","Cannondale","Road Bike", "Synapse","Endurance" ,"Light, smooth, fast and elegantly designed. The Synapse is the ultimate machine for full-gas, full-day exploits.", "https://www.cannondale.com/~/media/Images/Dorel/Products/Bikes/C12169M/Variants/C12169M1044/images/o48zew26qu4gfbvcgrtn.ashx?mw=1000.jpg"},

            {"TOPSTONE SORA","Cannondale","Road Bike","Topstone","All Road" ,"Pure gravel goodness. With its high-volume tires, confident rider position and sporty handling, Topstone is ready to smash out big miles on the backroads, explore routes less traveled, or smooth out the chop on your morning commute.", "https://www.cannondale.com/~/media/Images/Dorel/Products/Bikes/C15909M/Variants/C15909M50LG/images/rv2qmdzrrfcgqftuvyue.ashx?mw=1000.jpg"},

            {"CAADX 105","Cannondale","Road Bike","CAADX","Cyclocross", "SuperX geometry and CAAD12-inspired features make CAADX the perfect first cyclocross bike, back-up pit bike, versatile super-commuter or all-road adventurer.", "https://www.cannondale.com/~/media/Images/Dorel/Products/Bikes/C16309M/Variants/C16309M3046/images/utcxgafrctxlglzfenix.ashx?mw=1000.jpg"},

            {"SUPERSLICE RED ETAP","Cannondale","Road Bike","Superslice","Thriathlon", "Savagely fast, beautifully simple and intelligently progressive, the new SuperSlice is the weapon of choice for time-trial specialists and triathletes who want hyper-integrated speed, without all the fuss.", "https://www.cannondale.com/~/media/Images/Dorel/Products/Bikes/C18609M/Variants/C18609M8050/images/hvl94va0s7gioyrz6gjs.ashx?mw=1000.jpg"},
    };

    public  static ArrayList<Sepeda> getListData(){
        ArrayList<Sepeda> list = new ArrayList<>();
        for (String[] aData : data){
            Sepeda hero = new Sepeda();
            hero.setName(aData[0]);
            hero.setBrand(aData[1]);
            hero.setType(aData[2]);
            hero.setSeries(aData[3]);
            hero.setJenis(aData[4]);
            hero.setDeskripsi(aData[5]);
            hero.setPhoto(aData[6]);
            list.add(hero);
        }
        return list;
    }
}
