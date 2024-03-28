package org.design_patterns.behavioral.visitor;

import org.design_patterns.behavioral.visitor.interfaces.ReportElement;
import org.design_patterns.behavioral.visitor.interfaces.ReportVisitor;

public class TimeAndMaterialsContract implements ReportElement {
    long costPerHour;
    long hours;

    public TimeAndMaterialsContract(long costPerHour, long hours) {
        this.costPerHour = costPerHour;
        this.hours = hours;
    }

    @Override
    public <R> R acceot(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
