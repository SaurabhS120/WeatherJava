package org.example.domain.model.usecase;

public interface BaseUsecase<UsecaseParams extends BaseUsecaseParams> {
    void invoke();
}
