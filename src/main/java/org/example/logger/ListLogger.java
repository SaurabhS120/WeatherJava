package org.example.logger;

public class ListLogger<ITEM_TYPE, CHILD_LOGGABLE_TYPE extends ChildLogable> implements ChildLogable {
    ITEM_TYPE[] list;
    ListLoggerTransformer<ITEM_TYPE, CHILD_LOGGABLE_TYPE> transformer;

    public ListLogger(ITEM_TYPE[] list, ListLoggerTransformer<ITEM_TYPE, CHILD_LOGGABLE_TYPE> transformer) {
        this.list = list;
        this.transformer = transformer;
    }

    @Override
    public void onLog(Logger logger) {
        CHILD_LOGGABLE_TYPE child;
        for (ITEM_TYPE item : list) {
            child = transformer.transform(item);
            child.onLog(logger);
        }
    }
}
