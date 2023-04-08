package org.example.logger;

import java.util.ArrayList;
import java.util.List;

public class ListLogger<ITEM_TYPE, CHILD_LOGGABLE_TYPE extends ChildLogable> implements ChildLogable {
    ITEM_TYPE[] list;
    ListLoggerTransformer<ITEM_TYPE, CHILD_LOGGABLE_TYPE> transformer;

    public ListLogger(ITEM_TYPE[] list, ListLoggerTransformer<ITEM_TYPE, CHILD_LOGGABLE_TYPE> transformer) {
        this.list = list;
        this.transformer = transformer;
    }

    public List<CHILD_LOGGABLE_TYPE> getChildLoggables() {
        List<CHILD_LOGGABLE_TYPE> childs = new ArrayList<CHILD_LOGGABLE_TYPE>();
        for (ITEM_TYPE item : list) {
            childs.add(transformer.transform(item));
        }
        return childs;
    }

    @Override
    public void onLog(Logger logger) {
        for (CHILD_LOGGABLE_TYPE child : getChildLoggables()) {
            child.onLog(logger);
        }
    }
}
