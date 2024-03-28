package org.design_patterns.behavioral.visitor;

import org.design_patterns.behavioral.visitor.interfaces.ReportElement;
import org.design_patterns.behavioral.visitor.interfaces.ReportVisitor;

public class SupportContract implements ReportElement {

    long costPerMonth;

    public SupportContract(long costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    @Override
    public <R> R acceot(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
