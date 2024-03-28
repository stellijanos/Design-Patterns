package org.design_patterns.behavioral.visitor.interfaces;

import org.design_patterns.behavioral.visitor.FixedPriceContract;
import org.design_patterns.behavioral.visitor.SupportContract;
import org.design_patterns.behavioral.visitor.TimeAndMaterialsContract;

public interface ReportVisitor<R> {
    R visit(FixedPriceContract contract);
    R visit(TimeAndMaterialsContract contract);
    R visit(SupportContract contract);
}
