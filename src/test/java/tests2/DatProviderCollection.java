package tests2;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class DatProviderCollection {




    @DataProvider(name = "usernamePassCombo")
    public Object[][] getData() {

        return new Object[][]{
                {"afa", "dfkfd"},
                {"amina", "djsf"},
                {"majd", "dsijfdf"},
                {"lara", "djkdkd"}
        };
    }

    @DataProvider(name = "usernamePassComboRandom")
    public Object[][] getData2() {

        Faker fake = new Faker();
        return new Object[][]{{"afa", "dfkfd"},
                {fake.name().username(),fake.internet().password()},
                {fake.name().username(),fake.internet().password()},
                {fake.name().username(),fake.internet().password()},
                {fake.name().username(),fake.internet().password()}
        };
    }

}
