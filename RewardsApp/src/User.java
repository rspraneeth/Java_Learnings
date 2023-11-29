public class User implements UserOperations{
    private int id;
    private String name;
    private String password;
    private int rewardPoints;

    public User(int id, String name, String password, int rewardPoints) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.rewardPoints = rewardPoints;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    @Override
    public int calculateRewardPoints(double amountSpent) {
        return (int) (amountSpent / 100);
    }

    @Override
    public boolean redeemPoints(int points) {
        if (rewardPoints >= points) {
            rewardPoints -= points;
            return true;
        } else {
            return false;
        }
    }
}
