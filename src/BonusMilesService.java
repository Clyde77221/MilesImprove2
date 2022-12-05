public class BonusMilesService {
    public int calculate(int PriceForBonus) {
        int HowMatch = 20;
        int cost = PriceForBonus / HowMatch;
        return cost;
    }
}
