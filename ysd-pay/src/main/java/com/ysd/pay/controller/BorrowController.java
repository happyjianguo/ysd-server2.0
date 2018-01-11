package com.ysd.pay.controller;



import com.ysd.asset.exception.BorrowException;
import com.ysd.pay.exception.PayException;
import com.ysd.pay.service.BorrowService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 建标,投标Controller
 * Created by yujian on 2017/9/14.
 */
@Controller
public class BorrowController extends BaseController{

    private Logger log = LogManager.getLogger(RechargeController.class);
    private Logger paylogger = LogManager.getLogger("paylogger");

    @Autowired
    private BorrowService borrowService;


    /***建标*/
    @RequestMapping("/addProject")
    public ModelAndView addProject(HttpServletRequest request, HttpServletResponse respone) {

        printInfo(log,request);

        /*String borrowId = request.getParameter("borrowId");
        String borrowAmt = request.getParameter("borrowAmt");
        String borrowType = request.getParameter("borrowType");
        String borrCustId = request.getParameter("borrCustId");
        String validTime = request.getParameter("validTime");
        String investDateType = request.getParameter("investDateType");
        String investPeriod = request.getParameter("investPeriod");
        String name = request.getParameter("name");

        CbhbAddProjectReq req = new CbhbAddProjectReq();
        req.setBorrowId(borrowId );
        req.setBorrowTyp(borrowType);
        req.setBorrowerAmt(Double.parseDouble(borrowAmt));
        req.setBorrowerInterestAmt(8.0);
        req.setBorrCustId(borrCustId);
        req.setBorrowerStartDate(DateUtils.getNow());
        req.setBorrowerEndDate(DateUtils.rollDay(DateUtils.getNow(), Integer.parseInt(validTime) ));
        req.setBorrowerRepayDate(DateUtils.rollDay(DateUtils.getNow(), Integer.parseInt(investPeriod)));
        req.setInvestDateType(investDateType);
        req.setInvestPeriod(investPeriod);
        req.setBorrowerDetails("name");

        CbhbCreateBidModel model = (CbhbCreateBidModel) TppUtil.getInstance().tppAddProject(req);


        if(!model.validSign(model)){
            log.info("valid sign is false");
            return error();
        }

        if(!model.checkSuccess()){
            log.info("check is false");
            return error();
        }

        //建标
        paylogger.info("建标请求:{}",borrowId);
        String str = borrowService.createBorrow(borrowId);
        paylogger.info("建标返回:{}",str);

        */

        return success();
    }

    /**
     * 投标
     * @param orderNo
     * @param investUserId
     * @param borrowId
     * @return
     */
    @RequestMapping("borrow/invest")
    public ModelAndView investBorrow(String orderNo, Integer investUserId, Integer borrowId) {
        paylogger.info("投标的标id:{}, 投资人:{}", borrowId, investUserId);
        try {
            boolean b = borrowService.investBorrow(orderNo, investUserId, borrowId);
            if (b) {
                return success();
            } else {
                return error("投标失败");
            }
        } catch(PayException e) {
            log.error("投标失败1:相关参数:{}", e.getExceptionField(), e);
            return error(e.getMessage());
        } catch(BorrowException e) {
            log.error("投标失败2:相关参数:{}", e.getExceptionField(), e);
            return error(e.getMessage());
        } catch(Exception e) {
            log.error("投标失败2", e);
            return error("投标失败");
        }
    }

    /**
     * 投标撤销
     * @return
     */
    @RequestMapping("borrow/invest/cancel")
    public ModelAndView cancelInvestBorrow(String orderNo, Integer investUserId, Integer borrowId) {
        paylogger.info("投标撤销的标id:{}, 投资人:{}", borrowId, investUserId);
        try {
            boolean b = borrowService.cancelInvestBorrow(orderNo, investUserId, borrowId);
            if (b) {
                return success();
            } else {
                return error("投标撤销失败");
            }
        } catch(PayException e) {
            log.error("投标撤销失败1:相关参数:{}", e.getExceptionField(), e);
            return error(e.getMessage());
        } catch(BorrowException e) {
            log.error("投标撤销失败2:相关参数:{}", e.getExceptionField(), e);
            return error(e.getMessage());
        } catch(Exception e) {
            log.error("投标撤销失败2", e);
            return error("投标撤销失败");
        }
    }

    /**
     * 放款
     * @param borrowId
     * @return
     */
    @RequestMapping("borrow/release")
    public ModelAndView releaseBorrow(String orderNo, Integer borrowId) {
        paylogger.info("放款的标id:{}", borrowId);
        try {
            boolean b = borrowService.releaseBorrow(orderNo, borrowId);
            if (b) {
                return success();
            } else {
                return error("放款失败");
            }
        } catch(PayException e) {
            log.error("放款失败1:相关参数:{}", e.getExceptionField(), e);
            return error(e.getMessage());
        } catch(BorrowException e) {
            log.error("放款失败2:相关参数:{}", e.getExceptionField(), e);
            return error(e.getMessage());
        } catch(Exception e) {
            log.error("放款失败2", e);
            return error("放款失败");
        }
    }

    @RequestMapping("borrow/repayment")
    public ModelAndView repaymentBorrow(String orderNo, Integer borrowRepaymentDetailId, Integer borrowId) {
        paylogger.info("还款的标id:{}", borrowId);
        try {

            boolean b = borrowService.repaymentBorrow(orderNo, borrowRepaymentDetailId, borrowId);
            if (b) {
                return success();
            } else {
                return error("还款失败");
            }
        } catch(PayException e) {
            log.error("还款失败1:相关参数:{}", e.getExceptionField(), e);
            return error(e.getMessage());
        } catch(BorrowException e) {
            log.error("还款失败2:相关参数:{}", e.getExceptionField(), e);
            return error(e.getMessage());
        } catch(Exception e) {
            log.error("还款失败2", e);
            return error("还款失败");
        }
    }

}
