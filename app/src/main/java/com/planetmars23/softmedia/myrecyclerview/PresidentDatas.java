package com.planetmars23.softmedia.myrecyclerview;

import java.util.ArrayList;

public class PresidentDatas {
    public static String data[][] = new String[][]{
            {"Imam Afriyadi", "Anak Ke-1 Pasangan Artadi-Sriani", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Imam_Afriyadi.jpg/380px-Imam_Afriyadi.jpg"},
            {"Selvia Andriani", "Anak Ke-2 Pasangan Artadi-Sriani", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Selvia_Andriani.jpg/512px-Selvia_Andriani.jpg"},
            {"Arya Tri Setyadi", "Anak Ke-3 Pasangan Artadi-Sriani", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Arya_Tri_Setyadi.jpg/499px-Arya_Tri_Setyadi.jpg"},
            {"Ari Ardiansyah", "Anak Ke-4 Pasangan Artadi-Sriani", "https://upload.wikimedia.org/wikipedia/commons/c/c3/Ari_Ardiansyah.jpg"}
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