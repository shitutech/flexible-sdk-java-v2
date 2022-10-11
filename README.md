# V2版本接口测试样例

```java
package com.shitu;

import com.alibaba.fastjson.JSON;
import com.shitu.api.ClientConfig;
import com.shitu.api.DefaultSdkClient;
import com.shitu.api.ResponseVO;
import com.shitu.api.SdkClient;
import com.shitu.api.constants.BusType;
import com.shitu.api.constants.PayPass;
import com.shitu.api.model.*;
import com.shitu.api.request.*;
import com.shitu.api.response.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**

* @author andrew
* @date 2021-10-27 6:52 PM
 */
public class TestApi {

    private final Logger logger = LoggerFactory.getLogger(TestApi.class);

    private static final String MERCHANT_NO = "AXXXXX-XXXXXX-XXXXXX";
    private static final String PROVIDER_NO = "SXXXXX";
    private static final String PRODUCT_NO = "PXXXXXXXX";
    private static final String PRIVATE_KEY = "MIIEvQI*****=";
    private static final String SYSTEM_PUBLIC_KEY = "MIIBI*********QAB";

    private ClientConfig getClientConfig() throws Exception {
        return new ClientConfig(MERCHANT_NO,
                PROVIDER_NO,
                PRODUCT_NO,
                TASK_CODE,
                PRIVATE_KEY,
                SYSTEM_PUBLIC_KEY);
    }

    private SdkClient sdkClient() throws Exception {
        return new DefaultSdkClient(getClientConfig());
    }

    @Test
    public void testRegister() throws Exception {
        RegisterModel bizModel = RegisterModel.Builder.builder()
                .phone("182********")
                .providerNo(getClientConfig().getProviderNo())
                .name("小王")
                .idCard("******************")
                .busType(BusType.ENTRUSTED_COLLECTED.getType())
                .build();
        RegisterRequest request = new RegisterRequest(bizModel);
        request.setFrontImg(new File("/**/id_card_front.jpeg"));
        request.setBgImg(new File("/**/id_card_back.jpeg"));
        ResponseVO<RegisterResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testQuerySystemIdByIdCard() throws Exception {
        GetSystemIdModel bizModel = GetSystemIdModel.Builder.builder()
                .idCard("*****************")
                .type("3")
                .build();
        GetSystemIdRequest request = new GetSystemIdRequest(bizModel);
        ResponseVO<GetSystemIdResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testQuerySystemIdByMemberId() throws Exception {
        GetSystemIdModel bizModel = GetSystemIdModel.Builder.builder()
                .type(BusType.ENTRUSTED_COLLECTED.getType())
                .memberId("148************321")
                .type("4")
                .build();
        GetSystemIdRequest request = new GetSystemIdRequest(bizModel);
        ResponseVO<GetSystemIdResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testAcctQuery() throws Exception {
        QueryAcctModel bizModel = QueryAcctModel.Builder.builder()
                .payPass(PayPass.ZHAO_SHANG)
                .systemId("1448************273")
                .build();
        QueryAcctRequest request = new QueryAcctRequest(bizModel);
        ResponseVO<QueryAcctResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testQuerySupporttedBankList() throws Exception {
        GetSupportBankModel bizModel = GetSupportBankModel.Builder.builder().payPass(PayPass.ZHAO_SHANG)
                .build();
        GetSupportBankRequest request = new GetSupportBankRequest(bizModel);
        ResponseVO<GetSupportBankResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testQueryMemberBankCards() throws Exception {
        QueryBankCardListModel bizModel = QueryBankCardListModel.Builder.builder().systemId("1448************273")
                .build();
        QueryBankCardListRequest request = new QueryBankCardListRequest(bizModel);
        ResponseVO<QueryBankCardListResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testUpdateSettlementCard() throws Exception {
        UpdateSettlementCardModel bizModel = UpdateSettlementCardModel.Builder
                .builder()
                .systemId("1448**************273")
                .bankPhone("182*******0")
                .payPass(PayPass.ZHAO_SHANG)
                .cardNo("62**********50")
                .bankNo("325290000012")
                .build();
        UpdateSettlementCardRequest request = new UpdateSettlementCardRequest(bizModel);
        // request.setImgBank(new File("/Users/andrew/Pictures/face.jpeg"));
        final ResponseVO<UpdateSettlementCardResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testQueryMerchant() throws Exception {
        QueryAccountInfoModel bizModel = QueryAccountInfoModel.Builder
                .builder()
                .accountType("2")
                .providerNo("")
                .payPass(PayPass.ZHAO_SHANG)
                .build();
        final QueryAcctInfoRequest request = new QueryAcctInfoRequest(bizModel);
        final ResponseVO<QueryAcctInfoResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testOrderPay() throws Exception {
        PayInfoDetail pa = PayInfoDetail.Builder.builder()
                .idCard("******************")
                .name("小王")
                .fee("10.00")
                .systemId("1448*********273")
                .build();
        List<PayInfoDetail> details = new ArrayList<>();
        details.add(pa);
        OrderPayModel bizModel = OrderPayModel.Builder
                .builder()
                .accountType("2")
                .batchOrderNo("20221011-**********")
                .productCode(getClientConfig().getProductNo())
                .taskCode(getClientConfig().getTaskCode())
                .providerNo(getClientConfig().getProviderNo())
                .payPass(PayPass.ZHAO_SHANG)
                .costUndertaker("2")
                .isDefaultCard("1")
                .isCustom("1")
                .payList(details)
                .build();
        OrderPayRequest request = new OrderPayRequest(bizModel);
        final ResponseVO<OrderPayResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }


    @Test
    public void testOrderQuery() throws Exception {
        QueryOrderModel bizModel = QueryOrderModel.Builder.builder()
                .batchOrderNo("20221011-**********")
                .batchOrderId("PM****-**********")
                .isCustom("1")
                .build();
        OrderQueryRequest request = new OrderQueryRequest(bizModel);
        ResponseVO<OrderQueryResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testSubOrderQuery() throws Exception {
        SubOrderQueryModel bizModel = SubOrderQueryModel.Builder
                .builder()
                .orderNo("TM**************************")
                .batchOrderNo("20221011-************")
                .isCustom("1")
                .build();
        final SubOrderQueryRequest request = new SubOrderQueryRequest(bizModel);
        final ResponseVO<SubOrderQueryResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testQueryAcctList() throws Exception {
        QueryAcctListModel bizModel = QueryAcctListModel.Builder
                .builder()
                .payPass(PayPass.ZHAO_SHANG)
                .providerNo(PROVIDER_NO)
                .build();
        final QueryAcctListRequest request = new QueryAcctListRequest(bizModel);
        final ResponseVO<QueryAcctListResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }
}

```
