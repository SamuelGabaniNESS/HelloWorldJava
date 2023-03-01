package com.academy;

public class Srotovisko {
    public void zosrotuj(Vozidlo v){
        if(v instanceof Auto){
            v.describe();
        }
        v.zosrotujMa();
    }
}
