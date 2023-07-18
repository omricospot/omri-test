package org.example.models;

import java.util.Date;

public class BlScheduledPreventiveReplacement {
    //region Members
    private String            groupId;
    private BlReplacementData data;
    private MarketKey         lastReplacedMarket;
    private Date              createdAt;
    //endregion

    //region Getters & Setters
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public BlReplacementData getData() {
        return data;
    }

    public void setData(BlReplacementData data) {
        this.data = data;
    }

    public MarketKey getLastReplacedMarket() {
        return lastReplacedMarket;
    }

    public void setLastReplacedMarket(MarketKey lastReplacedMarket) {
        this.lastReplacedMarket = lastReplacedMarket;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    //endregion
}
