public class BonusMilesService {
    public int calculate(int price) {
        int bonusRUB = 20;
        int miles = price / bonusRUB;
        return miles;
    }
}
