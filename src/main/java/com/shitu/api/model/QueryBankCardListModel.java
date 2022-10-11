package com.shitu.api.model;

import java.io.Serializable;

public class QueryBankCardListModel implements Serializable {
    private QueryBankCardListModel() {
    }

    private String systemId;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    @Override
    public String toString() {
        return "QueryBankCardListModel [systemId=" + systemId + "]";
    }

    public static final class Builder {
        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        private String systemId;

        public Builder systemId(String systemId) {
            this.systemId = systemId;
            return this;
        }

        public QueryBankCardListModel build() {
            QueryBankCardListModel bizModel = new QueryBankCardListModel();
            bizModel.setSystemId(systemId);
            return bizModel;
        }
    }

}
