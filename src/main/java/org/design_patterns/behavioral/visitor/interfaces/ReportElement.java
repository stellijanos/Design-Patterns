package org.design_patterns.behavioral.visitor.interfaces;

public interface ReportElement {
    <R> R acceot(ReportVisitor<R> visitor);
}
