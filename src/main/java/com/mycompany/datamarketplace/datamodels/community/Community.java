
package com.mycompany.datamarketplace.datamodels.community;
public class Community {
    
    String communityId;
    String communityName;

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    @Override
    public String toString(){
        return communityName;
    }
    
}
