package com.example.tugaslist;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.tugaslist.model.Minuman;
import com.example.tugaslist.model.Makanan;
import com.example.tugaslist.model.Mkn_jepang;

public class DataProvider {
    private static List<Makanan> makanans = new ArrayList<>();

    private static List<Mkn_jepang> initDataMkn_jepang(Context ctx) {
        List<Mkn_jepang> mkn_jepangss = new ArrayList<>();
        mkn_jepangss.add(new Mkn_jepang("Makanan", "Harga",
                "susi Harga 12.000 yen", R.drawable.makanan1));
        mkn_jepangss.add(new Mkn_jepang("Makanan", "Harga",
                "Onigiri jepang Harga.16.00 yen", R.drawable.makanan2));
        mkn_jepangss.add(new Mkn_jepang("Makanan", "Harga",
                "Udon Jepang Harga. 30.000 yen", R.drawable.makanan3));
        mkn_jepangss.add(new Mkn_jepang("Makanan", "IHarga",
                "Dorayaki Jepang Harga. 50.000 yen", R.drawable.makanan4));
       mkn_jepangss.add(new Mkn_jepang("Makanan", "Harga",
                "Mochi Jepang Harga. 300.000 yen ", R.drawable.makanan5));
        mkn_jepangss.add(new Mkn_jepang("Makanan", "Haraga",
                "Yakiniku Jepang Harga. 70.000 yen ", R.drawable.makanan6));
        return mkn_jepangss;
    }

    private static List<Minuman> initDataMinuman(Context ctx) {
        List<Minuman> anjings = new ArrayList<>();
        anjings.add(new Minuman("Minuman", "Harga",
                "Genmaicha Harga. 20.000 yen", R.drawable.minuman1));
        anjings.add(new Minuman("Minuman", " Harga",
                " Uroncha (Oolong Tea) Harga. 30.000 yen", R.drawable.minuman2));
        anjings.add(new Minuman("Minuman", "Harga",
                "Aojiru Harga. 10.000 yen  ", R.drawable.minuman3));
        anjings.add(new Minuman("Minuman", "Harga",
                " Teh Sakura (Cherry Blossom Tea) Harga. 50.000 yen", R.drawable.minuman4));
        anjings.add(new Minuman("Minuman", "harga",
                "Royal Milk Tea Harga. 60.000 yen", R.drawable.minuman5));
        anjings.add(new Minuman("Minuman", "Harga",
                "Kombu-cha (Kelp Tea) Harga. 20.000 yen ", R.drawable.minuman6));
        return anjings;
    }

    private static void initAllMakanans(Context ctx) {
        makanans.addAll(initDataMkn_jepang(ctx));
        makanans.addAll(initDataMinuman(ctx));
    }

    public static List<Makanan> getAllHewan(Context ctx) {
        if (makanans.size() == 0) {
            initAllMakanans(ctx);
        }
        return  makanans;
    }

    public static List<Makanan> getHewansByTipe(Context ctx, String jenis) {
        List<Makanan> makanansByType = new ArrayList<>();
        if (makanans.size() == 0) {
            initAllMakanans(ctx);
        }
        for (Makanan h : makanans) {
            if (h.getJenis().equals(jenis)) {
                makanansByType.add(h);
            }
        }
        return makanansByType;
    }

}