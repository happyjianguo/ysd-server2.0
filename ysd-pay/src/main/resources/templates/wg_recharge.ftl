<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户充值页面</title>
</head>
<body>
<div align="center">充值页面跳转中，请不要关闭页面...</div>

<form id="frm1" name="frm1" action="${serverUrl}" method="post" style="display: none;">
    <input type="hidden" name="inputCharset" value="1"/>
    <input type="hidden" name="pickupUrl" value="${pickupUrl}"/>
    <input type="hidden" name="receiveUrl" value="${receiveUrl}" />
    <input type="hidden" name="version" value="v1.0"/>
    <input type="hidden" name="language" value="1" />
    <input type="hidden" name="signType" value="1"/>
    <input type="hidden" name="merchantId" value="${merchantId}" />
    <input type="hidden" name="payerName" value="${payerName}"/>
    <input type="hidden" name="payerEmail" value="${payerEmail}" />
    <input type="hidden" name="payerTelephone" value="${payerTelephone}" />
    <input type="hidden" name="payerIDCard" value="${payerIDCard}" />
    <input type="hidden" name="pid" value=""/>
    <input type="hidden" name="orderNo" value="${orderNo}" />
    <input type="hidden" name="orderAmount" value="${orderAmount}"/>
    <input type="hidden" name="orderCurrency" value="0" />
    <input type="hidden" name="orderDatetime" value="${orderDatetime}" />
    <input type="hidden" name="orderExpireDatetime" value="60"/>
    <input type="hidden" name="productName" value="用户充值" />
    <input type="hidden" name="productPrice" value="${productPrice}" />
    <input type="hidden" name="productNum" value="${productNum}"/>
    <input type="hidden" name="productId" value="recharge" />
    <input type="hidden" name="productDesc" value="用户充值" />
    <input type="hidden" name="ext1" value="" />
    <input type="hidden" name="ext2" value="" />
    <input type="hidden" name="payType" value="0" />
    <input type="hidden" name="issuerId" value="" />
    <input type="hidden" name="pan" value="" />
    <input type="hidden" name="tradeNature" value="${tradeNature}" />
    <input type="hidden" name="signMsg" value="${strSignMsg}" />

    <input type="submit" value="确认付款"/>
</form>

<script language="javascript">
    document.getElementById("frm1").submit();
</script>
</body>
</html>