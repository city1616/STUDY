import numpy as np
import matplotlib.image as imgg
from PIL import Image as img

path = "/Users/seungwoomun/Documents/Study/Python/testData/"
path2 = "/Users/seungwoomun/Documents/Study/Python/"
trainData = np.zeros((20*16, 7))
meanData = np.zeros((20*16, 5))

for i in range(0, 5):
    for j in range(1, 7):
        fn = path + "digit%d_%d.bmp" % (i, j)
        #fn = 'digit%d_%d.bmp' %(i, j)
        xi = img.open(fn)
        xi.save('digit%d_%d.png' %(i, j), 'png')
        xii = imgg.imread(path2 + 'digit%d_%d.png' %(i, j))
        x = xii[:, :, ].reshape(16*20)/255
        trainData[:, j] = x
    meanData[:, i] = np.mean(trainData, 1)

k = input("파일명을 입력하세요 : ")
fn = path2 + k
x = imgg.imread(fn)
data = x[:, :, ].reshape(16*20)/255

distArray = []

for i in range(0, 5, 1):
    dist = np.linalg.norm(meanData[:, i] - data)
    distArray.append(dist)

minVal = distArray.index(min(distArray))

print("입력한 데이터는 %d 입니다." % (minVal))