package org.design_patterns.structural.adapter.interfaces;

import org.design_patterns.structural.adapter.DatabaseData;
import org.design_patterns.structural.adapter.DisplayData3rdParty;

import java.util.List;

public interface DatabaseConverter {
    List<DisplayData3rdParty> convertData(List<DatabaseData> data);
}
