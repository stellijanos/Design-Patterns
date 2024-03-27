package org.design_patterns.structural.adapter;

import org.design_patterns.structural.adapter.interfaces.DatabaseConverter;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdapter implements DatabaseConverter {
    @Override
    public List<DisplayData3rdParty> convertData(List<DatabaseData> data) {
        List<DisplayData3rdParty> returnList = new ArrayList<>();

        for (DatabaseData d: data) {
            float index = d.position;
            String position = Integer.toString(d.amount);

            DisplayData3rdParty dd = new DisplayData3rdParty(index, position);
            returnList.add(dd);
        }
        return returnList;
    }
}
