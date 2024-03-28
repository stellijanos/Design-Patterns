package org.design_patterns.behavioral.visitor;

import org.design_patterns.behavioral.visitor.interfaces.ReportElement;
import org.design_patterns.behavioral.visitor.interfaces.ReportVisitor;

public class FixedPriceContract implements ReportElement {
    long costPerYear;
    public FixedPriceContract(long costPerYear) {
        this.costPerYear = costPerYear;
    }

    @Override
    public <R> R acceot(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
