package com.example.lieberson.projetogsw.contract;

import android.content.Context;

import com.example.lieberson.projetogsw.model.Repository;

import java.util.List;

public class RepositoryContract {
    public interface Model {

        void getRepositories(Context context);
    }

    public interface View {
        Context getContext();

        void showRepositories(List<Repository> response);

        void showRepositorytError(Throwable t);

        void showProgress(Boolean show);
    }

    public interface Presenter {
        void attachView(View view);

        void detachView();

        void getAllRepositories();

        void showRepositories(List<Repository> repositories);

        void showRepositorytError(Throwable t);
    }
}








