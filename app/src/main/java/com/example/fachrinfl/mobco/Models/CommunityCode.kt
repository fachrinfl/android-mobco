package com.example.fachrinfl.mobco.Models

import android.os.Parcel
import android.os.Parcelable

class CommunityCode constructor(var community: String, var skill: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(community)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CommunityCode> {
        override fun createFromParcel(parcel: Parcel): CommunityCode {
            return CommunityCode(parcel)
        }

        override fun newArray(size: Int): Array<CommunityCode?> {
            return arrayOfNulls(size)
        }
    }

}