package day08_tasks;

public class PandemicChecker {
    public static void main(String[] args) {
        int yearToSearch = 1916;
//        String outcomeSearch = "sorry $given_year is not a valid year";
        if (yearToSearch < 2024 && 0 < yearToSearch) {
            System.out.println((yearToSearch >= 1346 && 1353 >= yearToSearch) ? "The Black Death" :
                (yearToSearch >= 1665 && 1666 >= yearToSearch) ? "Great Plague of London" :
                (yearToSearch >= 1770 && 1772 >= yearToSearch) ? "Russian plague" :
                (yearToSearch >= 1889 && 1890 >= yearToSearch) ? "Flu pandemic" :
                (yearToSearch == 1916) ? "American polio epidemic" :
                (yearToSearch >= 1918 && 1920 >= yearToSearch) ? "Spanish Flu" :
                (yearToSearch >= 2009 && 2010 >= yearToSearch) ? "H1N1 Swine Flu pandemic" :
                (yearToSearch >= 2014 && 2016 >= yearToSearch) ? "West African Ebola epidemic" :
                (yearToSearch >= 2020 && 2021 >= yearToSearch) ? "COVID-19" : "No Pandemic in $given_year");
        }else{
            System.out.println("sorry" + yearToSearch + "is not a valid year");
        }
    }
}

/*
    Pandemic Checker [nested if, operator]

        Create a program that will define a year. Determine if there was a pandemic in that year. Before checking for pandemics also verify the given year is a valid year value.
        a valid year is a year in the range of: 0 > year < 2023
        -> if the given year is not valid do not check anything else and print:
        sorry $given_year is not a valid year

        if a valid year is given check the ranges and output the pandemic if there was any

        Use this data for years that had a pandemic:
        1346-1353: The Black Death
        1665-1666: Great Plague of London
        1770-1772: Russian plague
        1889-1890: Flu pandemic
        1916: American polio epidemic
        1918-1920: Spanish Flu
        2009-2010: H1N1 Swine Flu pandemic
        2014-2016: West African Ebola epidemic
        2020-2021: COVID-19
        Any year not in those ranges: No Pandemic in $given_year
*/
