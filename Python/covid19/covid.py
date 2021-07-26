# import numpy as np
# import pandas as pd

# import os

# for dirname, _, filenames in os.walk('./coronavirusdataset'):
# 	for filename in filenames:
# 		print(os.path.join(dirname. filename))
# 		# print(dirname)
# 		# print(filename)

import time
import random
from math import *
import operator
import pandas as pd
import numpy as np
import datetime as dt

import matplotlib as mpl
import matplotlib.pyplot as plt

# %matplotlib inline

import warnings
warnings.filterwarnings('ignore')

import seaborn as sns
sns.set(rc = {'figure.figsize' : (12, 7)})
sns.set(style = 'white')

patient = pd.read_csv('./coronavirusdataset/PatientInfo.csv')
route = pd.read_csv('./coronavirusdataset/PatientRoute.csv')
time_series = pd.read_csv('./coronavirusdataset/Time.csv')

print(patient.head())
print('\n')
print(patient.info())
print('\n')
print(route.head())
print('\n')
print(route.info())
print('\n')
print(time_series.head())
print('\n')
print(time_series.info())
print('\n')


column = ['sex', 'country', 'city', 'province', 'infection_case', 'infection_order', 'state']

for col in column:
	print(patient[col].value_counts())
	print('\n')

def show_values_on_bars(axs, h_v="v", space=0.4):
    def _show_on_single_plot(ax):
        if h_v == "v":
            for p in ax.patches:
                _x = p.get_x() + p.get_width() / 2
                _y = p.get_y() + p.get_height()
                value = int(p.get_height())
                ax.text(_x, _y, value, ha="center") 
        elif h_v == "h":
            for p in ax.patches:
                _x = p.get_x() + p.get_width() + float(space)
                _y = p.get_y() + p.get_height()
                value = int(p.get_width())
                ax.text(_x, _y, value, ha="left")

    if isinstance(axs, np.ndarray):
        for idx, ax in np.ndenumerate(axs):
            _show_on_single_plot(ax)
    else:
        _show_on_single_plot(axs)

plt.figure(figsize = (12, 7))
area = list(patient['province'].value_counts().sort_values(ascending = False).index)
region_data = patient.province.value_counts().rename_axis('province').reset_index(name = 'count')
sns.barplot(x = 'count', y = 'province', order = area, data = region_data, palette = sns.color_palette("pastel"))
show_values_on_bars(area, "h", 0.3)
plt.title('Province confirmed cases', fontsize = 15)
plt.show()

# sns.set(style = 'whitegrid')
# fig, ax = plt.subplots(figsize = (12, 7))
# ax.bar()
# ax = area.plot(kind = 'bar', title = "test", rot = 0)
# patient.plot(kind = 'bar')
# plt.show()

plt.figure(figsize = (12, 7))
sns.countplot(patient.confirmed_date, palette = sns.color_palette('pastel'), hue = patient.state)
plt.title('confirmed cases by date', fontsize = 15)
plt.show()

plt.figure(figsize = (12, 7))
sns.countplot(patient.state, palette = sns.color_palette('bright'))
plt.yscale('log')
plt.title('condition of reported cases', fontsize = 15)
plt.show()

plt.figure(figsize = (12, 7))
sns.countplot(patient.sex, palette = sns.color_palette('bright'), hue = patient.state)
plt.title('regionwise confirmed cases by gender', fontsize = 15)
plt.show()

plt.figure(figsize = (12, 7))
reason_list = list(patient.infection_case.value_counts().sort_values(ascending = False).index)
reason_data = patient.infection_case.value_counts().rename_axis('case').reset_index(name = 'count')
sns.barplot(x = 'count', y = 'case', order = reason_list, data = reason_data, palette = 'gist_gray')
plt.title('Case of Infection', fontsize = 15)
plt.show()


patient['age'] = 2020 - patient.birth_year

def age_grp(age):
	if age > 0:
		if age % 10 != 0:
			lower = int(floor(age / 10) * 10)
			upper = int(ceil(age / 10) * 10) - 1
			return '{}-{}'.format(lower, upper)
		else:
			lower = int(age)
			upper = int(age) + 9
			return '{}-{}'.format(lower, upper)
	else:
		return np.nan

patient['age_group'] = patient.age.apply(age_grp)

sns.set(rc = {'figure.figsize' : (20, 7)})
sns.set(style = 'white')
sns.countplot(patient.age.dropna().astype('int64'), orient = 'h', palette = 'viridis')
plt.title('Confirmed cases by age', fontsize = 15)
plt.show()

sns.set(rc = {'figure.figsize' : (20, 7)})
sns.set(style = 'white')
sns.countplot(patient.age_group.dropna().sort_values(ascending = True), orient = 'h', palette = 'viridis')
plt.title('Confirmed cases by age group', fontsize = 15)
plt.show()


# Parsing dates

patient.confirmed_date = pd.to_datetime(patient.confirmed_date)
patient.released_date = pd.to_datetime(patient.released_date)
patient.deceased_date = pd.to_datetime(patient.deceased_date)
# Extracting days to recovery and days to death
patient['days_to_recovery'] = abs((patient.released_date - patient.confirmed_date).dt.days)
patient['days_to_death'] = abs((patient.deceased_date - patient.confirmed_date).dt.days)
# Seperate dataframes for recovery and death data
data_recovery = patient.days_to_recovery.value_counts().sort_index().rename_axis('days_to_recovery').reset_index(name = 'Count')
data_death = patient.days_to_death.value_counts().sort_index().rename_axis('days_to_death').reset_index(name = 'Count')
# Changing the datatype of number of days to recovery and death
data_recovery.days_to_recovery = data_recovery.days_to_recovery.astype('int64').astype('object')
data_death.days_to_death = data_death.days_to_death.astype('int64').astype('object')
# Plotting the frequency of days to death
sns.barplot(x = 'days_to_recovery', y = 'Count', data = data_recovery, palette = 'viridis', orient = 'v')
plt.title('frequency of days taken for recovery', fontsize = 15)
plt.show()
# Plotting the frequency of days to death
sns.barplot(x = 'days_to_death', y = 'Count', data = data_death, palette = 'viridis', orient = 'v')
plt.title('frequency of days until death', fontsize = 15)
plt.show()

















