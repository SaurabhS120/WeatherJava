package org.example.logger;

public interface ListLoggerTransformer<ITEM_TYPE, CHILD_LOGGABLE_TYPE extends ChildLogable> {
    CHILD_LOGGABLE_TYPE transform(ITEM_TYPE item);
}
