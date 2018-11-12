package com.planetmars23.softmedia.myrecyclerview;

import java.util.ArrayList;

public class PresidentDatas {
    public static String data[][] = new String[][]{
            {"Imam Afriyadi", "Anak Ke-1 Pasangan Artadi-Sriani", "https://s3-ap-southeast-1.amazonaws.com/ikehikeh/Imam+Afriyadi.jpg"},
            {"Selvia Andriani", "Anak Ke-2 Pasangan Artadi-Sriani", "https://s3-ap-southeast-1.amazonaws.com/ikehikeh/Selvia+Andriani.jpg"},
            {"Arya Tri Setyadi", "Anak Ke-3 Pasangan Artadi-Sriani", "https://s3-ap-southeast-1.amazonaws.com/ikehikeh/ARYA+TRI+SETYADI.jpg"},
            {"Ari Ardiansyah", "Anak Ke-4 Pasangan Artadi-Sriani", "https://s3-ap-southeast-1.amazonaws.com/ikehikeh/Ari_Ardiansyah.jpg"}
    };

    public static ArrayList<President> getListData()
    {
        President okeh = null;
        ArrayList<President> list = new ArrayList<>();

        for (int i=0; i<data.length; i++)
        {
            okeh = new President();
            okeh.setNama(data[i][0]);
            okeh.setRemarks(data[i][1]);
            okeh.setPhoto(data[i][2]);

            list.add(okeh);
        }

        return list;
    };
}