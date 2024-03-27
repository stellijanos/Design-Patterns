package org.design_patterns.structural;

import org.design_patterns.structural.adapter.DatabaseDataGenerator;
import org.design_patterns.structural.adapter.DisplayData3rdParty;
import org.design_patterns.structural.adapter.DisplayDataAdapter;
import org.junit.Test;

import java.util.List;

public class AdapterTest {

    @Test
    public void test() {
        DatabaseDataGenerator gen = new DatabaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = adapter.convertData(gen.generateData());

        for (DisplayData3rdParty datum: legacyData) {
            datum.displayData();
        }
    }
}
