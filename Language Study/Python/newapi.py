# news api 사용

# apiKey=b5f1f1d799f6450395d37830c518fb5b
import requests
# import json
from collections import defaultdict

url = ('http://newsapi.org/v2/top-headlines?'
       'country=us&'
       'apiKey=b5f1f1d799f6450395d37830c518fb5b')
response = requests.get(url)
new = response.json()
articles = new['articles']
print("status : " + new['status'])
print("totalResults : ", new['totalResults'])
for i in range(len(articles)) :
	print(i + 1, ":", articles[i]['author'])

# info = json.loads(response)
# print("User count : ", len(info))
for i in range(len(articles)) :
	print(i + 1, ":", articles[i]['title'])
# print("author : ", articles[author])
# print(totalResults)
# response_author = requests.get(url=author)
# print response.json()
# print(response.json())
# print(response.json('text'))
# print(response.articles.source)