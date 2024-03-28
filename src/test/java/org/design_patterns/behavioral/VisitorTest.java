package org.design_patterns.behavioral;

import org.design_patterns.behavioral.visitor.*;
import org.design_patterns.behavioral.visitor.interfaces.ReportElement;
import org.junit.Test;

import java.util.List;

public class VisitorTest {

    @Test
    public void test() {
        FixedPriceContract projectAlpha = new FixedPriceContract(10000);
        SupportContract projectBeta = new SupportContract(500);
        TimeAndMaterialsContract projectGamma = new TimeAndMaterialsContract(150, 10);
        TimeAndMaterialsContract projectDelta = new TimeAndMaterialsContract(50, 50);
        List<ReportElement> projects = List.of(projectAlpha, projectBeta, projectDelta, projectGamma);

        MonthlyCostReportVisitor monthlyReport = new MonthlyCostReportVisitor();
        YearlyCostReportVisitor yearlyReport = new YearlyCostReportVisitor();

        long monthlyCost = 0;
        long yearlyCost = 0;

        for (ReportElement project: projects) {
            monthlyCost += project.acceot(monthlyReport);
            yearlyCost += project.acceot(yearlyReport);
        }

        System.out.println("Monthly cost is " + monthlyCost);
        System.out.println("Yearly cost is " + yearlyCost);

    }
}
