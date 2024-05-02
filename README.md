Title: Currency Exchanger

Max Chang & Andy Kim

Our program allows users to calculate currency exchange rates of their choice (from our list of 10 currencies). We implement data from https://www.x-rates.com/table/?from=USD&amount=1 using Jsoup to webscrape.

When the user inputs the starting currency and the ending currency, as well as the starting amount, they can press the "Exchange" button and the program will print the amount of money exchanged and the exchange rate for the two currencies mentioned.

For our classes, we have a CurrencyExchanger class, a JavaExchanger class, ValidCurrency class, CurrencyText class, and the Calculation class. The CurrencyExchanger method is for the User Interface, the ValidCurrency class is used to list the available currencies in out program, the JavaExchanger class is to find the exchange rates for different currencies, the CurrencyText class is to find out the current exchange rate, and the Calculation class is for the calculation of the exchanged amount of money in the program.

Our current list of currencies: USD, EUR, SGD, JPY, CNY, CAD, AUD, RUB, MXN, INR

This is the sketch for our project:
![image](https://github.com/mac-comp127-s24-alhashim/project-max_andy_project/assets/156822902/903bcafd-7f36-4ca4-b4a3-71249c6c3ca0)
