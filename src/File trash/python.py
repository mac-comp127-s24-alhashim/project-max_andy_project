from bs4 import BeautifulSoup
from selenium import webdriver

# USD to EURpython3 -m pip
usdToEurDr = webdriver.Chrome()
usdToEurDr.get("https://www.oanda.com/currency-converter/en/?from=USD&to=EUR&amount=1")
usdToEurSoup = BeautifulSoup(usdToEurDr.page_source,"lxml")
usdToEurBox = usdToEurSoup.find_all('div', class_='MuiInputBase-root MuiFilledInput-root MuiFilledInput-underline MuiInputBase-fullWidth MuiInputBase-formControl')[1]
usdToEurList = list(str(usdToEurBox))
del usdToEurList[:272]
del usdToEurList[7:]
usdToEur = ''.join(usdToEurList)
print(usdToEur)

# USD to KRW
usdToKrwDr = webdriver.Chrome()
usdToKrwDr.get("https://www.oanda.com/currency-converter/en/?from=USD&to=KRW&amount=1")
usdToKrwSoup = BeautifulSoup(usdToKrwDr.page_source,"lxml")
usdToKrwBox = usdToKrwSoup.find_all('div', class_='MuiInputBase-root MuiFilledInput-root MuiFilledInput-underline MuiInputBase-fullWidth MuiInputBase-formControl')[1]
usdToKrwList = list(str(usdToKrwBox))
del usdToKrwList[:272]
del usdToKrwList[8:]
usdToKrw = ''.join(usdToKrwList)
print(usdToKrw)

# USD to CNY
usdToCnyDr = webdriver.Chrome()
usdToCnyDr.get("https://www.oanda.com/currency-converter/en/?from=USD&to=CNY&amount=1")
usdToCnySoup = BeautifulSoup(usdToCnyDr.page_source,"lxml")
usdToCnyBox = usdToCnySoup.find_all('div', class_='MuiInputBase-root MuiFilledInput-root MuiFilledInput-underline MuiInputBase-fullWidth MuiInputBase-formControl')
usdToCnyList = list(str(usdToCnyBox))
del usdToCnyList[:272]
del usdToCnyList[7:]
usdToCny = ''.join(usdToCnyList)
print(usdToCny)

# EUR to KRW
eurToKrwDr = webdriver.Chrome()
eurToKrwDr.get("https://www.oanda.com/currency-converter/en/?from=EUR&to=KRW&amount=1")
eurToKrwSoup = BeautifulSoup(eurToKrwDr.page_source,"lxml")
eurToKrwBox = eurToKrwSoup.find_all('div', class_='MuiInputBase-root MuiFilledInput-root MuiFilledInput-underline MuiInputBase-fullWidth MuiInputBase-formControl')[1]
# FIGURE OUT ISSUE^^^^^
eurToKrwList = list(str(eurToKrwBox))
del eurToKrwList[:272]
del eurToKrwList[8:]
eurToKrw = ''.join(eurToKrwList)
print(eurToKrw)

# EUR to CNY
eurToCnyDr = webdriver.Chrome()
eurToCnyDr.get("https://www.oanda.com/currency-converter/en/?from=EUR&to=CNY&amount=1")
eurToCnySoup = BeautifulSoup(eurToCnyDr.page_source,"lxml")
eurToCnyBox = eurToCnySoup.find_all('div', class_='MuiInputBase-root MuiFilledInput-root MuiFilledInput-underline MuiInputBase-fullWidth MuiInputBase-formControl')[1]
eurToCnyList = list(str(eurToCnyBox))
del eurToCnyList[:272]
del eurToCnyList[7:]
eurToCny = ''.join(eurToCnyList)
print(eurToCny)

# KRW to CNY
krwToCnyDr = webdriver.Chrome()
krwToCnyDr.get("https://www.oanda.com/currency-converter/en/?from=KRW&to=CNY&amount=1")
krwToCnySoup = BeautifulSoup(krwToCnyDr.page_source,"lxml")
krwToCnyBox = krwToCnySoup.find_all('div', class_='MuiInputBase-root MuiFilledInput-root MuiFilledInput-underline MuiInputBase-fullWidth MuiInputBase-formControl')[1]
krwToCnyList = list(str(krwToCnyBox))
del krwToCnyList[:272]
del krwToCnyList[7:]
krwToCny = ''.join(krwToCnyList)
print(krwToCny)