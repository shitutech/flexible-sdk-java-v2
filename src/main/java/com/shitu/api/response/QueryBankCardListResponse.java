package com.shitu.api.response;

import java.io.Serializable;
import java.util.List;

public class QueryBankCardListResponse extends AbstractApiResponse {
    private List<BankCardDetail> memberCardList;

    public static final class BankCardDetail implements Serializable {
        private String payPass;
        private String izDefault;
        private String bankNo;
        private String bankName;
        private String cardNo;
        private String bankPhone;

        public String getPayPass() {
            return payPass;
        }

        public void setPayPass(String payPass) {
            this.payPass = payPass;
        }

        public String getIzDefault() {
            return izDefault;
        }

        public void setIzDefault(String izDefault) {
            this.izDefault = izDefault;
        }

        public String getBankNo() {
            return bankNo;
        }

        public void setBankNo(String bankNo) {
            this.bankNo = bankNo;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getCardNo() {
            return cardNo;
        }

        public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public String getBankPhone() {
            return bankPhone;
        }

        public void setBankPhone(String bankPhone) {
            this.bankPhone = bankPhone;
        }

        @Override
        public String toString() {
            return "BankCardDetail [payPass=" + payPass + ", izDefault=" + izDefault + ", bankNo=" + bankNo
                    + ", bankName=" + bankName + ", cardNo=" + cardNo + ", bankPhone=" + bankPhone + "]";
        }

    }

    public List<BankCardDetail> getMemberCardList() {
        return memberCardList;
    }

    public void setMemberCardList(List<BankCardDetail> memberCardList) {
        this.memberCardList = memberCardList;
    }

    @Override
    public String toString() {
        return "QueryBankCardListResponse [memberCardList=" + memberCardList + "]";
    }

}
