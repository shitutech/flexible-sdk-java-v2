package com.shitu.api.response;

import java.io.Serializable;
import java.util.List;

public class GetSupportBankResponse extends AbstractApiResponse {

    private List<SupporttedBank> bankList;

    public static final class SupporttedBank implements Serializable {
        private String value;
        private String text;
        private String title;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "SupporttedBank [value=" + value + ", text=" + text + ", title=" + title + "]";
        }
    }

    public List<SupporttedBank> getBankList() {
        return bankList;
    }

    public void setBankList(List<SupporttedBank> bankList) {
        this.bankList = bankList;
    }

    @Override
    public String toString() {
        return "GetSupportBankResponse [bankList=" + bankList + "]";
    }

}
