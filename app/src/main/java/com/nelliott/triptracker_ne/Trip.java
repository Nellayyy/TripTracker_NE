package com.nelliott.triptracker_ne;

import java.util.Date;

public class Trip implements IntentData {
    String mObjectId;
    static String mName;
    String mDescription;
    static Date mStartDate;
    Date mEndDate;

    public Boolean isShared() {
        return mShared; }

    public void setShared(Boolean shared) {
        mShared = shared; }

    Boolean mShared;

    public String getObjectId() {
        return mObjectId; }

    public void setObjectId(String objectId) {
        mObjectId = objectId; }

    public static String getName() {
        return mName; }

    public void setName(String name) {
        mName = name; }

    public String getDescription() {
        return mDescription; }

    public void setDescription(String description) {
        mDescription = description; }

    public static Date getStartDate() {
        return mStartDate; }

    public void setStartDate(Date startDate) {
        mStartDate = startDate; }

    public Date getEndDate() {
        return mEndDate; }

    public void setEndDate(Date endDate) {
        mEndDate = endDate; }
}

