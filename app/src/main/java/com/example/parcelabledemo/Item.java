package com.example.parcelabledemo;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {

    private Integer mId;
    private String mName;
    private Integer mLength;


    protected Item(Parcel in) {

        mLength = in.readInt();
        mName  = in.readString();
        mId = in.readInt();

    }

    public Item(Integer mLength, String mName, Integer mId) {
        this.mLength = mLength;
        this.mName = mName;
        this.mId = mId;
    }


    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    public Integer getRollno() {
        return mId;
    }

    public void setRollno(Integer rollno) {
        this.mId = rollno;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public Integer getAge() {
        return mLength;
    }

    public void setAge(Integer age) {
        this.mLength = age;
    }



    public static Creator<Item> getCREATOR() {
        return CREATOR;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeInt(mLength);
        parcel.writeString(mName);
        parcel.writeInt(mId);


    }
}
