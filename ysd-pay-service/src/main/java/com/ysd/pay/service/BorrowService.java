package com.ysd.pay.service;

import java.util.List;

/**
 * Created by yujian on 2017/9/15.
 */
public interface BorrowService {
    /**
     * 建标
     * @param orderNo
     * @return
     */
    String createBorrow(String orderNo);

    /**
     * 标的放款,上传文件并且调用后台接口
     * @param borrowId
     * @return
     */
    boolean releaseBorrow(String orderNo, Integer borrowId);

    /**
     * 投资人投标
     * @param investUserId
     * 投资人
     * @param borrowId
     * 标的
     * @return
     */
    boolean investBorrow(String orderNo, Integer investUserId, Integer borrowId);


    /**
     * 投资人投标撤销
     * @param investUserId
     * @param borrowId
     * @return
     */
    boolean cancelInvestBorrow(String orderNo, Integer investUserId, Integer borrowId);


    /**
     * 投资人投标撤销
     * @param investUserIdList
     * 需要批量撤销的投资人id
     * @return
     */
    boolean batchCancelInvestBorrow(String orderNo, List<Integer> investUserIdList, Integer borrowId);

    /**
     * 还款
     * @param borrowRepaymentDetailId
     * 本次还款明细
     * @param borrowId
     * @return
     */
    boolean repaymentBorrow(String orderNo, Integer borrowRepaymentDetailId, Integer borrowId);

}
