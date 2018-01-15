package com.sample.autovalue.model;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

import java.util.List;

/**
 * Created by sachit on 15/01/18.
 */

@AutoValue
public abstract class EmployeeData implements Parcelable{

    public abstract String name();
    public abstract long id();
    public abstract boolean status();
    public abstract List<Address> address();

    public static EmployeeData create(long id, String name, boolean status, List<Address> address) {
        return builder().name(name).id(id).status(status).address(address).build();
    }

    @AutoValue.Builder
    public interface Builder {

        Builder id(long value);

        Builder name(String value);

        Builder status(boolean value);

        Builder address(List<Address> address);

        EmployeeData build();

    }

    public static Builder builder() {
        return new AutoValue_EmployeeData.Builder();
    }


}
