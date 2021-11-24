import java.util.Locale;

public class ListCountries {
    public static void main(String[] args) {
        String[] countries = Locale.getISOCountries();

        for(String countryCode: countries) {
            Locale locale = new Locale("", countryCode);

            System.out.println("Country Code: " + locale.getCountry() + " CountryName: " + locale.getDisplayCountry());
        }

        System.out.println(countries.length);
    }
}
