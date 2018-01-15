package com.sample.autovalue.model;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

/**
 * Created by sachit on 15/01/18.
 */

@AutoValue
public abstract class Address implements Parcelable{

    abstract String city();

    abstract String street();

    public static Address create(String city, String street) {
        return builder().city(city).street(street).build();
    }

    public static Builder builder() {
        return new AutoValue_Address.Builder();
    }

    @AutoValue.Builder
    public interface Builder {

        Builder city(String city);

        Builder street(String street);

        Address build();
    }

}
