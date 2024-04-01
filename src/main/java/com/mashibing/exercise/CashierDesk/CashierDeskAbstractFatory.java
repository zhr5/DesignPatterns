package com.mashibing.exercise.CashierDesk;

import com.mashibing.exercise.CashierDesk.model.BasePrepayRequest;
import com.mashibing.exercise.CashierDesk.model.CashierPrepayResult;

public abstract class CashierDeskAbstractFatory {

    abstract CashierPrepayResult prepay(BasePrepayRequest basePrepayRequest);//预下单


}
