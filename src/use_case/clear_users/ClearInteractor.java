package use_case.clear_users;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(false, userDataAccessObject.getDeletedUsers());
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
