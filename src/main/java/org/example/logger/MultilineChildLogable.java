package org.example.logger;

public class MultilineChildLogable implements ChildLogable {

    final ChildLogable[] childs;

    public MultilineChildLogable(ChildLogable[] childs) {
        this.childs = childs;
    }

    @Override
    public void onLog(Logger logger) {
        for (int i = 0; i < childs.length; i++) {
            logger.log(childs[i]);
        }
    }
}
