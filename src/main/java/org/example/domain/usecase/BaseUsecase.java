package org.example.domain.usecase;

public interface BaseUsecase<MODEL, USECASE_PARAMS extends BaseUsecaseParam> {
    MODEL invoke(USECASE_PARAMS params);
}
