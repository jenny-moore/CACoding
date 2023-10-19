package interface_adapter.clear_users;

public class ClearState {
    private String[] deletedUsers = new String[0];
    private String error = null;
    public void setDeletedUsers(String[] users){
        this.deletedUsers = users;
    }
    public String[] getDeletedUsers(){
        return this.deletedUsers;
    }
    public void setError(String error) {
        this.error = error;
    }
    public String getError(){
        return this.error;
    }
}
