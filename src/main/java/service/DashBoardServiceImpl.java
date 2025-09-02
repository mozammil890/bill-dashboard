package service;

import repository.MainJavaRepo;
import entity.MainTable;
import org.springframework.stereotype.Service;
import utilities.SubmitSalesDataRequest;

@Service
public class DashBoardServiceImpl implements DashBoardService{


   private final  MainJavaRepo mainJavaRepo;

    public DashBoardServiceImpl(MainJavaRepo mainJavaRepo) {
        this.mainJavaRepo = mainJavaRepo;
    }

    @Override
    public void submitTotalSalesService(SubmitSalesDataRequest submitSalesDataRequest) {
        MainTable mainTable = new MainTable();
        mainTable.setAmount(submitSalesDataRequest.getAmount());
        mainTable.setDay(submitSalesDataRequest.getDay());
        mainTable.setDate(submitSalesDataRequest.getDate());
        mainJavaRepo.save(mainTable);
    }
}
