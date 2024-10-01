package homework.hw11;

import java.util.Objects;

public class Coin implements Comparable<Coin> {

    private Integer nominal;
    private Double diametr;
    private String county;
    private Integer price;

    public Coin(Integer nominal, Double diametr, String county, Integer price) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.county = county;
        this.price = price;
    }

    public Coin() {
        super();
    }

    @Override
    public int compareTo(Coin o) {

        int priceComparison = Integer.compare(o.price, this.price);
        if (priceComparison != 0) {
            return priceComparison;
        }

        int nominalComparison = Integer.compare(o.nominal, this.nominal);
        if (nominalComparison != 0) {
            return nominalComparison;
        }

        int countryComparison = o.county.compareTo(this.county);
        if (countryComparison != 0) {
            return countryComparison;
        }
        return Double.compare(o.diametr, this.diametr);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return Objects.equals(nominal, coin.nominal) && Objects.equals(diametr, coin.diametr) && Objects.equals(county, coin.county) && Objects.equals(price, coin.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, diametr, county, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coin{");
        sb.append("nominal=").append(nominal);
        sb.append(", diametr=").append(diametr);
        sb.append(", county='").append(county).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }


}
